package com.wanmendoza.restapi.resources;

import com.wanmendoza.restapi.exceptions.ClientNotFoundException;
import com.wanmendoza.restapi.models.Client;
import com.wanmendoza.restapi.models.Product;
import com.wanmendoza.restapi.repositories.ClientRepository;
import com.wanmendoza.restapi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductResource {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/producto")
    private List<Product> getAllProducts() {
        List<Product> result = productRepository.findAll();
        return result;
    }

    @GetMapping("/producto/{id}")
    public Product getSingleClient(@PathVariable long id) {
        Optional<Product> product = productRepository.findById(id);

        if (!product.isPresent())
            throw new ClientNotFoundException(String.format("Product %d not found", id));

        return product.get();
    }

    @DeleteMapping("/producto/{id}")
    public void deleteProduct(@PathVariable long id) {
        productRepository.deleteById(id);
    }


    @PostMapping("/producto")
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        Product savedProduct = productRepository.save(product);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedProduct.getId()).toUri();

        return ResponseEntity.created(location).body(savedProduct);

    }

    @PutMapping("/producto/{id}")
    public ResponseEntity<Object> updateProduct(@RequestBody Product product, @PathVariable long id) {

        Optional<Product> studentOptional = productRepository.findById(id);

        if (!studentOptional.isPresent())
            return ResponseEntity.notFound().build();

        product.setId(id);

        productRepository.save(product);

        return ResponseEntity.noContent().build();
    }
}

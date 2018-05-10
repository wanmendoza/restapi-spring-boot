package com.wanmendoza.restapi.resources;

import com.wanmendoza.restapi.exceptions.ClientNotFoundException;
import com.wanmendoza.restapi.models.Client;
import com.wanmendoza.restapi.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ClientResource {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/cliente")
    private List<Client> getAllClients() {
        List<Client> result = clientRepository.findAll();

        System.out.println(result);
        return result;
    }

    @GetMapping("/cliente/{id}")
    public Client getSingleClient(@PathVariable long id) {
        Optional<Client> client = clientRepository.findById(id);

        if (!client.isPresent())
            throw new ClientNotFoundException(String.format("Client %d not found", id));

        return client.get();
    }

    @DeleteMapping("/cliente/{id}")
    public void deleteClient(@PathVariable long id) {
        clientRepository.deleteById(id);
    }


    @PostMapping("/cliente")
    public ResponseEntity<Object> createStudent(@RequestBody Client client) {
        Client savedClient = clientRepository.save(client);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedClient.getId()).toUri();

        return ResponseEntity.created(location).body(savedClient);

    }

    @PutMapping("/cliente/{id}")
    public ResponseEntity<Object> updateStudent(@RequestBody Client client, @PathVariable long id) {

        Optional<Client> studentOptional = clientRepository.findById(id);

        if (!studentOptional.isPresent())
            return ResponseEntity.notFound().build();

        client.setId(id);

        clientRepository.save(client);

        return ResponseEntity.noContent().build();
    }


}

package com.wanmendoza.restapi.resources;

import com.wanmendoza.restapi.models.Client;
import com.wanmendoza.restapi.models.Invoice;
import com.wanmendoza.restapi.repositories.InvoiceRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
public class InvoiceResource
{
    @Autowired
    private InvoiceRepository invoiceRepository;

    @GetMapping("/factura")
    private List<Invoice> getAllInvoices() {
        List<Invoice> result = invoiceRepository.findAll();
        return result;
    }

    @PostMapping("/factura")
    public ResponseEntity<Object> createInvoice(@RequestBody Invoice invoice) {
        System.out.println(invoice.getClient());

        


//        Invoice savedInvoice = invoiceRepository.save(invoice);
//
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//                .buildAndExpand(savedInvoice.getInvoicePK().getInvoiceNumber()).toUri();
//
//        return ResponseEntity.created(location).body(savedInvoice);

        return null;
    }
}

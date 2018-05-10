package com.wanmendoza.restapi.resources;

import com.wanmendoza.restapi.models.Client;
import com.wanmendoza.restapi.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientResource {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/client")
    private List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}

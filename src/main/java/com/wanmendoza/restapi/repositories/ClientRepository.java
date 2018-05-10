package com.wanmendoza.restapi.repositories;

import com.wanmendoza.restapi.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

package com.wanmendoza.restapi.repositories;

import com.wanmendoza.restapi.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

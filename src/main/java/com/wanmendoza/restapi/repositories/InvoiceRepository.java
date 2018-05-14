package com.wanmendoza.restapi.repositories;

import com.wanmendoza.restapi.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    Page<Invoice> findByClientId(Long clientId, Pageable pageable);

}

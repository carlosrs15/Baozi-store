package com.baozi.store.baozi_store.repository;

import com.baozi.store.baozi_store.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

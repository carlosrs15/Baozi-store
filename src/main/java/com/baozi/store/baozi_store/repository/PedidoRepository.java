package com.baozi.store.baozi_store.repository;

import com.baozi.store.baozi_store.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
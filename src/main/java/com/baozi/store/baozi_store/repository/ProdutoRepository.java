package com.baozi.store.baozi_store.repository;

import com.baozi.store.baozi_store.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}

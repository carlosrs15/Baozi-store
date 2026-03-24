package com.baozi.store.baozi_store.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private LocalDate clienteDesde;

    public Cliente() {
    }

    public Cliente(Long id, String nome, LocalDate clienteDesde) {
        this.id = id;
        this.nome = nome;
        this.clienteDesde = clienteDesde;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getClienteDesde() {
        return clienteDesde;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClienteDesde(LocalDate clienteDesde) {
        this.clienteDesde = clienteDesde;
    }
}

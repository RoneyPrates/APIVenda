package com.example.apivenda.repository;

import com.example.apivenda.model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class ClienteRepository {
    @PersistenceContext(unitName = "HibernateMaven")
    private EntityManager em;

    public List<Cliente> listarCliente() {
        String jpql = "SELECT l FROM Venda l";
        return em.createQuery(jpql, Cliente.class).getResultList();
    }
}

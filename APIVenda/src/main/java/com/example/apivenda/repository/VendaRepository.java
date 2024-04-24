package com.example.apivenda.repository;

import com.example.apivenda.model.Venda;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class VendaRepository {
    @PersistenceContext(unitName = "HibernateMaven")
    private EntityManager em;

    public List<Venda> listarVenda() {
        String jpql = "SELECT l FROM Venda l";
        return em.createQuery(jpql, Venda.class).getResultList();
    }
}

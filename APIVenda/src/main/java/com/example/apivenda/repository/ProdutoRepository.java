package com.example.apivenda.repository;

import com.example.apivenda.model.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class ProdutoRepository {
    @PersistenceContext(unitName = "HibernateMaven")
    private EntityManager em;

    public List<Produto> listarProduto() {
        String jpql = "SELECT l FROM Venda l";
        return em.createQuery(jpql, Produto.class).getResultList();
    }
}

package com.example.apivenda.service;

import com.example.apivenda.model.Venda;
import com.example.apivenda.repository.VendaRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class VendaService {
    @Inject
    private VendaRepository vendaRepository;

    public List<Venda> listar (){
        return vendaRepository.listarVenda();
    }
    public void cadastrar(Venda venda) throws Exception {
        vendaRepository.listarVenda();
    }
}

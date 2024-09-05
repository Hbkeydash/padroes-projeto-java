package com.exemplo.padroes.facade;

import com.exemplo.padroes.model.Produto;
import com.exemplo.padroes.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoFacade {
    @Autowired
    private ProdutoService produtoService;

    public List<Produto> listarTodos() {
        return produtoService.listarTodos();
    }

    public Produto salvar(Produto produto) {
        return produtoService.salvar(produto);
    }

    public void deletar(Long id) {
        produtoService.deletar(id);
    }
}
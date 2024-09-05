package com.exemplo.padroes.controller;

import com.exemplo.padroes.facade.ProdutoFacade;
import com.exemplo.padroes.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoFacade produtoFacade;

    @GetMapping
    public List<Produto> listarTodos() {
        return produtoFacade.listarTodos();
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return produtoFacade.salvar(produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        produtoFacade.deletar(id);
    }
}
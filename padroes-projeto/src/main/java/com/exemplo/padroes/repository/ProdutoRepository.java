package com.exemplo.padroes.repository;

import com.exemplo.padroes.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
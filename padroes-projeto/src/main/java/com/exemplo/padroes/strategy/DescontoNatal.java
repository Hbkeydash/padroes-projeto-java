package com.exemplo.padroes.strategy;

public class DescontoNatal implements DescontoStrategy {
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.9; // 10% de desconto
    }
}
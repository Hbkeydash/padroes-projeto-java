package com.exemplo.padroes.strategy;

public class DescontoAnoNovo implements DescontoStrategy {
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.85; // 15% de desconto
    }
}
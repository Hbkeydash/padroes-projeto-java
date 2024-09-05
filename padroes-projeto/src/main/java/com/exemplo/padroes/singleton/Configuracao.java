package com.exemplo.padroes.singleton;

public class Configuracao {
    private static Configuracao instancia;

    private Configuracao() {
        // Configurações iniciais
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    // Métodos de configuração
}
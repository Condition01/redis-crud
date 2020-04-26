package br.com.training.redis.model;

public enum TipoPessoa {

    JURIDICA("juridica"),
    FISICA("fisica");

    public String tipoPessoa;

    TipoPessoa(String tipo){
        tipoPessoa = tipo;
    }

}

/*
NOME: EDUARDA STEFFEN
DATA: 25/02/2025
 */

package com.furb.model;

public class Passageiro {

    private String nome;
    private Integer idade;

    public Passageiro(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Float getTarifa() {
        return 5f;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}

package com.furb.model;

public class Estudante extends Passageiro {

    private String escola;

    public Estudante(String nome, Integer idade, String escola) {
        super(nome, idade);
        this.escola = escola;
    }

    @Override
    public Float getTarifa() {
        return super.getTarifa() / 2;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
}

package com.furb.model;

public class Idoso extends Passageiro {

    private String RG;

    public Idoso(String nome, Integer idade, String RG) {
        super(nome, idade);
        if(idade < 60) {
            throw new RuntimeException("Um idoso precisa ter mais que 60 anos");
        }
        this.RG = RG;
    }

    @Override
    public Float getTarifa() {
        return 0f;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
}

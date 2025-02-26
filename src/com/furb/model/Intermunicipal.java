package com.furb.model;

import java.time.LocalDate;

public class Intermunicipal extends Viagem {

    public Intermunicipal(String placaOnibus, String nomeMotorista, LocalDate dataViagem) {
        super(placaOnibus, nomeMotorista, dataViagem);
    }

    @Override
    public void addPassageiro(Passageiro passageiro) {
        if(super.getPassageiros().size() <= 45) {
            super.addPassageiro(passageiro);
        } else {
            throw new RuntimeException("Limite de passageiros excedido. (máximo 45 passageiros)");
        }
    }

    @Override
    public Float getValorTotal() {
        Float valorTotal = super.getValorTotal();
        valorTotal += super.getPassageiros().size() * 3.51f;
        return valorTotal;
    }
}

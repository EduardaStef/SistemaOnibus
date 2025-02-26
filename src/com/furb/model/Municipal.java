package com.furb.model;

import java.time.LocalDate;
import java.util.Date;

public class Municipal extends Viagem {

    public Municipal(String placaOnibus, String nomeMotorista, LocalDate dataViagem) {
        super(placaOnibus, nomeMotorista, dataViagem);
    }

    @Override
    public void addPassageiro(Passageiro passageiro) {
        if(super.getPassageiros().size() <= 65) {
            super.addPassageiro(passageiro);
        } else {
            throw new RuntimeException("Limite de passageiros excedido. (máximo 65 passageiros)");
        }
    }
}

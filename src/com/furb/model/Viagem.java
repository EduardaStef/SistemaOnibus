package com.furb.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Viagem {

    private String placaOnibus;
    private String nomeMotorista;
    private LocalDate dataViagem;
    private List<Passageiro> passageiros = new ArrayList<>();

    public Viagem(String placaOnibus, String nomeMotorista, LocalDate dataViagem) {
        this.placaOnibus = placaOnibus;
        this.nomeMotorista = nomeMotorista;
        this.dataViagem = dataViagem;
    }

    public void addPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public Float getValorTotal(){
        Float valorTotal = 0f;
        for (Passageiro passageiro : passageiros) {
            valorTotal += passageiro.getTarifa();
        }
        return valorTotal;
    }

    public String getPlacaOnibus() {
        return placaOnibus;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public LocalDate getDataViagem() {
        return dataViagem;
    }

    public void setPlacaOnibus(String placaOnibus) {
        this.placaOnibus = placaOnibus;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public void setDataViagem(LocalDate dataViagem) {
        this.dataViagem = dataViagem;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }
}

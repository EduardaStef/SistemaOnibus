package com.furb.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Empresa {

    private List<Viagem> viagens = new ArrayList<>();

    public List<Passageiro> getPassageirosMaisIdosos() {
        return getViagens().stream().flatMap(viagem -> viagem.getPassageiros().stream().filter(passageiro -> passageiro.getIdade() > 59)).toList();
    }

    public List<Viagem> getViagens() {
        return viagens;
    }

    public void setViagens(List<Viagem> viagens) {
        this.viagens = viagens;
    }
}

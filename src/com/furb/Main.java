/*
NOME: EDUARDA STEFFEN
DATA: 25/02/2025
 */
package com.furb;

import com.furb.model.*;
import com.furb.view.TelaPrincipal;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        TelaPrincipal telaPrincipal = new TelaPrincipal(empresa);

        Intermunicipal intermunicipal = new Intermunicipal("placa", "robesque", LocalDate.now());
        Viagem viagem = new Viagem(intermunicipal.getPlacaOnibus(), intermunicipal.getNomeMotorista(), LocalDate.now());

        Estudante estudante = new Estudante("cleide", 12, "sei la");
        intermunicipal.addPassageiro(estudante);
        viagem.addPassageiro(estudante);
        Idoso idoso = new Idoso("robesvaldo", 69, "rg baita");
        intermunicipal.addPassageiro(idoso);
        viagem.addPassageiro(idoso);
        Passageiro passageiro = new Passageiro("aleatorio", 40);
        intermunicipal.addPassageiro(passageiro);
        viagem.addPassageiro(passageiro);

        System.out.println("estudante: " + estudante.getTarifa());
        System.out.println("idoso: " + idoso.getTarifa());
        System.out.println("passageiro: " + passageiro.getTarifa());

        System.out.println("viagem: " + viagem.getValorTotal());
        System.out.println("intermunicipal: " + intermunicipal.getValorTotal());





    }
}

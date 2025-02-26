package com.furb.view;

import com.furb.model.Empresa;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends Tela{

    private Empresa empresa;

    private JButton municipal;
    private JButton intermunicipal;
    private JFrame telaPrincipal;
    private JButton consultar;

    public TelaPrincipal(Empresa empresa) {
        this.empresa = empresa;
        telaPrincipal = new JFrame();

        criaTela(telaPrincipal, "Prova de Suficiência : Programação Orientada a Objetos - Ônibus");

        telaPrincipal.add(criaLabel("Bem vindo(a)!", true, 25, 300, 30, 200, 50));

            telaPrincipal.add(criaLabel("Por favor selecione o modelo de viagem que será cadastrado", false, 18, 100, 120, 800, 50));

            municipal = criaBotao("Municipal", 200, 200, 150, 80);
            municipal.addActionListener(this::municipal);
            telaPrincipal.add(municipal);

            intermunicipal = criaBotao("Intermunicipal", 400, 200, 150, 80);
            intermunicipal.addActionListener(this::intermunicipal);
            telaPrincipal.add(intermunicipal);
            telaPrincipal.setVisible(true);

            consultar = criaBotao("Consultar Viagens", 300, 350, 150, 70);
            consultar.addActionListener(this::consultar);
            telaPrincipal.add(consultar);
    }

    private void consultar(ActionEvent actionEvent) {
        new TelaConsultaViagens();
    }

    private void intermunicipal(ActionEvent actionEvent) {
        new TelaCadastroViagem(false, this.empresa.getViagens());
    }

    private void municipal(ActionEvent actionEvent) {
        new TelaCadastroViagem(true, this.empresa.getViagens());
    }
}

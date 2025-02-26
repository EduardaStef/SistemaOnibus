/*
NOME: EDUARDA STEFFEN
DATA: 25/02/2025
 */

package com.furb.view;

import com.furb.model.Intermunicipal;
import com.furb.model.Municipal;
import com.furb.model.Viagem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TelaCadastroViagem extends Tela {

    private JFrame telaCadastroViagem;
    private JFrame telaAnterior;

    private JTextField placaOnibusTela;
    private JTextField nomeMotoristaTela;
    private JTextField dataTela;
    private JButton salvar;

    private Boolean isMunicipal;
    private List<Viagem> viagens;

    public TelaCadastroViagem(Boolean isMunicipal, List<Viagem> viagens) {
        this.telaAnterior = telaAnterior;
        this.isMunicipal = isMunicipal;
        this.viagens = viagens;

        telaCadastroViagem = new JFrame();
        criaTela(telaCadastroViagem, "Cadastro de Viagem");
        telaCadastroViagem.add(criaLabel("Cadastro de Viagem", true, 25, (telaCadastroViagem.getX() / 2), 30, 250, 50));

        telaCadastroViagem.add(criaLabel("Placa do Ônibus:", false, 18, 100, 115, 800, 50));
        placaOnibusTela = criaCampo(100, 165, 500, 30);
        telaCadastroViagem.add(placaOnibusTela);

        telaCadastroViagem.add(criaLabel("Nome do Motorista:", false, 18, 100, 195, 800, 50));
        nomeMotoristaTela = criaCampo(100, 245, 500, 30);
        telaCadastroViagem.add(nomeMotoristaTela);

        telaCadastroViagem.add(criaLabel("Data da Viagem:", false, 18, 100, 275, 800, 50));
        dataTela = criaCampo(100, 325, 500, 30);
        telaCadastroViagem.add(dataTela);

        salvar = criaBotao("Salvar", (telaCadastroViagem.getX() / 2), 390, 150, 30);
        salvar.addActionListener(this::salvar);
        telaCadastroViagem.add(salvar);
        telaCadastroViagem.setVisible(true);
        telaCadastroViagem.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public void salvar(ActionEvent actionEvent) {
        Viagem viagem;
        String placa = placaOnibusTela.getText();
        String nome = nomeMotoristaTela.getText();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataTela.getText(), formatter);

        if(isMunicipal) {
            viagem = new Municipal(placa, nome, data);
        } else {
            viagem = new Intermunicipal("placa", "robesque", data);
        }
        viagens.add(viagem);
        JOptionPane.showMessageDialog(null, "Inserido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        limparCampos();
    }


    public void limparCampos() {
        nomeMotoristaTela.setText("");
        placaOnibusTela.setText("");
        dataTela.setText("");
    }
}

package com.furb.view;

import javax.swing.*;
import java.awt.*;

public class Tela {


    public JFrame criaTela(JFrame tela, String titulo) {
        tela.setTitle(titulo);
        tela.setSize(800,500);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        return tela;
    }

    public JLabel criaLabel(String texto, Boolean isNegrito, Integer tamanho, Integer eixoX, Integer eixoY, Integer largura, Integer altura) {
        JLabel label = new JLabel(texto);
        if(isNegrito) {
            label.setFont(new Font("Arial", Font.BOLD, tamanho));
        } else {
            label.setFont(new Font("Arial", Font.PLAIN, tamanho));
        }
        label.setBounds(eixoX,eixoY,largura,altura);
        return label;
    }

    public JButton criaBotao(String texto, Integer eixoX, Integer eixoY, Integer largura, Integer altura) {
        JButton botao = new JButton(texto);
        botao.setBounds(eixoX,eixoY,largura,altura);
        return botao;
    }

    public JTextField criaCampo(Integer eixoX, Integer eixoY, Integer largura, Integer altura) {
        JTextField campo = new JTextField();
        campo.setBounds(eixoX,eixoY,largura,altura);
        return campo;
    }
}

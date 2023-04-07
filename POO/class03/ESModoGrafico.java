package Pratice.class03;

import javax.swing.*;

public class ESModoGrafico {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Olá mundo");

        String nome = JOptionPane.showInputDialog( "Digite seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

        JOptionPane.showMessageDialog(null, "Olá " + nome + ". Você tem " + idade + "anos.");

    }
}

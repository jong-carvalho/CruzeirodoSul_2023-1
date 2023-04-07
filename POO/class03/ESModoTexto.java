package Pratice.class03;

import java.util.Scanner;

public class ESModoTexto {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        String nome = leia.nextLine();
        System.out.println("Olá " + nome + " seja bem vindo!");


        System.out.println("Digite o primeiro número: ");
        int primeiro = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundo = leia.nextInt();

        System.out.println("A soma dos números é: " + (primeiro + segundo));
    }
}

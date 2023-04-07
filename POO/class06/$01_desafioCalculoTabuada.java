package Pratice.class06;

import java.util.Scanner;

public class $01_desafioCalculoTabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcularmos a tabuada: ");
        int num = scanner.nextInt();

        System.out.println("1 x " + num + " = " + (1*num));
        System.out.println("2 x " + num + " = " + (2*num));
        System.out.println("3 x " + num + " = " + (3*num));
        System.out.println("4 x " + num + " = " + (4*num));
        System.out.println("5 x " + num + " = " + (5*num));
        System.out.println("6 x " + num + " = " + (6*num));
        System.out.println("7 x " + num + " = " + (7*num));
        System.out.println("8 x " + num + " = " + (8*num));
        System.out.println("9 x " + num + " = " + (9*num));
        System.out.println("10 x " + num + " = " + (10*num));
    }
}

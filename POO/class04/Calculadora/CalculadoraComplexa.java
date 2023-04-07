package Pratice.class04.Calculadora;

import java.util.Scanner;

public class CalculadoraComplexa {

    Scanner leia = new Scanner(System.in);

    public void interacao() {
        System.out.println("Seja bem vindo ao nosso sistema de cálculo da fórmula de Bhaskara.");
        System.out.println("Você deverá digitar três números (a, b, c) para o cálculo ser realizado");
        System.out.println("Por favor, digite o primeiro número (a): ");
        float a = leia.nextFloat();
        System.out.println("Por favor, digite o primeiro número (b): ");
        float b = leia.nextFloat();
        System.out.println("Por favor, digite o primeiro número (c): ");
        float c = leia.nextFloat();

        System.out.println(bhaskara(a, b, c));

    }

    public String bhaskara(float a, float b, float c) {

        //  delta = b^2 - 4.a.c
        double delta = Math.pow(b , 2) - 4 * a * c;

        //  bhaskara =>  ( -b +- √ delta ) / 2.a
        double x1 = ( -b + Math.sqrt(delta) ) / 2 * a;

        double x2 = ( -b - Math.sqrt(delta) ) / 2 * a;

        return "O delta é " + delta + "\nAs raízes da equação são: X' = " + x1 + " X'' = " + x2;

//        Exemplo a ser testado a=1 b=12 c=-13 ... delta = 196 x'1.0 e x"= -13.0
    }
}

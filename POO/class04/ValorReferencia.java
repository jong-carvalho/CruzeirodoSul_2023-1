package Pratice.class04;

import Pratice.class04.Escopo.Pessoa;

public class ValorReferencia {

    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = valor1;

        System.out.println("Somando 5 ao valor1 "+ (valor1+5));
        System.out.println("Somando 5 ao valor2 "+ (valor2+5));


        Pessoa p1 = new Pessoa("Jonatas", 18, 250.00);
        Pessoa p2 = p1;

//        tornar publico os atributos de Pratice.class06.pacote1.Pessoa
//        System.out.println(" " + p1.nome + " " + p1.idade);
//        System.out.println(" " + p2.nome + " " + p2.idade;
//
//        p1.nome = "Jose";
//        System.out.println(" " + p1.nome + " " + p1.idade);
//        System.out.println(" " + p2.nome + " " + p2.idade);

//        DESAFIO
        int v1 = 3;
        int v2 = v1;
        int v3 = v1 + v2;
        System.out.println(v3);



    }
}

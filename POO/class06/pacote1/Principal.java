package Pratice.class06.pacote1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Verificador verificador = new Verificador();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o score do usuário: ");
        pessoa.score = scanner.nextInt();

        System.out.println("Digite o cpf do usuário: ");
        String cpf = scanner.next();
        pessoa.setCpf(cpf);

        String verificado = verificador.VerificaNomeSujo(pessoa.score, pessoa.getCpf());
        System.out.println(verificado);


    }
}

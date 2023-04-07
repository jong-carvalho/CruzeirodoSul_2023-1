package Pratice.class07.MediaAlunos;

import java.util.Scanner;

public class mediaAlunos01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        String n00 = scanner.next();

        System.out.println("Digite a primeira nota do aluno: ");
        float n01 = scanner.nextFloat();

        System.out.println("Digite a segunda nota do aluno: ");
        float n02 = scanner.nextFloat();

        System.out.println("Digite a terceira nota do aluno: ");
        float n03 = scanner.nextFloat();

        System.out.println("Digite o nome do aluno");
        String n10 = scanner.next();

        System.out.println("Digite a primeira nota do aluno: ");
        float n11 = scanner.nextFloat();

        System.out.println("Digite a segunda nota do aluno: ");
        float n12 = scanner.nextFloat();

        System.out.println("Digite a terceira nota do aluno: ");
        float n13 = scanner.nextFloat();

        System.out.println("Digite o nome do aluno");
        String n20 = scanner.next();

        System.out.println("Digite a primeira nota do aluno: ");
        float n21 = scanner.nextFloat();

        System.out.println("Digite a segunda nota do aluno: ");
        float n22 = scanner.nextFloat();

        System.out.println("Digite a terceira nota do aluno: ");
        float n23 = scanner.nextFloat();


        Aluno a1 = new Aluno(n00, n01, n02, n03);
        Aluno a2 = new Aluno(n10, n11, n12, n13);
        Aluno a3 = new Aluno(n20, n21, n22, n23);

        float mediaGeral = (a1.media + a2.media + a3.media)/3;

        System.out.println("A media geral da sala é: " + mediaGeral);

        if(a1.media > mediaGeral){
            System.out.println("Parabéns " + a1.nome + "! \nSua média está acima da média da sala");
        } else if(a2.media > mediaGeral){
            System.out.println("Parabéns " + a2.nome + "! \nSua média está acima da média da sala");
        } else if (a3.media > mediaGeral){
            System.out.println("Parabéns " + a3.nome + "! \nSua média está acima da média da sala");
        }

    }
}

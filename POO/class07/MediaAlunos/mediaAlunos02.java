package Pratice.class07.MediaAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class mediaAlunos02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();

            for(int i= 1; i<=3; i++){
                System.out.println("Digite o nome do aluno");
                String nome = scanner.next();

                System.out.println("Digite a primeira nota do aluno: ");
                float n1 = scanner.nextFloat();

                System.out.println("Digite a segunda nota do aluno: ");
                float n2 = scanner.nextFloat();

                System.out.println("Digite a terceira nota do aluno: ");
                float n3 = scanner.nextFloat();

                alunos.add(new Aluno(nome, n1, n2, n3));
            }
//            exibir alunos
//            testar com i=1 e i<=3
            for (int i=0; i<=2; i++){
                Aluno a = alunos.get(i);
                System.out.println(
                        "Nome: " + a.nome + "\n" +
                        "Nota 01: " + a.nota1 + "\n" +
                        "Nota 02: " + a.nota2 + "\n" +
                        "Nota 03: " + a.nota3 + "\n" +
                        "Média : " + a.media
                );
            }

            float mediaGeral = 0;

            for (int i=0; i<=2; i++){
                Aluno a = alunos.get(i);

                mediaGeral += a.media;
            }

            mediaGeral = mediaGeral/3;

        System.out.println("A média geral da turma é: " + mediaGeral);

        for (int i=0; i<=2; i++){
            Aluno a = alunos.get(i);

            if(a.media > mediaGeral ){
                System.out.println("Parabéns " + a.nome + "! \nSua média está acima da média da sala");
            }
        }



    }
}

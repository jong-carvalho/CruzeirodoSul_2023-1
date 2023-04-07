package Pratice.class07.MediaAlunos;

public class Aluno {

    String nome;
    float nota1;
    float nota2;
    float nota3;
    float media;

    Aluno(){

    }

    Aluno(String n, float n1, float n2, float n3){
        nome = n;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        media = (n1+n2+n3)/3;
    }

}

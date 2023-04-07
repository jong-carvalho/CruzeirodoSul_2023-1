package Pratice.class05;

public class EstruturaDeDecisao {

    public static void main(String[] args) {

        // -------- Hora do dia --------
        int hora = 3;

        if(hora >= 6 && hora < 12) {
            System.out.println("Bom dia");
        }else if(hora >= 12 && hora < 18){
            System.out.println("Boa tarde");
        }else if(hora >= 18 && hora < 23) {
            System.out.println("Boa Noite");
        } else {
            System.out.println("Boa Madrugada");
        }

//        fazer exemplo boa noite e boa madrugada

// -------- Entrada na balada --------
        int idade = 17;

        if(idade >= 18) {
            System.out.println("Pode entrar!");
        } else {
            System.out.println("Volta pra casa criança");
        }



// -------- Aposentadoria  --------
// Aposentadoria por idade:
//        Mulheres - ter 62 e 15 de contribuição
//        Homens - ter 65 e 15 de contribuição

// Aposentadoria por tempo de contribuição:
//         Mulheres: 30 anos de contribuição (minimo de 57)
//         Homens: 35 anos de contribuição (minimo de 60)

        int  age = 65;
        int contribution = 15;
        char sex = 'M';

        if(sex == 'F' && age >= 62 && contribution >= 15){
            System.out.println("Pode se aposentar!");
        } else if(sex == 'M' && age >= 65 && contribution >= 15){
            System.out.println("Pode se aposentar");
        } else if(sex == 'F' && age >= 57 && contribution >= 30){
            System.out.println("Pode se aposentar");
        } else if(sex == 'M' && age >= 60 && contribution >= 35){
            System.out.println("Pode se aposentar");
        } else {
            System.out.println("Não pode se aposentar");
        }



        // -------- Entrada na balada 2 --------

        int idadeB = 19;
        String mensagem = (idadeB >= 18) ? "Pode entrar!" : "Volta pra casa criança!";
        System.out.println(mensagem);


    }
}

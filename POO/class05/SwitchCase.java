package Pratice.class05;

public class SwitchCase {

    public static void main(String[] args) {


// Exemplo switch case
        String cabelo = "branco";

        switch(cabelo) {
            case "amarelo":
                System.out.println("Você é loiro");
                break;
            case "preto":
                System.out.println("Você é moreno");
                break;
            case "vermelho":
                System.out.println("Você é ruivo");
                break;
            case "branco":
                System.out.println("Você é velho");
                break;
        }



//      Não suportado no Java 11
//        int nota = 0;
//
//        switch (nota) {
//            case 0, 1, 2:
//                System.out.println("Foi reprovado direto");
//                break;
//            case 3, 4, 5:
//                System.out.println("Ainda há esperança, o EXAME!");
//                break;
//            case 6, 7:
//                System.out.println("Não fez mais que a orbigação");
//                break;
//            case 8, 9, 10:
//                System.out.println("Parabéns, Excelente!");
//
//        }

    }
}

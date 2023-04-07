package Pratice.class06;

import java.util.Random;
import java.util.Scanner;

public class $03_desafioAdivinheONumero {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        int num = aleatorio.nextInt(20);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tente adivinhar o número: ");
        int tentativa = scanner.nextInt();

        while(num != tentativa){
            if(tentativa > num){
                System.out.println("O número que você digitou é maior");

                System.out.println("Tente adivinhar o número: ");
                tentativa = scanner.nextInt();
            } else {
                System.out.println("O número que você digitou é menor");

                System.out.println("Tente adivinhar o número: ");
                 tentativa = scanner.nextInt();
            }
        }


            System.out.println("Aceeerrrtou mizerávi");


    }
}

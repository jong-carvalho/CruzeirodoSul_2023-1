package Pratice.class04.Calculadora;

public class CalculadoraSimples {

    float v1, v2;

    public String adicao(int v1, int v2) {
        return  "O resultado da adição (" + v1 + " + " + v2 + ") é " + (v1 + v2) ;
    }

    public String subtracao(int v1, int v2) {
        return  "O resultado da subtração (" + v1 + " - " + v2 + ") é " + (v1 - v2) ;
    }

    public String divisão(int v1, int v2) {
        return  "O resultado da divisão (" + v1 + " - " + v2 + ") é " + (v1 / v2) ;
    }

    public String multiplicacao(int v1, int v2) {
        return  "O resultado da multiplicação (" + v1 + " - " + v2 + ") é " + (v1 * v2) ;
    }
}

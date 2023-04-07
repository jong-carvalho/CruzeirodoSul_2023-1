package Pratice.class04.Calculadora;

public class Principal {

    public static void main(String[] args) {
        CalculadoraComplexa calculadora = new CalculadoraComplexa();

        CalculadoraSimples calculadoraSimples = new CalculadoraSimples();

        int a,b;
        a=10;
        b=20;

        calculadoraSimples.adicao(a,b);
        calculadoraSimples.subtracao(a,b);
        calculadoraSimples.divisão(a,b);
        calculadoraSimples.multiplicacao(a,b);

        calculadora.interacao();


    }
}

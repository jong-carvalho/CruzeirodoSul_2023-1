package Pratice.class05.Sobrecarga;

public class Soma {

    public String somando(int a, int b){
        return "Resultado: " + (a+b);
    }

    public String somando(float a, float b){
        return "Resultado: " + (a+b);
    }

    public String somando(int a, int b, int c){
        return "Resultado: " + (a+b+c);
    }

}

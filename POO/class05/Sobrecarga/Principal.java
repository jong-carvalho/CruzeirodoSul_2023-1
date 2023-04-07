package Pratice.class05.Sobrecarga;

public class Principal {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;
        float d = 0;
        float e = 0;

        Soma soma = new Soma();

        soma.somando(a, b);
        soma.somando(d, e);
        soma.somando(a, b, c);


        Media media = new Media();

    }
}

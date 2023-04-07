package Pratice.class03.Construtores;

public class Principal {

    public static void main(String[] args) {
        Triangulo t = new Triangulo(2.5f, 3f);
        float area = t.calculoDeArea(t.base, t.altura);
        System.out.println("Área: " + area);

        Data d1 = new Data(29, 8, 2022);
        Data d2 = new Data();
        System.out.println(d1.dia+"/"+d1.mes+"/"+d1.ano);
        System.out.println(d2.dia+"/"+d2.mes+"/"+d2.ano);

    }
}

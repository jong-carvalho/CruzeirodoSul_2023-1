package Pratice.class03.Construtores;

public class Triangulo {

        float base;
        float altura;

        Triangulo() {

        }

        Triangulo(float b, float a){
            base = b;
            altura = a;
        }

        public Float calculoDeArea(float base, float altura)
        {
            return (base * altura)/2;

        }
}

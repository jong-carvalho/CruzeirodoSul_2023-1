package Pratice.class05.Sobrecarga;

public class Media {

    public String calculaMedia(float a, float b) {
        return "A média é: " + (a+b);
    }

    public String calculaMedia(float a,float b,float c,float d,float e){
        return "A média é: " + ((a+b+c+d+e)/5);
    }

    public String calcularMedia(float avaliacaoParcial, float exercicios, float projeto, float avaliacaoRegimental) {
        return "A média é " + (avaliacaoParcial + exercicios + projeto + avaliacaoRegimental);
    }

}

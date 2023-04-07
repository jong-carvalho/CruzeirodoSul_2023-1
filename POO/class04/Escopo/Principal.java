package Pratice.class04.Escopo;

public class Principal {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.nome = "Beltrano";
        p1.idade = 18;
        p1.renda = 1000.00;

        if(p1.renda <= 1000) {
            double aumento = p1.renda * 0.5;
            p1.renda = p1.renda+aumento;
        }

        //tentar usar aumento
//        System.out.println(aumento);
    }
}

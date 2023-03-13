package Aula02.Prática;

public class Principal {

    public static void main(String[] args) {
        Pessoa pJoao = new Pessoa();

        pJoao.nome = "João da Silva";
        pJoao.idade = 27;
        pJoao.cpf = "123.456.789-00";

        System.out.println("Nome:" + pJoao.nome + "\nIdade: " + pJoao.idade + "\nCPF: " + pJoao.cpf);

        System.out.println("-----------------------------");

        Pessoa pMarina = new Pessoa("Marina dos Santos", 35, "987.654.321-00");

        System.out.println("Nome:" + pMarina.nome + "\nIdade: " + pMarina.idade + "\nCPF: " + pMarina.cpf);

        System.out.println("-----------------------------");
        //PEDIR PROS ALUNOS CRIAR O DOS CÃES

        Caes c = new Caes();

        c.raca = "Pitbull";
        c.nome = "Chocolate";
        c.idade = 5;
        c.pelo = "curto";
        c.sexo = "M";
        c.porte = "grande";
        c.vacinado = true;

        System.out.println("Raça: " + c.raca  + "\n" +
                        "Nome: " + c.nome  + "\n" +
                        "Idade: " + c.idade  + "\n" +
                        "Pêlo: " + c.pelo  + "\n" +
                        "Sexo: " + c.sexo  + "\n" +
                        "Porte: " + c.porte  + "\n" +
                        "Vacinadao: " + c.vacinado  + "\n"
                );

        System.out.println("" + c.latir());




    }
}

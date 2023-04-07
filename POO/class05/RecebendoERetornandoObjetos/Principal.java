package Pratice.class05.RecebendoERetornandoObjetos;

public class Principal {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Joana", "Silva", 58);

        System.out.println(mudaCampos(pessoa));

        System.out.println(pessoa.nome + " | " + pessoa.sobrenome);


    }

    public static String mudaCampos(Pessoa pessoa) {
        String nomeTemporario, sobrenomeTemporario;

        nomeTemporario = pessoa.nome;
        sobrenomeTemporario = pessoa.sobrenome;

        pessoa.nome = "Nome: " + nomeTemporario;
        pessoa.sobrenome = "Sobrenome: " + sobrenomeTemporario;

        return "Os campos foram alterados com sucesso!";
    }
}

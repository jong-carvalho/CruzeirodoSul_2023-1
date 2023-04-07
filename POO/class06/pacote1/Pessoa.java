package Pratice.class06.pacote1;

public class Pessoa {

    public String nome;
    int idade;
    protected String endereco;
    private String cpf;
    public int score;


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String retornaDados() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nEndereço: " + endereco + "\nCPF: " + cpf + "\nScore: " + score;
    }
}

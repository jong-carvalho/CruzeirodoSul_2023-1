package Pratice.class06.pacote1;

public class Verificador {

    public String VerificaNomeSujo(int score, String cpf) {
        if( score >= 500 && cpf.length() <= 11){
            return "Usuário possui o nome limpo!";
        } else {
            return "Usuário não possui nome limpo ou cpf está inválido!";
        }
    }
}

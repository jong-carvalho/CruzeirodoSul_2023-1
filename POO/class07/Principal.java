package Pratice.class07;

public class Principal {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        ContaBancaria conta1 = new ContaBancaria();

        c1.nome = "Joao";
        c1.cpf = "123.456.789-10";

        conta1.cliente = c1;
        conta1.saldo = 1000.00f;
        conta1.numConta = 12345;

        conta1.sacar(c1, 500);

        conta1.depositar(375);

        System.out.println(conta1.saldo);


    }
}

package Pratice.class07;

public class ContaBancaria {

    Cliente cliente;
    int numConta;
    float saldo;

    ContaBancaria() {

    }

    ContaBancaria(Cliente c, int nc, float s){
        cliente = c;
        numConta = nc;
        saldo = s;
    }


    public void sacar(Cliente cliente, float valorSacar){
        if (valorSacar <= saldo){
            saldo = saldo - valorSacar;
            System.out.println("O valor a ser sacado será: " + valorSacar);
            System.out.println("O saldo da conta agora é: " + saldo);
        } else {
            System.out.println("Você não possui saldo em conta, realize um depósito: ");
        }
    }

    public void depositar(float valorDeposito) {
        saldo += valorDeposito;
        System.out.println("Você depositou R$" + valorDeposito );
        System.out.println("Agora seu saldo é: " + saldo);
    }
}

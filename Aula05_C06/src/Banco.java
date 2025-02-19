
public class Banco {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta();

        conta1.saldo = 10000;
        conta2.saldo = 20000;

        System.out.println("O saldo incial da conta 1 é: " + conta1.saldo);
        System.out.println("O saldo incial da conta 2 é: " + conta2.saldo);
        System.out.println(" ");

        conta1.sacar(100);
        conta2.sacar(20);

        System.out.println(conta1.saldo);
        System.out.println(conta2.saldo);


    }
    }

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1500.00, 500.00);

        Cliente cliente1 = new Cliente("Marcus", 354);
        Cliente cliente2 = new Cliente("Vinicus", 1411);
        Cliente cliente3 = null;

        conta.adicionarCliente(cliente1);
        conta.adicionarCliente(cliente2);
        conta.adicionarCliente(cliente3);

        conta.mostraInfo();

        System.out.println("Programa chegou até o final.");
    }
}

import java.util.HashSet;

public class Conta {
    private double saldo;
    private double limite;
    private HashSet<Cliente> clientes;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
        this.clientes = new HashSet<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostraInfo() {
        System.out.println("Informações da Conta:");
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("Informações dos clientes:");

        for (Cliente c : clientes) {
            try {
                System.out.println("Nome: " + c.getNome() + ", CPF: " + c.getCpf());
            } catch (NullPointerException e) {
                System.out.println("Não foi possivel mostrar o cliente pois tem um erro!");
            }
        }
    }
}

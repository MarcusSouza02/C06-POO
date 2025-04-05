import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.nome = "Marcus";
        cliente.cpf = 354;

        Computador[] promocoes = new Computador[3];

        promocoes[0] = new Computador("Apple", 354);
        promocoes[0].hardwares[0] = new HardwareBasico("Processador Pentium Core i3", 2200);
        promocoes[0].hardwares[1] = new HardwareBasico("Memória RAM", 8);
        promocoes[0].hardwares[2] = new HardwareBasico("HD", 500);
        promocoes[0].sistemaOperacional = new SistemaOperacional("Linux Ubuntu", 32);
        promocoes[0].addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        promocoes[1] = new Computador("Samsung", 354 + 1234);
        promocoes[1].hardwares[0] = new HardwareBasico("Processador Pentium Core i5", 3370);
        promocoes[1].hardwares[1] = new HardwareBasico("Memória RAM", 16);
        promocoes[1].hardwares[2] = new HardwareBasico("HD", 1000);
        promocoes[1].sistemaOperacional = new SistemaOperacional("Windows 8", 64);
        promocoes[1].addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        promocoes[2] = new Computador("Dell", 354 + 5678);
        promocoes[2].hardwares[0] = new HardwareBasico("Processador Pentium Core i7", 4500);
        promocoes[2].hardwares[1] = new HardwareBasico("Memória RAM", 32);
        promocoes[2].hardwares[2] = new HardwareBasico("HD", 2000);
        promocoes[2].sistemaOperacional = new SistemaOperacional("Windows 10", 64);
        promocoes[2].addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        System.out.println(" ");
        System.out.println("Bem-vindo à PCMania!");
        System.out.println(" ");
        System.out.println("CATÁLOGO DE PROMOÇÕES ");
        System.out.println(" ");

        for (int i = 0; i < promocoes.length; i++) {
            System.out.println("Promoção " + (i + 1) + ":");
            promocoes[i].mostraPCConfigs();
        }

        while (true) {
            System.out.println("Faça sua(s) compra(s) (1, 2 ou 3) ou se não for comprar nada, pressione 0 para sair:");
            int escolha = sc.nextInt();
            if (escolha == 0)
                break;
            if (escolha >= 1 && escolha <= 3)
                cliente.comprarComputador(promocoes[escolha - 1]);
                else
                    System.out.println("Opção inválida! Tente novamente.");
        }

        cliente.mostrarCompras();
        sc.close();
    }
}

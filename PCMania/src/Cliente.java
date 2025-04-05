class Cliente {
    String nome;
    int cpf;
    Computador[] computadores = new Computador[10];
    int totalComprados = 0;

    public void comprarComputador(Computador pc) {
        if (totalComprados < 10) {
            computadores[totalComprados] = pc;
            totalComprados++;
        } else {
            System.out.println("Limite de compras atingido!");
        }
    }

    public void mostrarCompras() {
        System.out.println("Aqui está um resumo de sua passagem pela PCMania.");
        System.out.println(" ");
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        float total = 0;
        for (int i = 0; i < totalComprados; i++) {
            computadores[i].mostraPCConfigs();
            total += computadores[i].preco;
        }
        System.out.println("Total da compra: R$" + total);
        System.out.println(" ");
        System.out.println("Obrigado por visitar a PCMania, volte Sempre!!");
    }
}

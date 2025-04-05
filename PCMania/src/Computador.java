class Computador {
    String marca;
    float preco;
    HardwareBasico[] hardwares = new HardwareBasico[3];
    SistemaOperacional sistemaOperacional;
    MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        for (HardwareBasico h : hardwares) {
            if (h != null)
                System.out.println(h.nome + ": " + h.capacidade);
        }
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " (" + sistemaOperacional.tipo + " bits)");
        if (memoriaUSB != null) {
            System.out.println("Memória USB: " + memoriaUSB.nome + " de " + memoriaUSB.capacidade + "Gb");
        }
        System.out.println(" ");
    }
}

public class Promocao {
    public String marca;
    public HardwareBasico[] hardwares;
    public SistemaOperacional sistemaOperacional;
    public MemoriaUSB memoriaUSB;
    public double preco;

    public Promocao() {
        hardwares = new HardwareBasico[3]; // inicializa o array
    }
}

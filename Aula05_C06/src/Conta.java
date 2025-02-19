public class Conta {

    //Atributos
    int saldo;
    int limite;
    float numeroDaConta;
    String nomeDoDono;

    //Métodos
    public void sacar(int quantidade){
        saldo -= quantidade;
    }

    void depositar(int quantidade){
        saldo += quantidade;
    }

    void transferir(int quantidade, Conta contadestino){
            saldo -= quantidade;
            contadestino.saldo += quantidade;
    }

}

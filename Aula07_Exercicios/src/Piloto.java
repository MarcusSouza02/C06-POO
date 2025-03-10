public class Piloto {
    String nome;
    Boolean vilao;

    void mostraInfoPiloto(){
        System.out.println("Informações do Piloto");
        System.out.println("Nome: " + nome);
        System.out.println("Vilao: " + vilao);
        System.out.println(" " );
    }

    void soltaSuperPoder(){
        if(vilao){
            System.out.println( nome + " lançou uma maldição.");
        }
        else
            System.out.println( nome + " Defendeu soltando seu super poder.");
    }

    void finalCorrida(){
        if(vilao){
            System.out.println("A maldição não fez efeito");
        }
        else {
            System.out.println("O super poder acertou o vilão que bateu o carro e explodiu!!");
            System.out.println( nome + " derrou o vilão e ganhou a corrida!!");
        }
    }

}



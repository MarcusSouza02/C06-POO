public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    public Kart(){
        motor = new Motor();
    }

    void pular(){
         System.out.println( nome + " está pulando" );
    }

    void SoltarTurbo(){
        System.out.println( nome + " esta soltando turbo!");
    }

    void FazerDrift(){
        System.out.println( nome + " esta fazendo drift!");
    }

    void mostraInfokart(){
        System.out.println("Informações do Kart ");
        System.out.println("Nome: " + nome);
        System.out.println("Piloto: " + piloto);
        System.out.println(" " );

    }

}
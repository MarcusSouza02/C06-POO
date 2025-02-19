 public class Zumbi{
        String nome;
        int vida;
        int dano;

        public Zumbi(){ // serve para coisas que devem ser utilizado uma unica vez
            System.out.println("Inicializando zumbi");
        }

        void seAlimentar() {
            System.out.println("Zumbi" + nome + "está se alimentando...");
        }

        void mostraInfo(){
            System.out.println("Nome: " + nome);
            System.out.println("Vida: " + vida);
            System.out.println("Dano: " + dano);
            System.out.println(" ");
        }


    }
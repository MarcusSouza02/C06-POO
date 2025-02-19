//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        zumbi1.nome = "Marcus";
        zumbi1.vida = 100;
        zumbi1.dano = 100;

        Zumbi zumbi2 = new Zumbi();
        zumbi2.nome = "Zé";
        zumbi2.vida = 100;
        zumbi2.dano = 100;

        zumbi1.mostraInfo();
        zumbi2.mostraInfo();

    }
}
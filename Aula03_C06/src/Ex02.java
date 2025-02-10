import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de lanche1: ");
        int lanche1 = entrada.nextInt();
        System.out.print("Digite a quantidade de lanche2: ");
        int lanche2 = entrada.nextInt();
        System.out.print("Digite a quantidade de lanche3: ");
        int lanche3 = entrada.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        int media = total / 3;

        System.out.println("A quantidade total de lanches é: " + total);
        System.out.println("A media de lanches é: " + media);

        entrada.close();
    }
}
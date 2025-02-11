import java.util.Random;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();

        int x = rand.nextInt(10) + 1; // gera um número aleatório entre 0 e 10

        System.out.println("Tente advinhar qual é o número: ");
        int y = entrada.nextInt();

        while (y != x){
            if (y < x){
                System.out.println("Tente  novamente com um número maior: ");
                y = entrada.nextInt();
            }
            else{
                System.out.println("Tente  novamente com um número menor: ");
                y = entrada.nextInt();
            }

        }
        if(y == x){
            System.out.println("Acertou!!");
        }
        entrada.close();
    }
}
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com um numero de alunos(as): ");
        int numAlunos = entrada.nextInt();

        switch (numAlunos) {
            case 10:
            case 20:
                System.out.println("Sala I-16");
            break;

            case 30:
                System.out.println("Sala I-22");
            break;
        }

        entrada.close();
    }
}
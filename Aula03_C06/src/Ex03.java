import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        int nota1 = entrada.nextInt();
        System.out.print("Digite a nota 2: ");
        int nota2 = entrada.nextInt();

        int npa = (nota1 + nota2)/2;

        if(npa >= 60){
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Ficou de Np3");
            System.out.print("Digite a nota da Np3: ");
            int np3 = entrada.nextInt();

            int notafinal = (npa + np3)/2;
            if(notafinal >= 50){
                System.out.println("Aprovado!");
            }
            else{
                System.out.print("Reprovado!");
            }


        }


    }
}
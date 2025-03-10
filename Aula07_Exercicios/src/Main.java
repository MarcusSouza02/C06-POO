//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Piloto piloto1 = new Piloto();
        piloto1.nome = "Ayrton";
        piloto1.vilao = false;
        piloto1.mostraInfoPiloto();

        Piloto piloto2 = new Piloto();
        piloto2.nome = "Vettel";
        piloto2.vilao = true;
        piloto2.mostraInfoPiloto();

        Kart kart1 = new Kart();
        kart1.nome = "Relampago";
        kart1.motor.cilindrada = "150";
        kart1.motor.velocidadeMaxima = 93.10f;
        kart1.piloto = piloto1;
        kart1.mostraInfokart();
        kart1.motor.mostraInfoMotor();

        Kart kart2 = new Kart();
        kart2.nome = "Chick Hicks";
        kart2.motor.cilindrada = "50";
        kart2.motor.velocidadeMaxima = 76.90f;
        kart2.piloto = piloto2;
        kart2.mostraInfokart();
        kart2.motor.mostraInfoMotor();

        System.out.println("Começou a corrida!!");
        kart1.SoltarTurbo();
        kart2.SoltarTurbo();
        System.out.println(" ");

        System.out.println("Cuidado, um buraco!!");
        kart1.pular();
        kart2.pular();
        System.out.println(" ");


        System.out.println("Curva perigosa!!");
        kart1.FazerDrift();
        kart2.FazerDrift();
        System.out.println(" ");


        piloto2.soltaSuperPoder();
        piloto1.soltaSuperPoder();
        piloto2.finalCorrida();
        piloto1.finalCorrida();
        System.out.println(" ");




    }
}
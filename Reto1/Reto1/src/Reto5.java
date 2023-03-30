import java.util.Scanner;
import java.util.Random;

public class Reto5 {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        Random maquina = new Random();

        int vidas = 3;
        int jugadap;
        int jugadam;

        System.out.println("¡Bienvenido al juego de Piedra, Papel o Tijera!");
        System.out.println("Tienes " + vidas + " vidas. Cada vez que pierdas, perderás una vida.");
       

        do {
            System.out.println("Elige tu jugada (1 = piedra, 2 = papel, 3 = tijera): ");
             jugadap = lectura.nextInt();

            jugadam = maquina.nextInt(3) + 1;

            if (jugadap == jugadam) {
                System.out.println("Hemos enpatado ");
            } 
            
            else if (jugadap == 1 && jugadam == 2){

                System.out.println("QUE BIEN Has ganado");

            }
            else if (jugadap == 2 && jugadam == 1){

                System.out.println("QUE mal has perdido");

            } else if (jugadap == 3 && jugadam == 3){

                System.out.println("QUE BIEN Has ganado");

            }

            else {
                System.out.println("Has perdido");
            }

            System.out.println("Tienes " + vidas + " vidas  " );

        } while (vidas > 0);

       
    }
}





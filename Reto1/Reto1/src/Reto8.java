import java.util.Scanner;
import java.util.Random;

public class Reto8 {

   
    public static void main(String[] args) {


        Scanner lectura = new Scanner (System.in);
        Random rand = new Random();
       

        int jugador1;
        int jugador2;
        int jugador1Vidas = 3;
        int jugador2Vidas = 3;

        System.out.println("jugador 1 lanza el dado \1.");
        jugador1 = rand.nextInt(6) + 1;

        System.out.println("Jugador 2 lanza el dado \2.");
        jugador2 = rand.nextInt(6) + 1;
        

        do {
           
            if (jugador1 < jugador2) { 
                
                System.out.println("Jugador 1 pierde una vida. Vidas restantes: " + jugador1Vidas);}
               
            else if (jugador2 < jugador1) {
               
                System.out.println("Jugador 2 pierde una vida. Vidas restantes: " + jugador2Vidas);
        
            } else  {
                System.out.println("Empate.");
            }
            
            System.out.println();
            
        } while (jugador1Vidas > 0 && jugador2Vidas > 0);
        
        if (jugador1Vidas == 0) {
            System.out.println("¡Jugador 2 gana!");
        } else {
            System.out.println("¡Jugador 1 gana!");
        }
    }
    
}

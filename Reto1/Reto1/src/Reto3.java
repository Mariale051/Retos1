import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    
  public static void main(String[] args) {


        int edad;
        int opcion; 
        int escoger;
  
        Scanner lectura = new Scanner(System.in);
        Random aleatorio = new Random();
       

        System.out.println("Digita tu edad ");
        edad = lectura.nextInt();

        if (edad<18) {

            System.out.println("No eres apto para jugar");

        }   else if (edad>100) {

            System.out.println("Incumples el rango de edad  ");

        } else {
            System.out.println("Eres apto para jugar");

            System.out.println("Dijita 1 o 2 si deseas \1. Cara o \2. Sello");

            escoger = lectura.nextInt();

            opcion = aleatorio.nextInt(2) + 1;

            System.out.println("La opcion elegida por la maquina es: "+ opcion);

            if (opcion == escoger) {

                System.out.println("Super eres el GANADOR ");
            } else { 
                System.out.println("Que mal has PERDIDO esta vez ");
            }


        }

        
        lectura.close();
    }
}

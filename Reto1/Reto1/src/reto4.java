import java.util.Scanner;
import java.util.Random;

public class reto4 {

    public static void main(String[] args) {

        int edad;
        int epersona, emaquina;
    
    
        Scanner lectura = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("HOLA, JUGAREMOS PIEDRA,PAPEL O TIGERA ");

        System.out.println("Digita tu edad ");
        edad = lectura.nextInt();

        if (edad<18) {

            System.out.println("No eres apto para jugar LO SIENTO");

        }   else if (edad>100) {

            System.out.println("Incumples el rango de edad  QUE MAL ");

        } else {
            System.out.println("Eres apto para jugar QUE BIEN");
        }

            System.out.println("Dijita si deseas \n1. piedra  \n2. papel   \n3. tigera");
           epersona = lectura.nextInt();

            emaquina = aleatorio.nextInt(3) + 1;


            if (epersona == emaquina) {
                System.out.println("Hemos Empatado  ");

                System.out.println("La maquina eligio: " + emaquina);
               
            } else if (epersona== 3 && emaquina == 1) {
                System.out.println("Eres el gandor QUE BIEN ");

                System.out.println("La maquina eligio: " + emaquina);
             
            } 

            else if  (epersona== 2 && emaquina == 2) {
                System.out.println("Eres el gandor QUE BIEN ");

                System.out.println("La maquina eligio: " + emaquina);
             
            }

            else if ( epersona == 1 && emaquina == 3) {
                System.out.println("Eres el gandor QUE BIEN ");

                System.out.println("La maquina eligio: " + emaquina);
             
            }
            
            else {
                System.out.println("a ganado la maquina ");
                System.out.println("La maquina  elegio " + emaquina);
                }
        
    }
    
}
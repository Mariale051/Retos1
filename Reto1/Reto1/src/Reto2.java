import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {

        int opcion;
       double temperaturaC = 350.0;

        Scanner lectura = new Scanner(System.in);
    
        // Pedimos al usuario que elija la unidad de temperatura
        System.out.println("Abuela elige a que grados quieres convertir \n1. Fahrenheit o \n2. Kelvin ");
        
         opcion = lectura.nextInt();

        // Convertimos la temperatura a la unidad elegida por el usuario
        double temperatura;

        switch (opcion) {
            
            case 1:
                temperatura = (temperaturaC * 9/5) + 32;
                System.out.println("La temperatura del horno es " + temperatura + "ºF");
                break;
            case 2:
                temperatura = temperaturaC + 273.15;
                System.out.println("La temperatura del horno es " + temperatura + "K");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }

        // Cerramos el scanner
        lectura.close();
        
    }
    
}
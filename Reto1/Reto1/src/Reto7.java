import java.util.Scanner;

public class Reto7 {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        String nom;
        String ape;
        String cor;
        int Doc;
        int Eda;
        int tel;
        String opcion; 
        int i=0;

        do {
        
        System.out.println("Bienvendido al formuario GOOGLE");

        System.out.println("Registra el Usuario");

        System.out.println("Ingresa tu nombre");
        nom=lectura.next();

        System.out.println("Ingresa tu apellido");
        ape=lectura.next();

        System.out.println("Ingresa tu documento");
        Doc=lectura.nextInt();

        System.out.println("Ingresa tu edad");
        Eda=lectura.nextInt();

        System.out.println("Ingresa tu correo");
        cor=lectura.next();

        System.out.println("Ingresa tu telefono");
        tel=lectura.nextInt();

        System.out.println("¿Quieres registar otro Usuario: digita 1 ");
        opcion=lectura.next();
      
            
        } while (opcion.equals("1"));
        
    }
    
}

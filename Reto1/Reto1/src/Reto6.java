import java.util.Scanner;

public class Reto6 {

    public static void main(String[] args) {

        String ingresapal;
        String palabraA = "sol"; 
        int vidas = 3; 
        boolean adivinanza=true;

        Scanner lectura = new Scanner(System.in);

        System.out.println("Hola, jugaremos a las adivinanzas, tendras  " + vidas );
        
        do {
            System.out.println("Ingresa una palabra:");
            ingresapal = lectura.nextLine();

            if (ingresapal.equals(palabraA)) {
                adivinanza = true;
                System.out.println("QUE BIEN adivinazte la palabra");
            } 

            
            else {
                vidas--;
                System.out.println("Esa no es la palabra QUE MAL te quedan "+ vidas +  "Vidas " );
            }

            if (vidas == 0) {
                System.out.println("Te has quedado sin vidas La palabra  era " + palabraA  );
                break;
            }
        } while (adivinanza);

        lectura.close();
    }
}


        
    
    


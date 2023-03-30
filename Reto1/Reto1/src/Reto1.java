import java. util.Scanner;

public class Reto1 {
   
    public static void main(String[] args) {


        String nombrebebe;
        String nombreenfermera;
        String nombrevacuna;
        String nombreeps;
        int peso,vacuna,meses;
        
        
        Scanner lectura = new Scanner(System.in);
            

            System.out.println("Ingrese el nombre del bebe");
            nombrebebe =lectura.nextLine();

            System.out.println("Ingresa tu nombre ");
            nombreenfermera =lectura.nextLine();

            System.out.println("Ingrese el nombre de la vacuna ");
            nombrevacuna =lectura.nextLine();

            System.out.println("Ingrese el nombre de la eps");
            nombreeps =lectura.nextLine();

            System.out.println("Ingrese el peso del bebe");
            peso =lectura.nextInt();
            
            System.out.println("Ingrese la edad del bebe ");
            meses=lectura.nextInt();


            vacuna = peso + 15 / meses * 15 * 10;

            System.out.println("El nombre del bebe  es"+nombrebebe+"El nombre de la enfermera a cargo es"+nombreenfermera+"El nombre de la vacuna correspondiente es"+nombrevacuna+"El nombre de la eps es"+nombreeps);
            System.out.println("La dosis adecuada para  el bebe es"+vacuna);

        } 

       

        
      }
    


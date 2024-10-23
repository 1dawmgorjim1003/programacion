package Ejercicios_Adicionales_Bucles;

import java.util.Scanner;

public class ejercicio7_5 {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in); int contador=0; int numeroCalificacion; boolean notaSuspenso=false;
         while (contador<=5 && !notaSuspenso){
             System.out.print("Indique la calificación de un alumno: ");
             numeroCalificacion=sc.nextInt();
             contador++;
             if (numeroCalificacion<5){
                 notaSuspenso=true;
             };

         }
         if (notaSuspenso) {
             System.out.println("Hay mínimo un suspenso.");
         } else {
             System.out.println("No hay ningún suspenso.");
         }
    }

}

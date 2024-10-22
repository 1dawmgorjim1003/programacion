package Ejercicios_Adicionales_Bucles;

import java.util.Scanner;

public class ejercicio7_1 {

    public static void main(String[] args) {
        int numRango; Scanner sc=new Scanner(System.in);
        System.out.print("Indique un valor mínimo de un rango: ");
        int numMinimo=sc.nextInt();
        System.out.print("Indique un valor máximo de un rango: ");
        int numMaximo=sc.nextInt();
        do {
            System.out.print("Indique un número que esté dentro del rango: ");
            numRango=sc.nextInt();
        } while (numMinimo>numRango || numMaximo<numRango);
        System.out.println("El número "+numRango+" está dentro del rango "+numMinimo+" - "+numMaximo);
    }

}

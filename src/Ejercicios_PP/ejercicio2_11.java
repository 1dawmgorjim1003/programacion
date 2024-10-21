package Ejercicios_PP;

import java.util.Scanner;

public class ejercicio2_11 {

    public static void main(String[] args) {
        System.out.println("Indique un número entre 1-7: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("El número 1 corresponde a Lunes.");
                break;
            case 2:
                System.out.println("El número 2 corresponde a Martes.");
                break;
            case 3:
                System.out.println("El número 3 corresponde a Miércoles.");
                break;
            case 4:
                System.out.println("El número 4 corresponde a Jueves.");
                break;
            case 5:
                System.out.println("El número 5 corresponde a Viernes.");
                break;
            case 6:
                System.out.println("El número 6 corresponde a Sábado.");
                break;
            case 7:
                System.out.println("El número 7 corresponde a Domingo.");
                break;
            default:
                System.out.println("Error: El número introducido no es válido.");
                break;
        }

    }

}

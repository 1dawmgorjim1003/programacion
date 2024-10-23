package Ejercicios_Adicionales_Bucles;

import java.util.Scanner;

public class ejercicio7_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); long factorialNumero= 1;
        System.out.print("Indique un número: ");
        int numeroTeclado = sc.nextInt();
        for (int i = 1; i <= numeroTeclado; i++) {
            factorialNumero *= i;
        }
        System.out.println("El factorial de "+numeroTeclado+" es "+factorialNumero);
    }

}

package Ejercicios_PP;

import java.util.Scanner;
import java.lang.*;

public class ejercicio1_9 {

    public static void main(String[] args) {
       System.out.println("Indique un número por teclado: ");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       String var = num%2==0?"Es par":"No es par";
       System.out.println("El numero introducido por teclado es: " + var);
    }

}

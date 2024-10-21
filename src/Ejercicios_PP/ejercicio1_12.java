package Ejercicios_PP;

import java.util.Scanner;
import java.lang.*;

public class ejercicio1_12 {

    public static void main(String[] args) {
        System.out.println("Indique un número por teclado: ");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println("El valor absoluto del número introducido por teclado es: " + Math.abs(num));

    }
}

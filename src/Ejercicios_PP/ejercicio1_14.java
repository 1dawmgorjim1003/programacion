package Ejercicios_PP;

import java.util.Scanner;

public class ejercicio1_14 {

    public static void main(String[] args) {
    System.out.println("Indique un número decimal: ");
    Scanner sc = new Scanner(System.in);
    float num = sc.nextFloat();
    System.out.println("El número redondeado al entero más proximo es: " + Math.round(num));

    }

}

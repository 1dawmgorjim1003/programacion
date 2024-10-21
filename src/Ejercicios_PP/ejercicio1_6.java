package Ejercicios_PP;

import java.util.Scanner;

public class ejercicio1_6 {

    public static void main(String[] args) {
        float sum = 0;
        System.out.println("Indique una nota por teclado: ");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println("Indique una segunda nota por teclado: ");
        Scanner sd = new Scanner(System.in);
        float num2 = sd.nextFloat();
        sum = (num + num2) / 2;
        System.out.println("La media aritmética de las notas es: " + sum);
    }

}

package Ejercicios_PP;

import java.util.Scanner;

public class ejercicioTablas_Multiplicar_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Indique un número inicial: ");
        int num1=sc.nextInt();
        System.out.print("Indique un número final: ");
        int num2=sc.nextInt();
        for (int i = num1; i <= num2; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("");
        }
    }

}

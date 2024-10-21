package Ejercicios_PP;

import java.util.Scanner;

public class ejercicio1_4 {

    public static void main(String[] args) {
        System.out.println("Indique el año actual por teclado: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Indique su fecha de nacimiento: ");
        Scanner sd = new Scanner(System.in);
        int num2 = sd.nextInt();
        num -= num2;
        System.out.println("La edad del usuario es: " + num);
    }

}


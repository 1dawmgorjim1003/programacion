package Ejercicios_PP;

import java.util.Scanner;
import java.lang.String;
public class ejercicio1_8 {

    public static void main(String[] args) {
        System.out.println("Indique su edad por teclado: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String num2 = num >= 18?"Si":"No";
        System.out.println("¿Es el usuario mayor de edar?: " + num2);
    }

}

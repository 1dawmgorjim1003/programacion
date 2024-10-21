package Ejercicios_Boletin3;

import java.util.Scanner;

public class ejerciciobol3_4 {

    public static void main(String[] args) {
        System.out.println("Indique dos números enteros: ");
        Scanner sc = new Scanner(System.in); Scanner sd = new Scanner(System.in);
        int num = sc.nextInt(); int num2= sc.nextInt();
        if (num%num2==0) {
            System.out.println(num + " es múltiplo de " + num2);
        } else if (num2%num==0) {
            System.out.println(num2 + " es múltiplo de " + num);
        } else {
            System.out.println("Ningún número es múltiplo del otro.");
        }
    }

}

package Ejercicios_Boletin3;

import java.util.Scanner;

public class ejerciciobol3_3 {

    public static void main(String[] args) {
        System.out.println("Indique dos números enteros: ");
        Scanner sc = new Scanner(System.in); Scanner sd = new Scanner(System.in);
        int num = sc.nextInt(); int num2= sc.nextInt();
        if (num%num2==0) {
            System.out.println(num + " es múltiplo de " + num2);
        } else {
            System.out.println(num + " no es múltiplo de " + num2);
        }
    }

}

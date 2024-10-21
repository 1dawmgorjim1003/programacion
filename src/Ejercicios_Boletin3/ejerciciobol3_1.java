package Ejercicios_Boletin3;

import java.util.Scanner;

public class ejerciciobol3_1 {

    public static void main(String[] args) {
        System.out.println("Indique un número real: ");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        if (num<0){
            System.out.println("El número " + num + " es negativo");
        } else if (num>0) {
            System.out.println("El número " + num + " es positivo");
        }else {
            System.out.println("El número " + num + " es igual a 0");
        }
    }
}

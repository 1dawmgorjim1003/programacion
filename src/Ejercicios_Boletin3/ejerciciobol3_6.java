package Ejercicios_Boletin3;

import java.util.Scanner;

public class ejerciciobol3_6 {

    public static void main(String[] args) {
        System.out.println("Indique un número entero: ");
        Scanner sc = new Scanner(System.in);
        String var = sc.next();
        System.out.println("El número " + var + " tiene " + var.length() + " carácteres.");

    }

}

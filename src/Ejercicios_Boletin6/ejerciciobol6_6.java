package Ejercicios_Boletin6;

import java.util.Scanner;

public class ejerciciobol6_6 {

    public static void main(String[] args) {
        System.out.print("Indique un número de tres cifras: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numeroUnidad = numero % 10;
        int numeroDecena = (numero / 10) % 10;
        int numeroCentena = numero / 100;
        System.out.println("Unidad: " + numeroUnidad);
        System.out.println("Decena: " + numeroDecena + "0");
        System.out.println("Centena: " + numeroCentena + "00");

    }

}

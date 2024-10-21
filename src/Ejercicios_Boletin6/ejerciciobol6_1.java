package Ejercicios_Boletin6;

import java.util.Scanner;

public class ejerciciobol6_1 {

    public static void main(String[] args) {
        System.out.print("Indique un número total de segundos: ");
        Scanner sc = new Scanner(System.in);
        long numero = sc.nextLong();
        long horas = numero / 3600;
        System.out.println(horas);
        long minutos = (numero%3600)/60;
        System.out.println(minutos);
        long segundos = numero%60;
        System.out.println(segundos);
        System.out.println("Equivale a: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos" );
    }

}

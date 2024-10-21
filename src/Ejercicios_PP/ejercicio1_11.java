package Ejercicios_PP;

import java.util.Scanner;
import java.lang.*;

public class ejercicio1_11 {

    public static void main(String[] args) {
        double suma=0;
        System.out.println("Indique los kilogramos vendidos de manzanas: ");
        Scanner sc = new Scanner(System.in);
        float manzanas = sc.nextFloat();
        System.out.println("Indique los kilogramos vendidos de peras: ");
        Scanner sd = new Scanner(System.in);
        float peras = sd.nextFloat();
        suma = (manzanas*2)*2.35 + (peras*2)*1.95;
        System.out.println("Las ventas totales han sido: " + suma + " €");
    }

}

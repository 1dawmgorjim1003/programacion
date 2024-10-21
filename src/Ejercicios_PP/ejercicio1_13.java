package Ejercicios_PP;

import java.util.Scanner;

public class ejercicio1_13 {

    public static void main(String[] args) {
        float media=0;
        System.out.println("Indique la notas notas del primer, segundo y tercer trimestre:");
        Scanner sc = new Scanner(System.in); Scanner sd = new Scanner(System.in); Scanner se = new Scanner(System.in);
        float num = sc.nextFloat(); float num2 = sd.nextFloat(); float num3 = se.nextFloat();
        media = (num + num2 + num3) / 3;
        System.out.println("La nota media del curso en el expediente académico es: " + media);
        System.out.println("La nota media del curso en el boletín de calificaciones es: " + (long) media);

    }

}

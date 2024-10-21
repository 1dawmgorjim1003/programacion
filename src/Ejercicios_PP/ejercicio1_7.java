package Ejercicios_PP;

import java.util.Scanner;

public class ejercicio1_7 {

    public static void main(String[] args) {
        double area=0; double lon=0;
        System.out.println("Introduzca el radio de la circunferencia: ");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        area = Math.PI * Math.pow(num,2);
        lon = (2 * Math.PI) * num;
        System.out.println("El area de la circunferencia es: " + area);
        System.out.println("La longitud de la circunferencia es: " + lon);


    }

}

package Ejercicios_Boletin3;

import java.util.Scanner;

public class ejerciciobol3_8 {

    public static void main(String[] args) {
        double area=0; double lon=0;
        System.out.println("Introduzca el radio de la circunferencia: ");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        area = Math.PI * Math.pow(num,2);
        System.out.println("Ingrese la base del triangulo: ");
        Scanner sd = new Scanner(System.in);
        double base = sd.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        Scanner se = new Scanner(System.in);
        double altura = se.nextDouble();
        double area2 = (base * altura) / 2;
        if (area>area2) {
            System.out.println("El círculo es mayor que el triángulo, con una área de " + area);
        } else {
            System.out.println("El triángulo es mayor que el círculo, con una área de " + area2);
        }

    }

}

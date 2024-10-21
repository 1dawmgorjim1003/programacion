package Ejercicios_Boletin3;

import java.util.Scanner;

public class ejerciciobol3_7 {

    public static void main(String[] args) {
        System.out.println("Indique un número real: ");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        if (num>=0 && num<5) {
            System.out.println(num + " ES INSUFICIENTE.");
        } else if (num>=5 && num<6) {
            System.out.println(num + " ES SUFICIENTE.");
        } else if (num>=6 && num<7) {
            System.out.println(num + " ES BIEN.");
        } else if (num>=7 && num<9) {
            System.out.println(num + " ES NOTABLE.");
        } else if (num==9 || num==10) {
            System.out.println(num + " ES SOBRESALIENTE.");
        } else {
            System.out.println("Error: Número no válido.");
        }

    }

}

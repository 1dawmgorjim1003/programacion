package Ejercicios_Boletin5;

import java.util.Scanner;

public class ejerciciobol5_7 {

    public static void main(String[] args) {
        int suma = 0; int suma2=1;
        while (suma2>0) {
            System.out.println("Introduzca un número positivo: ");
            Scanner sc = new Scanner(System.in);
            suma2 = sc.nextInt();
            if (suma2>0){
                suma=suma+suma2;
            } else {
                break;
            }
        }
        System.out.println("La suma de los números positivos es: " + suma);
    }

}

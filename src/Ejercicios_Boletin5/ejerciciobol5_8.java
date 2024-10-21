package Ejercicios_Boletin5;

import java.util.Scanner;

public class ejerciciobol5_8 {

    public static void main(String[] args) {
        int cont = 0;
        int suma=1;
        while (suma>0) {
            System.out.println("Introduzca un número positivo: ");
            Scanner sc = new Scanner(System.in);
            suma = sc.nextInt();
            if (suma>0){
                cont++;
            } else {
                break;
            }
        }
        System.out.println("El usuario ha introducido los siguientes números por pantalla " + cont);
    }

}

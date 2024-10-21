package Ejercicios_PP;

import java.util.Scanner;

public class ejercicio5_9 {

    public static void main(String[] args) {
        int cont = 0;
        int suma=1;
        int suma2=1;
        while (suma>0) {
            System.out.println("Introduzca un número positivo: ");
            Scanner sc = new Scanner(System.in);
            suma = sc.nextInt();
            if (suma>0){
                suma2=suma+suma2;
                cont++;
            } else {
                break;
            }
        }
        int media=suma2/cont;
        System.out.println("La media de los números positivos es" + media);
    }

}

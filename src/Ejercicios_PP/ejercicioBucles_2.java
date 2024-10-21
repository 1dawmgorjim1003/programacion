package Ejercicios_PP;

import java.util.Scanner;

public class ejercicioBucles_2 {

    public static void main(String[] args) {
        int numero=1; int esMayorPares=0; int mediaImpares=0; int contImpares=0; int contNumeros=0;
        while (numero>0) {
            System.out.println("Indique un número: ");
            Scanner sc= new Scanner(System.in);
            numero = sc.nextInt();
            if (numero%2==0) {
                if (numero>esMayorPares) {
                    esMayorPares=numero;
                }
            } else {
                mediaImpares+=numero;
                contImpares++;
            }
            contNumeros++;
        }
        System.out.println("Se han introducido " + contNumeros + " números.");
        System.out.println("La media de los impares es " + (mediaImpares/contImpares));
        System.out.println("El mayor de los números pares es " + esMayorPares);
    }

}

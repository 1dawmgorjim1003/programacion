package Ejercicios_Boletin6;

import java.util.Scanner;

public class ejerciciobol6_7 {

    public static void main(String[] args) {
        float numeroDosCifras=10; float numeroTresCifras=100; float numero=0;
        do {
            System.out.print("Indique un número de una o dos cifras: ");
            Scanner sc = new Scanner(System.in);
            numero = sc.nextFloat();
        } while (numero>numeroTresCifras);
        if (numero<10) {
            numeroDosCifras=numeroDosCifras-numero;
            System.out.print("Para que " + numero + " sea un número de 2 cifras, le falta " + numeroDosCifras);
        } else {
            numeroTresCifras=numeroTresCifras-numero;
            System.out.print("Para que " + numero + " sea un número de 3 cifras, le falta " + numeroTresCifras);
        }

    }

}

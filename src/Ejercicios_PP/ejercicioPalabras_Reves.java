package Ejercicios_PP;

import java.util.Scanner;

public class ejercicioPalabras_Reves {

    public static void main(String[] args) {
        String palabrasReves=""; String palabrasNormal=""; String acumuladorPalabras="";
        System.out.print("Indique el numero de palabras al reves: ");
        Scanner sa = new Scanner(System.in);
        int operadorNum = sa.nextInt();
        for (int i=0; i<operadorNum; i++) {
            System.out.println("Indique una palabra: ");
            palabrasNormal = sa.next();
            acumuladorPalabras=palabrasNormal+ " "+acumuladorPalabras+" ";
        }
        System.out.println("La frase al revés es: " + acumuladorPalabras);
    }

}

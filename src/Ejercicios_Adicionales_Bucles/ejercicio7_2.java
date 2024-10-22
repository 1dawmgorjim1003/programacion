package Ejercicios_Adicionales_Bucles;

import java.util.Scanner;

public class ejercicio7_2 {

    public static void main(String[] args) {
        int num=7; int numeroMultiplicador=0; int cont=1;
        while (numeroMultiplicador<98) {
            numeroMultiplicador=num*cont;
            System.out.println(numeroMultiplicador);
            cont++;
        }
    }

}

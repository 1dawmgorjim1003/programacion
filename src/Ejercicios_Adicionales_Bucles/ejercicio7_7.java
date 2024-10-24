package Ejercicios_Adicionales_Bucles;

import java.util.Scanner;

public class ejercicio7_7 {

    public static void main(String[] args) {
        int cont=2; int contador2=0;
        System.out.print("Indique un número: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for (int i=1; i<=numero; i++) {
            if (i%2==0){
                contador2++;
            }
        }
        System.out.println("Entre 1 y "+numero+" hay "+contador2+" numeros primos.");
    }

}

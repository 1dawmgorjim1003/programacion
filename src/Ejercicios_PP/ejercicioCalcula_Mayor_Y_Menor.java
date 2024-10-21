package Ejercicios_PP;

import java.util.Scanner;

public class ejercicioCalcula_Mayor_Y_Menor {

    public static void main(String[] args) {
        int sumaTodos=0;
        int contPares=0;
        int contNegativos=0;
        int mayorDeTodos=Integer.MIN_VALUE;
        int menorDeTodos=Integer.MAX_VALUE;
        for (int i=0; i<5; i++) {
            System.out.println("Indique un número: ");
            Scanner sc=new Scanner(System.in);
            int numero=sc.nextInt();
            sumaTodos+=numero;
            if (numero%2==0) {
                contPares++;
            }
            if (numero<0) {
                contNegativos++;
            }
            if (numero>mayorDeTodos) {
                mayorDeTodos=numero;
            }
            if (numero<menorDeTodos) {
                menorDeTodos=numero;
            }
        }
        System.out.println("La suma de todos los números es " + sumaTodos);
        System.out.println("La cantidad de números pares introducidos es " + contPares);
        System.out.println("La cantidad de números negativos introducidos es " + contNegativos);
        System.out.println("El número más grande de los 5 es " + mayorDeTodos);
        System.out.println("El número más pequeño de los 5 es " + menorDeTodos);
    }
}


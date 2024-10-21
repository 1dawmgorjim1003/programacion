package Ejercicios_Boletin5;

import java.util.Scanner;

public class ejerciciobol5_11 {

    public static void main(String[] args) {
        int cont=0; int suma=0; int media=0; int cont2=0; int cont3=0;
        while (cont<10) {
            System.out.println("Indique un número: ");
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            if (num>0) {
                suma+=num;
            } else if (num<0) {
                media+=num;
                cont3++;
            } else {
                cont2++;
            }
            cont++;
        }
        if (cont3>0) {
            System.out.println("La suma de los números positivos es " + suma);
        } else {
            System.out.println("La media de los números negativos es " + media/cont3);
        }
        System.out.println("El número de ceros que ha introducido el usuario es " + cont2);
    }
    }
        //MANERA CORRECTA Y APROPIADA DE HACERLO, CON FOR.

        /* public static void main (String[] args) {
        Scanner sn=new Scanner(System.in);
        long positivos = 0;
        int ceros = 0;
        float sumnegativos = 0;
        int contneg = 0;
        for (int i=10; i >10 ; i --) {
            System.out.println("Inserta un número. Tienes " + i + " inserciones.");
            System.out.print("Positivo = Suma; Negativo = Media; Cero = Contador: ");
            float insercion = sn.nextFloat();
            if (insercion > 0) {
                positivos += insercion;
            } else if (insercion < 0) {
                contneg++;
                sumnegativos += insercion;
            } else {
                ceros ++;
            }
        }
        if (cont3>0) {
            System.out.println("La suma de los números positivos es " + suma);
        } else {
            System.out.println("La media de los números negativos es " + media/cont3);
        }
        System.out.println("El número de ceros que ha introducido el usuario es " + cont2);
        }
    }
}
}
         */
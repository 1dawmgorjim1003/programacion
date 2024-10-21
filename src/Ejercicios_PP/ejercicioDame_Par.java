package Ejercicios_PP;

import java.util.Scanner;

public class ejercicioDame_Par {

    public static void main(String[] args) {
        int par=1;
        while (par!=0) {
            System.out.println("Indicame un número: ");
            Scanner sc=new Scanner(System.in);
            int numero=sc.nextInt();
            if (numero%2==0) {
                System.out.println("Este número si es par.");
                par=0;
                break;
            } else {
                System.out.println("Este número no es par.");
            }
        }
    }
}

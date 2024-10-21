package Ejercicios_Boletin5;

import java.util.Scanner;

public class ejerciciobol5_10 {

    public static void main(String[] args) {
        int op=1;
        while (op>0) {
            System.out.println("Introduzca un número (0 para finalizar): ");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();
            if (op==0){
                break;
            } else if (op%2!=0) {
                System.out.println("El número es impar.");
            } else {
                System.out.println("El número es par.");
            }
        }
    }

}

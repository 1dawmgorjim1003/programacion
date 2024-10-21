package Ejercicios_Boletin5;

import java.util.Scanner;

public class ejerciciobol5_1 {

    public static void main(String[] args) {
        System.out.println("Indique un número positivo:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cont=0;
        while (cont<num+1) {
            System.out.println(cont++);
        }
    }

}

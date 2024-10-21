package Ejercicios_Boletin6;

import java.util.Scanner;

public class ejerciciobol6_5 {

    public static void main(String[] args) {
        int num=9; int num2=9;
        for (int i=num; i>=1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(num2);
            }
            num2--;
            System.out.println();
        }
    }

}

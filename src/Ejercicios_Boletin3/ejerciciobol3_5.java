package Ejercicios_Boletin3;

import java.util.Scanner;

public class ejerciciobol3_5 {

    public static void main(String[] args) {
        System.out.println("Indique tres carácteres por teclado:");
        Scanner sc = new Scanner(System.in); Scanner sd = new Scanner(System.in); Scanner se = new Scanner(System.in);
        char caracter = sc.next().charAt(0); char caracter2 = sd.next().charAt(0); char caracter3 = se.next().charAt(0);
        int num = (int) caracter; int num2 = (int) caracter2; ; int num3 = (int) caracter3;
        if (num>num2 && num2>num3){
            System.out.println(caracter + ">" + caracter2 + ">" + caracter3);
        } else if (num>num3 && num3>num2) {
            System.out.println(caracter + ">" + caracter3 + ">" + caracter2);
        } else if (num2>num && num>num3) {
            System.out.println(caracter2 + ">" + caracter + ">" + caracter3);
        } else if (num2>num3 && num3>num) {
            System.out.println(caracter2 + ">" + caracter + ">" + caracter3);
        } else if (num3>num && num>num2) {
            System.out.println(caracter3 + ">" + caracter + ">" + caracter2);
        } else if (num3>num2 && num2>num) {
            System.out.println(caracter3 + ">" + caracter2 + ">" + caracter);
        }

    }
}

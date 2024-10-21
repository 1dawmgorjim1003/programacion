package Ejercicios_Boletin3;

import java.util.Scanner;

public class ejerciciobol3_9 {

    public static void main(String[] args) {
        System.out.println("Indique tres números por teclado:");
        Scanner sc = new Scanner(System.in); Scanner sd = new Scanner(System.in); Scanner se = new Scanner(System.in);
        int num = sc.nextInt(); int num2 = sd.nextInt(); int num3 = se.nextInt();
        if (num+num2==num3){
            System.out.println(num + "+" + num2 + "=" + num3);
        } else if (num+num3==num2) {
            System.out.println(num + "+" + num3 + "=" + num2);
        } else if (num2+num==num3) {
            System.out.println(num2 + "+" + num + "=" + num3);
        } else if (num2+num3==num) {
            System.out.println(num2 + "+" + num3 + "=" + num);
        } else if (num3+num==num2) {
            System.out.println(num3 + "+" + num + "=" + num2);
        } else if (num3+num2==num) {
            System.out.println(num3 + "+" + num2 + "=" + num);
        } else {
            System.out.println("Ningún par de números da la suma del otro.");
        }

    }

}

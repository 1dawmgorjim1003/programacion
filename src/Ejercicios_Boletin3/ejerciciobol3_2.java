package Ejercicios_Boletin3;

import java.util.Scanner;

public class ejerciciobol3_2 {

    public static void main(String[] args) {
        System.out.println("Indique dos números enteros: ");
        Scanner sc = new Scanner(System.in); Scanner sd = new Scanner(System.in);
        int num = sc.nextInt(); int num2= sc.nextInt();
        if (num>num2) {
            System.out.println(num + ">" + num2);
        } else if (num==num2) {
            System.out.println(num + "=" + num2);
        }else {
            System.out.println(num + "<" + num2);
        }
    }

}

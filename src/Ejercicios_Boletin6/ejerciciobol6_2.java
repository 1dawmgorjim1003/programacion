package Ejercicios_Boletin6;

import java.util.Scanner;

public class ejerciciobol6_2 {

    public static void main(String[] args) {
        System.out.print("Indique el día actual: ");
        Scanner sc = new Scanner(System.in);
        int numeroDia = sc.nextInt();
        System.out.print("Indique el mes actual (en numeros): ");
        Scanner sd = new Scanner(System.in);
        int numeroMes = sc.nextInt();
        switch (numeroMes){
            case 1:
                System.out.println("Han pasado " + (numeroDia) + " días desde que empezo el año.");
                break;
            case 2:
                System.out.println("Han pasado " + (numeroDia+30) + " días desde que empezo el año.");
                break;
            case 3:
                System.out.println("Han pasado " + (numeroDia+(30*2)) + " días desde que empezo el año.");
                break;
            case 4:
                System.out.println("Han pasado " + (numeroDia+(30*3)) + " días desde que empezo el año.");
                break;
            case 5:
                System.out.println("Han pasado " + (numeroDia+(30*4)) + " días desde que empezo el año.");
                break;
            case 6:
                System.out.println("Han pasado " + (numeroDia+(30*5)) + " días desde que empezo el año.");
                break;
            case 7:
                System.out.println("Han pasado " + (numeroDia+(30*6)) + " días desde que empezo el año.");
                break;
            case 8:
                System.out.println("Han pasado " + (numeroDia+(30*7)) + " días desde que empezo el año.");
                break;
            case 9:
                System.out.println("Han pasado " + (numeroDia+(30*8)) + " días desde que empezo el año.");
                break;
            case 10:
                System.out.println("Han pasado " + (numeroDia+(30*9)) + " días desde que empezo el año.");
                break;
            case 11:
                System.out.println("Han pasado " + (numeroDia+(30*10)) + " días desde que empezo el año.");
                break;
            case 12:
                System.out.println("Han pasado " + (numeroDia+(30*11)) + " días desde que empezo el año.");
                break;
        }
    }

}

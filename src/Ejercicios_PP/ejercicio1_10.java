package Ejercicios_PP;

import java.util.Scanner;
import java.lang.*;

public class ejercicio1_10 {

    public static void main(String[] args) {
        System.out.println("¿Está lloviendo?: ");
        Scanner sc = new Scanner(System.in);
        boolean llover = sc.nextBoolean();
        System.out.println("¿Has finalizado las tareas?: ");
        Scanner sd = new Scanner(System.in);
        boolean tareas = sd.nextBoolean();
        System.out.println("¿Necesitas ir a la biblioteca?: ");
        Scanner se = new Scanner(System.in);
        boolean biblioteca = se.nextBoolean();
        boolean salir = biblioteca || !llover && tareas;
        System.out.println("¿Se puede salir a la calle?: " + salir);

    }

}

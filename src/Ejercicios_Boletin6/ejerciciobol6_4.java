package Ejercicios_Boletin6;

import java.util.Scanner;

public class ejerciciobol6_4 {

    public static void main(String[] args) {
        System.out.print("Indique el día actual: ");
        Scanner sc = new Scanner(System.in);
        int numeroDiaActual = sc.nextInt();
        System.out.print("Indique el mes actual (en numeros): ");
        Scanner sd = new Scanner(System.in);
        int numeroMesActual = sd.nextInt();
        System.out.print("Indique el año actual: ");
        Scanner se = new Scanner(System.in);
        int numeroAnyoActual = se.nextInt();
        System.out.print("Indique el día de tu cumpleaños: ");
        Scanner sf = new Scanner(System.in);
        int numeroDiaCumple = sf.nextInt();
        System.out.print("Indique el mes de tu cumpleaños (en numeros): ");
        Scanner sg = new Scanner(System.in);
        int numeroMesCumple = sg.nextInt();
        System.out.print("Indique el año de tu cumpleaños: ");
        Scanner sh = new Scanner(System.in);
        int numeroAnyoCumple = sh.nextInt();
        int anyosActuales=numeroAnyoActual-numeroAnyoCumple;
        if (numeroMesActual<=numeroMesCumple) {
            if (numeroDiaActual<=numeroDiaCumple) {
                anyosActuales-=1;
            }
        }
        System.out.println("La edad del usuario es " + anyosActuales);
    }
}

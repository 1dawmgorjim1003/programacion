package Ejercicios_PP;
import java.util.Random;
import java.util.Scanner;
import java.lang.*;
public class ejercicioAdivina_Número {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAzar = (int) ((Math.random())*(50)+1);
        int intentos = 6;
        boolean adivinar = false;
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("El ordenador ha pensado un número entre 1 y 50.");
        System.out.println("Tienes 6 intentos para adivinarlo. ¡Buena suerte!");
        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + ": Ingresa tu número: ");
            int numeroUsuario = sc.nextInt();

            if (numeroUsuario == numeroAzar) {
                System.out.println("¡Felicidades! Has adivinado el número correctamente.");
                adivinar = true;
                break;
            } else if (numeroUsuario < numeroAzar) {
                System.out.println("Tienes que subir más. Intenta de nuevo.");
            } else {
                System.out.println("Tienes que bajar más. Intenta de nuevo.");
            }
        }

        if (!adivinar) {
            System.out.println("Lo siento, has agotado tus 6 intentos. El número era: " + numeroAzar);
        }

    }
}

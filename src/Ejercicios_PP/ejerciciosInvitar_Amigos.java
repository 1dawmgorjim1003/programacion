package Ejercicios_PP;

import java.util.Scanner;

public class ejerciciosInvitar_Amigos {

    public static void main(String[] args) {
        int invitarAmigo=0; int contadorAmigo=0; float dineroParaManana=0;
        System.out.print("Indique cuanta cantidad de dinero tiene: ");
        Scanner sc = new Scanner(System.in);
        float  dineroTengo = sc.nextFloat();
        System.out.print("Indique el precio de un resfresco: ");
        float precioResfresco = sc.nextFloat();
        while (dineroTengo>precioResfresco && invitarAmigo<2) {
            System.out.println("¿Quieres invitar a un amigo?: ");
            System.out.println("");
            System.out.println("1. Sí");
            System.out.println("2. No");
            System.out.println("");
            System.out.print("Indique su respuesta: ");
            invitarAmigo = sc.nextInt();
            switch (invitarAmigo) {
                case 1:
                    dineroTengo=dineroTengo-precioResfresco;
                    contadorAmigo++;
                case 2:
                    break;
                default:
                    System.out.println("Por favor, introduzca 1 o 2.");
            }
        }
        dineroParaManana=(contadorAmigo*precioResfresco);
        System.out.println("He gastado "+dineroParaManana+" en invitar a "+contadorAmigo+" amigos.");
        System.out.println("Me quedan "+dineroTengo+" para mañana.");

        /* OTRA MANERA DE REALIZARLO:
        public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean invitarAmigo = true;
        int contAmigos = 0;
        System.out.print("¿Cuánto dinero tienes hoy?: ");
        float dinero = sc.nextFloat();
        System.out.print("¿Cuál es el precio de los refrescos hoy?: ");
        float precioRefrescos = sc.nextFloat();
        while (invitarAmigo && ((dinero - precioRefrescos) >= 0)) {
            System.out.print("¿Quieres invitar a un amigo? (1:Invitar; 2:No Invitar): ");
            int insercion = sc.nextInt();
            if (insercion == 1) {
                dinero -= precioRefrescos;
                contAmigos ++;
            } else if (insercion == 2) {
                invitarAmigo = false;
            } else {
                System.out.println("Por favor, inserta 1 o 2.");
            }
        }
        System.out.println("Los resultados son...");
        System.out.println("Te queda(n) " + dinero + " euro(s) para mañana.");
        System.out.println("Has invitado a " + contAmigos + " amigos.");
        System.out.println("Hoy te has gastado " + (precioRefrescos*contAmigos) + " euros.");
        }*/
    }

}

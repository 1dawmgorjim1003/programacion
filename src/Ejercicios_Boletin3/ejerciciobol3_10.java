package Ejercicios_Boletin3;

import java.util.Scanner;

public class ejerciciobol3_10 {

    public static void main(String[] args) {
        System.out.println("Indique piedra, papel o tijera:");
        Scanner sc = new Scanner(System.in);
        String var = sc.next();
        System.out.println("Indique piedra, papel o tijera:");
        Scanner sd = new Scanner(System.in);
        String var2 = sd.next();
        if (var=="PIEDRA" && var2=="TIJERA"){
            System.out.println("El jugador 1 ha ganado al jugador 2");
        } else if (var=="PIEDRA" && var2=="PAPEL") {
            System.out.println("El jugador 2 ha ganado al jugador 1");
        } else if (var=="PAPEL" && var2=="PIEDRA") {
            System.out.println("El jugador 1 ha ganado al jugador 2");
        } else if (var=="PAPEL" && var2=="TIJERA") {
            System.out.println("El jugador 2 ha ganado al jugador 1");
        } else if (var=="TIJERA" && var2=="PAPEL") {
            System.out.println("El jugador 1 ha ganado al jugador 2");
        } else if (var=="TIJERA" && var2=="PIEDRA") {
            System.out.println("El jugador 2 ha ganado al jugador 1");
        } else if (var==var2){
            System.out.println("El jugador 1 ha empatado al jugador 2");
        } else {
            System.out.println("Error: Valor no válido.");
        }

    }
}

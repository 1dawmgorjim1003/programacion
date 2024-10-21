package Ejercicios_PP;

public class ejercicioAnidados_2 {

    public static void main(String[] args) {
        System.out.println("*** Ejecución Iniciada. ***");
        int num=5;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }
        System.out.println("*** Ejecución Finalizada. ***");
    }

}

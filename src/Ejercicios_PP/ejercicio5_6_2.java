package Ejercicios_PP;

public class ejercicio5_6_2 {

    public static void main(String[] args) {
        int mult = 1;
        int sum = 0;
        int cont_Menores=0;
        int cont_Mayores=0;
        for (int i = 0; i <= 20; i++) {

            if (i<=5) {
                mult=mult * i;
                cont_Menores++;
            } else {
                sum = sum + i;
                cont_Mayores++;
            }
        }
        System.out.println("Suma de los números mayores de 5: " + sum);
        System.out.println("Multiplicación de los números menores de 5: " + mult);

    }
}

package Ejercicios_PP;
import java.util.Scanner;
public class ejercicioAnidados_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        do {
            System.out.print("Ingresa un valor no negativo (0,1,2...): ");
            num = sc.nextInt();
        } while (num < 0);
        for (int i=num; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

}
}


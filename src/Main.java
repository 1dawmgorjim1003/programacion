import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Indique un número por teclado: ");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println("El número indicado por teclado es " + num);

    }

}
import java.util.Scanner;

public class ejercicio7_6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique un número: ");
        int n=sc.nextInt();
        for (int i=n; i>=0; i--) {
            for (int j=0; j<i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

package Ejercicios_PP;

public class ejercicioCuenta_Numeros {

    public static void main(String[] args) {
        int cont=0; int suma=0;
        for (int i=2; i<=30 ; i+=2) {
            if (i>=10 && i<=20) {

            } else {
                System.out.print(i);
                cont++;
                suma+=i;
            }
        }
        System.out.println("");
        System.out.println("Hay un total de "+cont+" números");
        System.out.println("La suma de todos ellos es "+suma);
    }

}

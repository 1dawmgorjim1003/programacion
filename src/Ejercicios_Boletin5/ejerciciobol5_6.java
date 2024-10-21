package Ejercicios_Boletin5;

public class ejerciciobol5_6 {

    public static void main(String[] args) {
        int suma=0;
        int mult=1;
        int cont1=1;
        int cont2=1;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
                cont1++;
            } else {
                mult = mult * i;
                cont2++;
            }
        }
        System.out.println("La suma de los números pares es " + suma);
        System.out.println("La multiplicación de los números impares " + mult);
        System.out.println("Numeros pares que hay: " + cont1);
        System.out.println("Numeros impares que hay: " + cont2);
    }
}


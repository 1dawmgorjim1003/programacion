package Ejercicios_Adicionales_Bucles;

public class ejercicio7_3 {

    public static void main(String[] args) {
        long numeroProducto=1; int cont=0; int numero=1;
        while (cont<10) {
            if (numero%2!=0) {
                numeroProducto*=numero;
                cont++;
            }
            numero++;
        }
        System.out.println("El producto de los 10 primeros numeros impares es: "+numeroProducto);
    }

}

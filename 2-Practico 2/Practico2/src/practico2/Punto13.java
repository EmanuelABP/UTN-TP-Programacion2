package practico2;

public class Punto13 {

    public static void main(String[] args) {

        // Declaro e inicializo un array con precios de productos
        double[] precios = {199.99, 299.50, 149.75, 399.0, 89.99};

        // Muestro los precios originales usando recursión
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0); // Llamo a la función recursiva empezando desde el índice 0

        // Modifico el precio de un producto específico (por ejemplo, el tercer producto)
        precios[2] = 129.99; // Cambio el valor en el índice 2 del array

        // Muestro los precios modificados usando recursión
        System.out.println("Precios modificados:");
        imprimirArrayRecursivo(precios, 0); // Llamo nuevamente a la función recursiva desde el índice 0
    }

    // Función recursiva para imprimir los elementos del array
    public static void imprimirArrayRecursivo(double[] array, int indice) {
        if (indice < array.length) { // Caso base: cuando el índice es menor al tamaño del array
            System.out.println("Precio: $" + array[indice]); // Imprimo el elemento actual
            imprimirArrayRecursivo(array, indice + 1); // Llamada recursiva con el siguiente índice
        }
    }
}

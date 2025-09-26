package practico2;

public class Punto12 {

    public static void main(String[] args) {

        // Declaro e inicializo un array con precios de productos
        double[] precios = {199.99, 299.50, 149.75, 399.0, 89.99};

        // Muestro los valores originales de los precios
        System.out.println("Precios originales:");
        for (double precio : precios) { // Recorro el array con un for-each
            System.out.println("Precio: $" + precio); // Imprimo cada precio
        }

        // Modifico el precio de un producto específico (por ejemplo, el tercer producto)
        precios[2] = 129.99; // Cambio el valor en el índice 2 del array

        // Muestro los valores modificados del array
        System.out.println("Precios modificados:");
        for (double precio : precios) { // Recorro nuevamente el array con for-each
            System.out.println("Precio: $" + precio); // Imprimo cada precio actualizado
        }
    }
}

package Punto1; // Se declara el paquete Punto1 donde estará esta clase

public class Vehiculo { // Se crea la clase pública Vehiculo
    private String marca; // Variable privada para almacenar la marca del vehículo
    private String modelo; // Variable privada para almacenar el modelo del vehículo

    public Vehiculo(String marca, String modelo) { // Constructor de la clase Vehiculo que recibe marca y modelo
        this.marca = marca; // Se asigna el valor de marca al atributo marca de la clase
        this.modelo = modelo; // Se asigna el valor de modelo al atributo modelo de la clase
    }

    public void mostrarInfo() { // Método público para mostrar la información del vehículo
        System.out.println("Marca: " + marca + ", Modelo: " + modelo); // Imprime marca y modelo
    }

    public String getMarca() { return marca; } // Getter para acceder a la marca desde otras clases
    public String getModelo() { return modelo; } // Getter para acceder al modelo desde otras clases
}

package Punto6; // Trabaja con el paquete Punto6

public class Mesa { // Crea la clase pública Mesa
    private int numero; // Crea la variable privada de tipo int llamada numero
    private int capacidad; // Crea la variable privada de tipo int llamada capacidad

    public Mesa(int numero, int capacidad) { // Constructor público de la clase Mesa
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() { // Método público para obtener el número de la mesa
        return numero;
    }

    public void setNumero(int numero) { // Método público para establecer el número de la mesa
        this.numero = numero;
    }

    public int getCapacidad() { // Método público para obtener la capacidad de la mesa
        return capacidad;
    }

    public void setCapacidad(int capacidad) { // Método público para establecer la capacidad de la mesa
        this.capacidad = capacidad;
    }
}

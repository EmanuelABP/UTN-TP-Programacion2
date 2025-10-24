package Punto2; // Trabaja con el paquete Punto2

public class Bateria { // Crea la clase pública Bateria
    private String modelo; // Crea la variable privada de tipo String llamada modelo
    private int capacidad; // Crea la variable privada de tipo int llamada capacidad

    public Bateria(String modelo, int capacidad) { // Constructor público de la clase Bateria con sus atributos
        this.modelo = modelo; // Inicializa el atributo modelo
        this.capacidad = capacidad; // Inicializa el atributo capacidad
    }

    public String getModelo() { // Método público para obtener el modelo
        return modelo;
    }

    public void setModelo(String modelo) { // Método público para asignar un modelo
        this.modelo = modelo;
    }

    public int getCapacidad() { // Método público para obtener la capacidad
        return capacidad;
    }

    public void setCapacidad(int capacidad) { // Método público para asignar la capacidad
        this.capacidad = capacidad;
    }
}


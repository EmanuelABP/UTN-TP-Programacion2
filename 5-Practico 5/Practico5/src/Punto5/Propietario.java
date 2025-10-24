package Punto5; // Trabaja con el paquete Punto5

public class Propietario { // Crea la clase pública Propietario
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private String dni; // Crea la variable privada de tipo String llamada dni
    private Computadora computadora; // Asociación bidireccional: Propietario ↔ Computadora

    public Propietario(String nombre, String dni) { // Constructor público de la clase Propietario
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { // Método público para obtener el nombre
        return nombre;
    }

    public void setNombre(String nombre) { // Método público para establecer el nombre
        this.nombre = nombre;
    }

    public String getDni() { // Método público para obtener el dni
        return dni;
    }

    public void setDni(String dni) { // Método público para establecer el dni
        this.dni = dni;
    }

    public Computadora getComputadora() { // Método público para obtener la computadora asociada
        return computadora;
    }

    public void setComputadora(Computadora computadora) { // Método público para establecer la computadora asociada
        this.computadora = computadora;
    }
}

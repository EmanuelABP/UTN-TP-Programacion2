package Punto6; // Trabaja con el paquete Punto6

public class Cliente { // Crea la clase pública Cliente
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private String telefono; // Crea la variable privada de tipo String llamada telefono

    public Cliente(String nombre, String telefono) { // Constructor público de la clase Cliente
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() { // Método público para obtener el nombre
        return nombre;
    }

    public void setNombre(String nombre) { // Método público para establecer el nombre
        this.nombre = nombre;
    }

    public String getTelefono() { // Método público para obtener el teléfono
        return telefono;
    }

    public void setTelefono(String telefono) { // Método público para establecer el teléfono
        this.telefono = telefono;
    }
}

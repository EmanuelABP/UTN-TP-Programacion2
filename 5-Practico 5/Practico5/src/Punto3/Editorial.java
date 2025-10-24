package Punto3; // Trabaja con el paquete Punto3

public class Editorial { // Crea la clase pública Editorial
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private String direccion; // Crea la variable privada de tipo String llamada direccion

    public Editorial(String nombre, String direccion) { // Constructor público de la clase Editorial
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() { // Método público para obtener el nombre
        return nombre;
    }

    public void setNombre(String nombre) { // Método público para establecer el nombre
        this.nombre = nombre;
    }

    public String getDireccion() { // Método público para obtener la dirección
        return direccion;
    }

    public void setDireccion(String direccion) { // Método público para establecer la dirección
        this.direccion = direccion;
    }
}

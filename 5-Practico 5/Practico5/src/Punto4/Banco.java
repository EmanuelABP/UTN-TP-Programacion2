package Punto4; // Trabaja con el paquete Punto4

public class Banco { // Crea la clase pública Banco
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private String cuit; // Crea la variable privada de tipo String llamada cuit

    public Banco(String nombre, String cuit) { // Constructor público de Banco
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() { // Método público para obtener el nombre
        return nombre;
    }

    public void setNombre(String nombre) { // Método público para establecer el nombre
        this.nombre = nombre;
    }

    public String getCuit() { // Método público para obtener el cuit
        return cuit;
    }

    public void setCuit(String cuit) { // Método público para establecer el cuit
        this.cuit = cuit;
    }
}

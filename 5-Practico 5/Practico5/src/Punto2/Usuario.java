package Punto2; // Trabaja con el paquete Punto2

public class Usuario { // Crea la clase pública Usuario
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private String dni; // Crea la variable privada de tipo String llamada dni
    private Celular celular; // Asociación bidireccional: Usuario ↔ Celular

    public Usuario(String nombre, String dni) { // Constructor público de la clase Usuario
        this.nombre = nombre; // Inicializa el atributo nombre
        this.dni = dni; // Inicializa el atributo dni
    }

    public String getNombre() { // Método público para obtener el nombre
        return nombre;
    }

    public void setNombre(String nombre) { // Método público para asignar el nombre
        this.nombre = nombre;
    }

    public String getDni() { // Método público para obtener el dni
        return dni;
    }

    public void setDni(String dni) { // Método público para asignar el dni
        this.dni = dni;
    }

    public Celular getCelular() { // Método público para obtener el celular (bidireccional)
        return celular;
    }

    public void setCelular(Celular celular) { // Método público para asignar el celular (bidireccional)
        this.celular = celular;
    }
}

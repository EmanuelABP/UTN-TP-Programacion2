package Punto8; // Trabaja con el paquete Punto8

public class Usuario { // Crea la clase pública Usuario
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private String email; // Crea la variable privada de tipo String llamada email

    public Usuario(String nombre, String email) { // Constructor público de la clase Usuario
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() { // Método público para obtener el nombre del usuario
        return nombre;
    }

    public void setNombre(String nombre) { // Método público para establecer el nombre del usuario
        this.nombre = nombre;
    }

    public String getEmail() { // Método público para obtener el email del usuario
        return email;
    }

    public void setEmail(String email) { // Método público para establecer el email del usuario
        this.email = email;
    }
}

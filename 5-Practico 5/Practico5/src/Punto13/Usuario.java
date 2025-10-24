package Punto13; // Trabaja con el paquete Punto13

public class Usuario { // Crea la clase pública Usuario
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private String email; // Crea la variable privada de tipo String llamada email

    public Usuario(String nombre, String email) { // Constructor público
        this.nombre = nombre; // Asigna el valor del parámetro nombre
        this.email = email; // Asigna el valor del parámetro email
    }

    public String getNombre() { // Método para obtener el nombre del usuario
        return nombre;
    }

    public void setNombre(String nombre) { // Método para establecer el nombre del usuario
        this.nombre = nombre;
    }

    public String getEmail() { // Método para obtener el email del usuario
        return email;
    }

    public void setEmail(String email) { // Método para establecer el email del usuario
        this.email = email;
    }
}

package Punto10; // Trabaja con el paquete Punto10

public class ClaveSeguridad { // Crea la clase pública ClaveSeguridad
    private String codigo; // Crea la variable privada de tipo String llamada codigo
    private String ultimaModificacion; // Crea la variable privada de tipo String llamada ultimaModificacion

    public ClaveSeguridad(String codigo, String ultimaModificacion) { // Constructor público
        this.codigo = codigo; // Asigna el valor del parámetro codigo
        this.ultimaModificacion = ultimaModificacion; // Asigna el valor del parámetro ultimaModificacion
    }

    public String getCodigo() { // Método para obtener el código
        return codigo;
    }

    public void setCodigo(String codigo) { // Método para establecer el código
        this.codigo = codigo;
    }

    public String getUltimaModificacion() { // Método para obtener la última modificación
        return ultimaModificacion;
    }

    public void setUltimaModificacion(String ultimaModificacion) { // Método para establecer la última modificación
        this.ultimaModificacion = ultimaModificacion;
    }
}

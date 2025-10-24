package Punto7; // Trabaja con el paquete Punto7

public class Motor { // Crea la clase pública Motor
    private String tipo; // Crea la variable privada de tipo String llamada tipo
    private String numeroSerie; // Crea la variable privada de tipo String llamada numeroSerie

    public Motor(String tipo, String numeroSerie) { // Constructor público de la clase Motor
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() { // Método público para obtener el tipo de motor
        return tipo;
    }

    public void setTipo(String tipo) { // Método público para establecer el tipo de motor
        this.tipo = tipo;
    }

    public String getNumeroSerie() { // Método público para obtener el número de serie
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) { // Método público para establecer el número de serie
        this.numeroSerie = numeroSerie;
    }
}

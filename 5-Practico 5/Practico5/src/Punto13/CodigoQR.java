package Punto13; // Trabaja con el paquete Punto13

public class CodigoQR { // Crea la clase pública CodigoQR
    private String valor; // Crea la variable privada de tipo String llamada valor
    private Usuario usuario; // Asociación unidireccional: CodigoQR → Usuario

    public CodigoQR(String valor, Usuario usuario) { // Constructor público
        this.valor = valor; // Asigna el valor del parámetro valor
        this.usuario = usuario; // Asocia el usuario al CódigoQR
    }

    public String getValor() { // Método para obtener el valor del código QR
        return valor;
    }

    public void setValor(String valor) { // Método para establecer el valor del código QR
        this.valor = valor;
    }

    public Usuario getUsuario() { // Método para obtener el usuario asociado
        return usuario;
    }

    public void setUsuario(Usuario usuario) { // Método para establecer el usuario asociado
        this.usuario = usuario;
    }
}

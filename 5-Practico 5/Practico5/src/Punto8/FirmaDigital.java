package Punto8; // Trabaja con el paquete Punto8

public class FirmaDigital { // Crea la clase pública FirmaDigital
    private String codigoHash; // Crea la variable privada de tipo String llamada codigoHash
    private String fecha; // Crea la variable privada de tipo String llamada fecha
    private Usuario usuario; // Agregación: FirmaDigital → Usuario (el Usuario puede existir sin la FirmaDigital)

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) { 
        // Constructor público de la clase FirmaDigital
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario; // Se establece la relación de agregación con Usuario
    }

    public String getCodigoHash() { // Método público para obtener el código hash
        return codigoHash;
    }

    public void setCodigoHash(String codigoHash) { // Método público para establecer el código hash
        this.codigoHash = codigoHash;
    }

    public String getFecha() { // Método público para obtener la fecha de la firma digital
        return fecha;
    }

    public void setFecha(String fecha) { // Método público para establecer la fecha de la firma digital
        this.fecha = fecha;
    }

    public Usuario getUsuario() { // Método público para obtener el usuario asociado
        return usuario;
    }

    public void setUsuario(Usuario usuario) { // Método público para establecer el usuario asociado
        this.usuario = usuario;
    }
}

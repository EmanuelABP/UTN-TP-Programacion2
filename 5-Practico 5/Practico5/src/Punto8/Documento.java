package Punto8; // Trabaja con el paquete Punto8

public class Documento { // Crea la clase pública Documento
    private String titulo; // Crea la variable privada de tipo String llamada titulo
    private String contenido; // Crea la variable privada de tipo String llamada contenido
    private FirmaDigital firmaDigital; // Composición: Documento → FirmaDigital (la firma depende del documento)

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) { 
        // Constructor público de la clase Documento
        this.titulo = titulo;
        this.contenido = contenido;
        // Se crea la FirmaDigital dentro del Documento, indicando una relación de composición
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }

    public String getTitulo() { // Método público para obtener el título del documento
        return titulo;
    }

    public void setTitulo(String titulo) { // Método público para establecer el título del documento
        this.titulo = titulo;
    }

    public String getContenido() { // Método público para obtener el contenido del documento
        return contenido;
    }

    public void setContenido(String contenido) { // Método público para establecer el contenido del documento
        this.contenido = contenido;
    }

    public FirmaDigital getFirmaDigital() { // Método público para obtener la firma digital del documento
        return firmaDigital;
    }
}

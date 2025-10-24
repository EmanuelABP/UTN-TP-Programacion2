package Punto1; //Trabaja con el paquete Punto1

public class Foto { //Crea la clase pública Foto
    private String imagen; //Crea la variable privada de tipo String llamada imagen
    private String formato; //Crea la variable privada de tipo String llamada formato

    public Foto(String imagen, String formato) { //Constructor público de Foto que recibe imagen y formato
        this.imagen = imagen; //Asigna el valor del parámetro imagen a la variable de la clase
        this.formato = formato; //Asigna el valor del parámetro formato a la variable de la clase
    }

    public String getImagen() { //Método público para obtener el valor de imagen
        return imagen; //Devuelve el valor de la variable imagen
    }

    public void setImagen(String imagen) { //Método público para asignar un nuevo valor a imagen
        this.imagen = imagen; //Asigna el nuevo valor a la variable imagen
    }

    public String getFormato() { //Método público para obtener el valor de formato
        return formato; //Devuelve el valor de la variable formato
    }

    public void setFormato(String formato) { //Método público para asignar un nuevo valor a formato
        this.formato = formato; //Asigna el nuevo valor a la variable formato
    }
}

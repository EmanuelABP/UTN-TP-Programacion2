package Punto1; //Trabaja con el paquete Punto1

public class Pasaporte { //Crea la clase pública Pasaporte
    private String numero; //Crea la variable privada de tipo String llamada numero
    private String fechaEmision; //Crea la variable privada de tipo String llamada fechaEmision
    private Foto foto; //Crea la variable privada de tipo Foto (Composición, ciclo de vida depende de Pasaporte)
    private Titular titular; //Crea la variable privada de tipo Titular (Asociación bidireccional)

    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) { 
        //Constructor público de Pasaporte que recibe numero, fechaEmision, foto y titular
        this.numero = numero; //Asigna el valor del parámetro numero a la variable de la clase
        this.fechaEmision = fechaEmision; //Asigna el valor del parámetro fechaEmision a la variable de la clase
        this.foto = foto; //Asigna la foto al pasaporte (Composición)
        this.titular = titular; //Asigna el titular al pasaporte (Asociación bidireccional)

        if (titular != null) { //Verifica si el titular no es nulo
            titular.setPasaporte(this); //Mantiene la conexión bidireccional con el titular
        }
    }

    public String getNumero() { //Método público para obtener el valor de numero
        return numero; //Devuelve el valor de numero
    }

    public void setNumero(String numero) { //Método público para asignar un nuevo valor a numero
        this.numero = numero; //Asigna el nuevo valor a numero
    }

    public String getFechaEmision() { //Método público para obtener el valor de fechaEmision
        return fechaEmision; //Devuelve el valor de fechaEmision
    }

    public void setFechaEmision(String fechaEmision) { //Método público para asignar un nuevo valor a fechaEmision
        this.fechaEmision = fechaEmision; //Asigna el nuevo valor a fechaEmision
    }

    public Foto getFoto() { //Método público para obtener la Foto asociada (Composición)
        return foto; //Devuelve el objeto Foto
    }

    public void setFoto(Foto foto) { //Método público para asignar una nueva Foto
        this.foto = foto; //Asigna la nueva Foto al Pasaporte
    }

    public Titular getTitular() { //Método público para obtener el Titular asociado (bidireccional)
        return titular; //Devuelve el objeto Titular
    }

    public void setTitular(Titular titular) { //Método público para asignar un nuevo Titular
        this.titular = titular; //Asigna el nuevo Titular
        if (titular != null) { //Si el Titular no es nulo
            titular.setPasaporte(this); //Mantiene la conexión bidireccional
        }
    }
}

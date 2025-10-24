package Punto1; //Trabaja con el paquete Punto1

public class Titular { //Crea la clase pública Titular
    private String nombre; //Crea la variable privada de tipo String llamada nombre
    private String dni; //Crea la variable privada de tipo String llamada dni
    private Pasaporte pasaporte; //Crea la variable privada de tipo Pasaporte (Asociación bidireccional)

    public Titular(String nombre, String dni) { //Constructor público que recibe nombre y dni
        this.nombre = nombre; //Asigna el valor del parámetro nombre a la variable de la clase
        this.dni = dni; //Asigna el valor del parámetro dni a la variable de la clase
    }

    public String getNombre() { //Método público para obtener el valor de nombre
        return nombre; //Devuelve el valor de la variable nombre
    }

    public void setNombre(String nombre) { //Método público para asignar un nuevo valor a nombre
        this.nombre = nombre; //Asigna el nuevo valor a la variable nombre
    }

    public String getDni() { //Método público para obtener el valor de dni
        return dni; //Devuelve el valor de la variable dni
    }

    public void setDni(String dni) { //Método público para asignar un nuevo valor a dni
        this.dni = dni; //Asigna el nuevo valor a la variable dni
    }

    public Pasaporte getPasaporte() { //Método público para obtener el Pasaporte asociado (bidireccional)
        return pasaporte; //Devuelve el objeto Pasaporte asociado
    }

    public void setPasaporte(Pasaporte pasaporte) { //Método público para asignar un Pasaporte asociado
        this.pasaporte = pasaporte; //Asigna el objeto Pasaporte a la variable de la clase
    }
}

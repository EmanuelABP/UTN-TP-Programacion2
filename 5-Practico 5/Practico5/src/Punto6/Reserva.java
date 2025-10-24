package Punto6; // Trabaja con el paquete Punto6

public class Reserva { // Crea la clase pública Reserva
    private String fecha; // Crea la variable privada de tipo String llamada fecha
    private String hora; // Crea la variable privada de tipo String llamada hora
    private Cliente cliente; // Asociación unidireccional: Reserva → Cliente
    private Mesa mesa; // Agregación: Reserva → Mesa (la Mesa puede existir sin la Reserva)

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) { 
        // Constructor público de la clase Reserva con sus relaciones
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente; // Se asocia el Cliente (relación unidireccional)
        this.mesa = mesa; // Se asocia la Mesa (relación de agregación)
    }

    public String getFecha() { // Método público para obtener la fecha
        return fecha;
    }

    public void setFecha(String fecha) { // Método público para establecer la fecha
        this.fecha = fecha;
    }

    public String getHora() { // Método público para obtener la hora
        return hora;
    }

    public void setHora(String hora) { // Método público para establecer la hora
        this.hora = hora;
    }

    public Cliente getCliente() { // Método público para obtener el Cliente asociado
        return cliente;
    }

    public void setCliente(Cliente cliente) { // Método público para establecer el Cliente asociado
        this.cliente = cliente;
    }

    public Mesa getMesa() { // Método público para obtener la Mesa asociada
        return mesa;
    }

    public void setMesa(Mesa mesa) { // Método público para establecer la Mesa asociada
        this.mesa = mesa;
    }
}

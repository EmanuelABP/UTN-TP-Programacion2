package Punto9; // Trabaja con el paquete Punto9

public class CitaMedica { // Crea la clase pública CitaMedica
    private String fecha; // Crea la variable privada de tipo String llamada fecha
    private String hora; // Crea la variable privada de tipo String llamada hora
    private Paciente paciente; // Asociación unidireccional: CitaMedica → Paciente
    private Profesional profesional; // Asociación unidireccional: CitaMedica → Profesional

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) { 
        // Constructor público de la clase CitaMedica
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente; // Se establece la relación con Paciente
        this.profesional = profesional; // Se establece la relación con Profesional
    }

    public String getFecha() { // Método público para obtener la fecha de la cita
        return fecha;
    }

    public void setFecha(String fecha) { // Método público para establecer la fecha de la cita
        this.fecha = fecha;
    }

    public String getHora() { // Método público para obtener la hora de la cita
        return hora;
    }

    public void setHora(String hora) { // Método público para establecer la hora de la cita
        this.hora = hora;
    }

    public Paciente getPaciente() { // Método público para obtener el paciente asociado a la cita
        return paciente;
    }

    public Profesional getProfesional() { // Método público para obtener el profesional asociado a la cita
        return profesional;
    }
}

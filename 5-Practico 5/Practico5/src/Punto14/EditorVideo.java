package Punto14; // Trabaja con el paquete Punto14

public class EditorVideo { // Crea la clase pública EditorVideo

    public void exportar(String formato, Proyecto proyecto) { // Dependencia de creación: EditorVideo crea un Render dentro del método
        Render render = new Render(formato, proyecto); // Crea un objeto Render asociado al proyecto
        System.out.println("Proyecto " + proyecto.getNombre() + " exportado en formato " + render.getFormato());
    }
}

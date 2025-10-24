package Punto3; // Se trabaja en el paquete Punto3

public class Main { // Clase principal para ejecutar Punto3

    public static void main(String[] args) {

        // 1. Crear una universidad
        Universidad uni = new Universidad("Universidad Nacional");

        // 2. Crear al menos 3 profesores
        Profesor prof1 = new Profesor("P001", "Ana López", "Matemáticas");
        Profesor prof2 = new Profesor("P002", "Carlos Pérez", "Física");
        Profesor prof3 = new Profesor("P003", "Laura Gómez", "Historia");

        // 3. Crear 5 cursos
        Curso c1 = new Curso("C001", "Álgebra");
        Curso c2 = new Curso("C002", "Cálculo");
        Curso c3 = new Curso("C003", "Física I");
        Curso c4 = new Curso("C004", "Historia Antigua");
        Curso c5 = new Curso("C005", "Historia Moderna");

        // 4. Agregar profesores y cursos a la universidad
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 5. Asignar profesores a cursos
        uni.asignarProfesorACurso("C001", "P001"); // Álgebra -> Ana
        uni.asignarProfesorACurso("C002", "P001"); // Cálculo -> Ana
        uni.asignarProfesorACurso("C003", "P002"); // Física I -> Carlos
        uni.asignarProfesorACurso("C004", "P003"); // Historia Antigua -> Laura
        uni.asignarProfesorACurso("C005", "P003"); // Historia Moderna -> Laura

        // 6. Listar cursos con su profesor y profesores con sus cursos
        System.out.println("---- Cursos ----");
        uni.listarCursos();

        System.out.println("---- Profesores ----");
        uni.listarProfesores();

        // 7. Cambiar profesor de un curso y verificar sincronización
        System.out.println("---- Cambiar profesor de Álgebra a Carlos ----");
        uni.asignarProfesorACurso("C001", "P002"); // Álgebra ahora dictado por Carlos
        uni.listarCursos();
        uni.listarProfesores();

        // 8. Remover un curso y verificar lista del profesor
        System.out.println("---- Eliminar curso C002 (Cálculo) ----");
        uni.eliminarCurso("C002");
        uni.listarCursos();
        uni.listarProfesores();

        // 9. Remover un profesor y dejar profesor = null en sus cursos
        System.out.println("---- Eliminar profesor Laura Gómez ----");
        uni.eliminarProfesor("P003");
        uni.listarCursos();
        uni.listarProfesores();

        // 10. Mostrar reporte: cantidad de cursos por profesor
        System.out.println("---- Reporte cantidad de cursos por profesor ----");
        for (Profesor p : new Profesor[]{prof1, prof2, prof3}) {
            System.out.println(p.getNombre() + " dicta " + p.getCursos().size() + " cursos.");
        }
    }
}

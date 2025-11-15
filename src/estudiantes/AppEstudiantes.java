package estudiantes;

import java.util.ArrayList;
import java.util.List;

public class AppEstudiantes {

    public static void main(String[] args) {

        Curso poo = new Curso("POO101", "Programación Orientada a Objetos", 500.0);

        List<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new EstudianteRegular("E001", "Carlos Pérez", poo, 30.0));
        estudiantes.add(new EstudianteBecado("E002", "María López", poo, 0.40));

        System.out.println("=== Estudiantes registrados ===");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
            System.out.println("Mensualidad: " + e.calcularMensualidad());
        }
    }
}

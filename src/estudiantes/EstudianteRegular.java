package estudiantes;

public class EstudianteRegular extends Estudiante implements Evaluable {

    private double descuento;

    public EstudianteRegular(String codigo, String nombre, Curso curso, double descuento) {
        super(codigo, nombre, curso);
        this.descuento = descuento;
    }

    @Override
    public double calcularMensualidad() {
        return curso.getMensualidadBase() - descuento;
    }

    @Override
    public String evaluar() {
        return "Evaluación: asistencia y participación.";
    }
}

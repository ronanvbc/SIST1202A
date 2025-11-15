package estudiantes;

public class EstudianteBecado extends Estudiante implements Evaluable {

    private double porcentajeBeca;

    public EstudianteBecado(String codigo, String nombre, Curso curso, double porcentajeBeca) {
        super(codigo, nombre, curso);
        this.porcentajeBeca = porcentajeBeca;
    }

    @Override
    public double calcularMensualidad() {
        return curso.getMensualidadBase() * (1 - porcentajeBeca);
    }

    @Override
    public String evaluar() {
        return "Evaluación: proyecto académico adicional.";
    }
}

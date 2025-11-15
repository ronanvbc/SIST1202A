package estudiantes;

public abstract class Estudiante {

    protected String codigo;
    protected String nombre;
    protected Curso curso;

    public Estudiante(String codigo, String nombre, Curso curso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.curso = curso;
    }

    public abstract double calcularMensualidad();

    @Override
    public String toString() {
        return codigo + " - " + nombre + " | Curso: " + curso;
    }
}

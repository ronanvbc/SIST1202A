package estudiantes;

public class Curso {

    private String codigo;
    private String nombre;
    private double mensualidadBase;

    public Curso(String codigo, String nombre, double mensualidadBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.mensualidadBase = mensualidadBase;
    }

    public double getMensualidadBase() {
        return mensualidadBase;
    }

    @Override
    public String toString() {
        return nombre + " (" + codigo + ")";
    }
}

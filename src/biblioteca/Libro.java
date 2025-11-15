package biblioteca;
public class Libro {

   
    private String titulo;
    private Autor autor;
    private int anio;
    private String isbn; // opcional

   
    public Libro(String titulo, Autor autor, int anio, String isbn) {
        setTitulo(titulo); 
        this.autor = autor;
        this.anio = anio;
        this.isbn = isbn;
    }

    public Libro(String titulo, Autor autor, int anio) {
        this(titulo, autor, anio, null);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
        if (isbn != null && !isbn.trim().isEmpty()) {
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("ISBN: No registrado");
        }
        System.out.println("-----------------------------");
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", anio=" + anio +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

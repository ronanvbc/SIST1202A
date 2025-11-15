package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppBiblioteca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Libro> libros = new ArrayList<>();

        try {
            System.out.println("=== Registro de Libros ===");

           
            System.out.print("Ingrese el nombre del autor: ");
            String nombreAutor1 = scanner.nextLine();

            System.out.print("Ingrese la nacionalidad del autor: ");
            String nacionalidad1 = scanner.nextLine();

            Autor autor1 = new Autor(nombreAutor1, nacionalidad1);

            System.out.print("Ingrese el título del libro: ");
            String titulo1 = scanner.nextLine();

            System.out.print("Ingrese el año de publicación: ");
            int anio1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el ISBN (obligatorio para este libro): ");
            String isbn1 = scanner.nextLine();

            Libro libroConIsbn = new Libro(titulo1, autor1, anio1, isbn1);
            libros.add(libroConIsbn);

           
            System.out.println("\n=== Registro de segundo libro (SIN ISBN) ===");

            System.out.print("Ingrese el nombre del autor: ");
            String nombreAutor2 = scanner.nextLine();

            System.out.print("Ingrese la nacionalidad del autor: ");
            String nacionalidad2 = scanner.nextLine();

            Autor autor2 = new Autor(nombreAutor2, nacionalidad2);

            System.out.print("Ingrese el título del libro: ");
            String titulo2 = scanner.nextLine();

            System.out.print("Ingrese el año de publicación: ");
            int anio2 = Integer.parseInt(scanner.nextLine());

            Libro libroSinIsbn = new Libro(titulo2, autor2, anio2);
            libros.add(libroSinIsbn);

     
            System.out.println("\n=== Libros registrados ===");
            for (Libro libro : libros) {
                libro.mostrarInfo();
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: el año debe ser un número válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al registrar el libro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

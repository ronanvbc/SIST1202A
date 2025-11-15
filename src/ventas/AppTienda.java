package ventas;

import java.util.Scanner;

public class AppTienda {

    public static void main(String[] args) {

        Tienda tienda = new Tienda("Tienda Online POO");

        tienda.registrarProducto("Laptop", 3500.0, 5);
        tienda.registrarProducto("Mouse", 50.0, 20);
        tienda.registrarProducto("Teclado", 120.0, 10);

        Scanner scanner = new Scanner(System.in);

        try {
            tienda.listarProductos();

            System.out.println("\n=== Registrar una compra ===");
            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = scanner.nextLine();

            System.out.print("Ingrese la cantidad: ");
            int cantidad = Integer.parseInt(scanner.nextLine());

            tienda.realizarCompra(nombreProducto, cantidad);

            System.out.println();
            tienda.listarProductos();
            System.out.println();
            tienda.listarVentas();

        } catch (NumberFormatException e) {
            System.out.println("Error: la cantidad debe ser un número entero.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al realizar la compra: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

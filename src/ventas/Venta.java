package ventas;

import java.time.LocalDate;

public class Venta {

    private static int contadorId = 1;

    private int id;
    private Producto producto;
    private int cantidad;
    private double total;
    private LocalDate fecha;

    public Venta(Producto producto, int cantidad) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo.");
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero.");
        }

        this.id = contadorId++;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = LocalDate.now();
        this.total = calcularTotal();
    }

    public double calcularTotal() {
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "Venta #" + id +
                " | Producto: " + producto.getNombre() +
                " | Cantidad: " + cantidad +
                " | Total: " + total +
                " | Fecha: " + fecha;
    }
}

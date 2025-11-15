package ventas;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private String nombre;
    private List<Producto> productos;
    private List<Venta> ventas;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    public void registrarProducto(String nombre, double precio, int stock) {
        Producto p = new Producto(nombre, precio, stock);
        productos.add(p);
    }

    public void listarProductos() {
        System.out.println("=== Productos disponibles en " + nombre + " ===");
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    public void listarVentas() {
        System.out.println("=== Ventas realizadas en " + nombre + " ===");
        if (ventas.isEmpty()) {
            System.out.println("No se han registrado ventas.");
        } else {
            for (Venta v : ventas) {
                System.out.println(v);
            }
        }
    }

    private Producto buscarProductoPorNombre(String nombreProducto) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombreProducto)) {
                return p;
            }
        }
        return null;
    }

    public void realizarCompra(String nombreProducto, int cantidad) {
        Producto p = buscarProductoPorNombre(nombreProducto);
        if (p == null) {
            throw new IllegalArgumentException("El producto '" + nombreProducto + "' no existe.");
        }

       
        p.disminuirStock(cantidad);

        Venta venta = new Venta(p, cantidad);
        ventas.add(venta);

        System.out.println("Compra realizada con éxito:");
        System.out.println(venta);
    }
}

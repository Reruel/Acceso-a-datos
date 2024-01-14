package modeloBDSimulacro;

import java.util.List;


public class ProductoView {
	public void mostrarClientes(List<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println("ID: " + producto.getId()); // Imprime el ID del cliente
            System.out.println("Nombre: " + producto.getNombre()); // Imprime el nombre del cliente
            System.out.println("Descripcion: " + producto.getDescripcion()); 
            System.out.println("Fabricante: " + producto.getFabricante());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Numero de Serie: " + producto.getNumSerie());
            System.out.println(); // Imprime una línea en blanco para separar los clientes
        }
	}
}	

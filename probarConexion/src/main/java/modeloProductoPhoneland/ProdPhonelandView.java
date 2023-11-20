package modeloProductoPhoneland;

import java.util.List;


public class ProdPhonelandView {
	public void mostrarClientes(List<ProductoPhoneland> productos) {
        for (ProductoPhoneland producto : productos) {
            System.out.println("ID_producto: " + producto.getId_producto()); 
            System.out.println("ID_proveedor: " + producto.getId_proveedor()); 
            System.out.println("Nombre: " + producto.getNombre());             
            System.out.println("Fabricante: " + producto.getFabricante());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("PVP: " + producto.getPvp());
            System.out.println("Descripcion: " + producto.getDescripcion()); 
            System.out.println("Columna 8: " + producto.getColumna8());
            System.out.println(); 
        }
	}
}

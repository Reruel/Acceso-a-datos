package modeloVentasPhoneland;

import java.util.List;


public class VentasView {
	public void mostrarVentas(List<Ventas> ventas) {
        for (Ventas venta : ventas) {
        	System.out.println("ID_ventas: " + venta.getId_ventas()); 
            System.out.println("ID_producto: " + venta.getId_productos()); 
            System.out.println("ID_cliente: " + venta.getId_clientes()); 
            System.out.println("Fecha de venta: " + venta.getFecha());             
            System.out.println("Unidades: " + venta.getUnidades());
            System.out.println("FEMISION: " + venta.getFemision());
            System.out.println(); 
        }
	}
}

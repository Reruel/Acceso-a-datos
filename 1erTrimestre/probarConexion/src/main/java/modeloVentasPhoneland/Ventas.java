package modeloVentasPhoneland;

import java.sql.Date;

public class Ventas {
	private int id_ventas;
	private int id_productos;
	private int id_clientes;
    private String fecha;
    private int unidades;
    private Date femision;
   
    
    public Ventas(int id_ventas, int id_productos,int id_clientes, 
    		String fecha, int unidades,Date femision) {
        this.id_ventas = id_ventas;
        this.id_productos = id_productos;
        this.id_clientes = id_clientes;
        this.fecha = fecha;
        this.unidades = unidades;
        this.femision = femision;
    }


	public Date getFemision() {
		return femision;
	}


	public int getId_ventas() {
		return id_ventas;
	}


	public int getId_productos() {
		return id_productos;
	}


	public int getId_clientes() {
		return id_clientes;
	}


	public String getFecha() {
		return fecha;
	}


	public int getUnidades() {
		return unidades;
	}
    
}

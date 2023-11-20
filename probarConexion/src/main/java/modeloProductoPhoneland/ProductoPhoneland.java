package modeloProductoPhoneland;

public class ProductoPhoneland {
	private int id_producto;
	private int id_proveedor;
    private String nombre;
    private String fabricante;
    private String precio;
    private float pvp;
    private String descripcion;
    private int columna8;
    
    public ProductoPhoneland(int id_producto,int id_proveedor, String nombre, 
    		 String fabricante, String precio,float pvp, String descripcion, int columna8) {
        this.id_producto = id_producto;
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.precio = precio;
        this.pvp=pvp;
        this.descripcion = descripcion;
        this.columna8=columna8;
    }


    public float getPvp() {
		return pvp;
	}


	public int getColumna8() {
		return columna8;
	}


	public int getId_producto() {
		return id_producto;
	}


	public int getId_proveedor() {
		return id_proveedor;
	}


	public String getNombre() {
        return nombre;
    }

	public String getDescripcion() {
		return descripcion;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getPrecio() {
		return precio;
	}


}

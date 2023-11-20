package modeloBDSimulacro;

public class Producto {
	private int id;
    private String nombre;
    private String descripcion;
    private String fabricante;
    private float precio;
    private int numSerie;

    public Producto(int id, String nombre, String descripcion, String fabricante, float precio,int numSerie) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.precio = precio;
        this.numSerie = numSerie;
    }

    public int getId() {
        return id;
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

	public float getPrecio() {
		return precio;
	}

	public int getNumSerie() {
		return numSerie;
	}

 
}
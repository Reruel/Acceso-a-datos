package modeloVistaControlador;

public class Tvideojuegos {
	private int idjuego;
	private String nombre;
	private int anio;
	private String compañia;
	private float precio;
	private String sinopsis;
	private String plataforma;

	public Tvideojuegos(int idjuego, String nombre, int anio, String compañia, float precio, String sinopsis,
			String plataforma) {
		this.idjuego = idjuego;
		this.nombre = nombre;
		this.anio = anio;
		this.compañia = compañia;
		this.precio = precio;
		this.sinopsis = sinopsis;
		this.plataforma = plataforma;
	}

	public int getIdjuego() {
		return idjuego;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAnio() {
		return anio;
	}

	public String getCompañia() {
		return compañia;
	}

	public float getPrecio() {
		return precio;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public String getPlataforma() {
		return plataforma;
	}
}
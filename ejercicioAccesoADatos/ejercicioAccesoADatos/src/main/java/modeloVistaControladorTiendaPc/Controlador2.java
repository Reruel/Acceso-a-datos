package modeloVistaControladorTiendaPc;



public class Controlador2 {
	private Modelo2 modelo;
	private Vista2 vista;
	
	
	public Controlador2(Modelo2 modelo, Vista2 vista) {
		this.modelo = modelo;
		this.vista = vista;
	}


	public void obtenerYMostrarClientes() {
		vista.mostrarClientes(modelo.obtenerDatosClientes());
        modelo.cerrarConexion();
	}

}

package modeloVistaControladorTiendaPc;



public class Principal2 {

	public static void main(String[] args) {
		 String login = "root";
	        String password = "admin";
	        String url = "jdbc:mysql://localhost/TiendaPc";

	        Modelo2 modelo = new Modelo2(url, login, password);
	        Vista2 vista = new Vista2();
	        Controlador2 controlador = new Controlador2(modelo, vista);

	        controlador.obtenerYMostrarClientes();
	    }

}

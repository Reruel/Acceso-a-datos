package modeloVistaControlador;

public class Principal {

	public static void main(String[] args) {
		        String login = "root";
		        String password = "admin";
		        String url = "jdbc:mysql://localhost/empresa";

		        Modelo modelo = new Modelo(url, login, password);
		        Vista vista = new Vista();
		        Controlador controlador = new Controlador(modelo, vista);

		        controlador.obtenerYMostrarClientes();
		    }


	}

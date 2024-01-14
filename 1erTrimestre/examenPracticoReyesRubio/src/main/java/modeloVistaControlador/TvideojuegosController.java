package modeloVistaControlador;
import java.util.List;
import java.sql.*;

public class TvideojuegosController {
	private TvideojuegosModel model; 
    private TvideojuegosView view;   

    
    public TvideojuegosController(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new TvideojuegosModel(dbURL, dbUser, dbPassword); 
        view = new TvideojuegosView(); 
    }

    
    public void mostrarTvideojuegos() throws SQLException {
        List<Tvideojuegos> datos = model.getAllTvideojuegos();
        view.mostrarClientes(datos); 
    }

    
    public void cerrarConexion() throws SQLException {
        model.close();
    }
}

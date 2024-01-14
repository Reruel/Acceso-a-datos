package modeloProductoPhoneland;

import java.sql.SQLException;
import java.util.List;



public class ProdPhonelandController {
	private ProdPhonelandModel model; 
    private ProdPhonelandView view;   

    
    public ProdPhonelandController(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new ProdPhonelandModel(dbURL, dbUser, dbPassword); 
        view = new ProdPhonelandView(); 
    }


    public void mostrarClientes() throws SQLException {
        List<ProductoPhoneland> clientes = model.getAllProductos(); 
        view.mostrarClientes(clientes); 
    }

    
    public void cerrarConexion() throws SQLException {
        model.close(); 
    }
}

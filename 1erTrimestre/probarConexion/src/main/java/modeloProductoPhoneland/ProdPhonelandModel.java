package modeloProductoPhoneland;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProdPhonelandModel {
	 private Connection conn;

	    // Constructor que recibe la URL de la base de datos, el usuario y la contraseña
	    public ProdPhonelandModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
	        // Establece la conexión con la base de datos
	        conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	    }

	    // Método para obtener todos los clientes de la base de datos y devolverlos como una lista
	    public List<ProductoPhoneland> getAllProductos() throws SQLException {
	        List<ProductoPhoneland> productos = new ArrayList<>(); // Inicializa una lista para almacenar los clientes
	        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM productos"); // Crea una declaración SQL

	        // Ejecuta una consulta SQL para obtener todos los clientes de la tabla "clientes"
	        ResultSet rs = stmt.executeQuery();

	        // Itera a través de los resultados y crea objetos Cliente para cada fila
	        while (rs.next()) {
	            int id_producto = rs.getInt("id_PRODUCTO");
	            int id_proveedor = rs.getInt("id_proveedor");            
	            String nombre = rs.getString("NOMBRE");	         
	            String fabricante = rs.getString("FABRICANTE");
	            String precio = rs.getString("PRECIO");
	            float pvp = rs.getFloat("PVP");
	            String descripcion = rs.getString("Descripcion");
	            int columna8 = rs.getInt("Columna 8");
	            productos.add(new ProductoPhoneland(id_producto,id_proveedor,nombre, 
	            		fabricante,precio,pvp,descripcion,columna8)); // Agrega cada Cliente a la lista
	        }

	        stmt.close(); // Cierra la declaración
	        rs.close(); // Cierra el resultado
	        return productos; // Devuelve la lista de clientes
	    }

	    // Método para cerrar la conexión a la base de datos
	    public void close() throws SQLException {
	        conn.close();
	    }
}

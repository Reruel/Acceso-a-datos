package modeloVentasPhoneland;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class VentasModel {
	 private Connection conn;
    // Constructor que recibe la URL de la base de datos, el usuario y la contraseña
    public VentasModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
        // Establece la conexión con la base de datos
        conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
    }

    // Método para obtener todos los clientes de la base de datos y devolverlos como una lista
    public List<Ventas> getAllProductos() throws SQLException {
        List<Ventas> ventas = new ArrayList<>(); // Inicializa una lista para almacenar los clientes
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM ventas"); // Crea una declaración SQL

        // Ejecuta una consulta SQL para obtener todos los clientes de la tabla "clientes"
        ResultSet rs = stmt.executeQuery();

        // Itera a través de los resultados y crea objetos Cliente para cada fila
        while (rs.next()) {
            int id_ventas = rs.getInt("id_VENTAS");
            int id_productos= rs.getInt("id_PRODUCTOS");  
            int id_clientes= rs.getInt("id_CLIENTES");       
            String fecha = rs.getString("FECHA_DE_VENTA");	         
            int unidades = rs.getInt("UNIDADES");
            Date femision = rs.getDate("FEMISION");
            ventas.add(new Ventas(id_ventas,id_productos,id_clientes, 
            		fecha,unidades,femision)); // Agrega cada Cliente a la lista
        }

        stmt.close(); // Cierra la declaración
        rs.close(); // Cierra el resultado
        return ventas; // Devuelve la lista de clientes
    }

    // Método para cerrar la conexión a la base de datos
    public void close() throws SQLException {
        conn.close();
    }
}

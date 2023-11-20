package modeloBDSimulacro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductoModel {
    private Connection conn;

    // Constructor que recibe la URL de la base de datos, el usuario y la contraseña
    public ProductoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
        // Establece la conexión con la base de datos
        conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
    }

    // Método para obtener todos los clientes de la base de datos y devolverlos como una lista
    public List<Producto> getAllProductos() throws SQLException {
        List<Producto> productos = new ArrayList<>(); // Inicializa una lista para almacenar los clientes
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM productos"); // Crea una declaración SQL

        // Ejecuta una consulta SQL para obtener todos los clientes de la tabla "clientes"
        ResultSet rs = stmt.executeQuery();

        // Itera a través de los resultados y crea objetos Cliente para cada fila
        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String descripcion = rs.getString("descripcion");
            String fabricante = rs.getString("fabricante");
            float precio = rs.getFloat("precio");
            int numSerie = rs.getInt("numeroSerie");
            productos.add(new Producto(id,nombre, descripcion,fabricante,precio,numSerie)); // Agrega cada Cliente a la lista
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

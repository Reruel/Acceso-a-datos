package examenPracticoReyesRubio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTabla {
	public static void main(String[] args) throws Exception {
		// En esta clase creamos la tabla tvideojuegos con sus campos y mandamos mensaje
		// si se ha creado correctamente o si no, mensaje de error
		Connection conn = null;
		Statement stmt = null;
		String sql = "CREATE TABLE tvideojuegos (idjuego INT PRIMARY KEY," + "nombre VARCHAR(50) NOT NULL, "
				+ "anio INT," + "compañia VARCHAR(50)," + "precio DECIMAL(10, 2)," + "sinopsis VARCHAR(150),"
				+ "plataforma VARCHAR(50))";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/dbgametop", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Creada la tabla tvideojuegos");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

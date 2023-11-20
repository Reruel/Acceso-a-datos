package examenPracticoReyesRubio;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class CrearBD {

	public static void main(String[] args) throws SQLException {
		// En esta clase creamos la base de datos con su nombre y mandamos mensaje a
		// consola de haberse procesado correctamente o te muestra el error.
		Connection conn = null;
		Statement stmt = null;

		String sql = "CREATE DATABASE dbgametop";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
			stmt = conn.createStatement();

			stmt.execute(sql);
			System.out.println("La base de datos dbgametop ok");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
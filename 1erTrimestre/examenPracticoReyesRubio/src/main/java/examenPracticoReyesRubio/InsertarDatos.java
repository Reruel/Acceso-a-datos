package examenPracticoReyesRubio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatos {
	public static void main(String[] args) throws SQLException {
		// En esta clase insertamos datos de la tabla dentro de la tabla tvideojuegos y
		// mostramos mensaje de proceso ejecutado o en caso contrario el error.
		Connection conn = null;
		Statement stmt = null;
		String sql = "INSERT INTO tvideojuegos (idjuego, nombre, anio, compañia, precio, sinopsis, plataforma) "
				+ "VALUES (1, 'The Legend of Zelda: Breath of the Wild', '2017', 'Nintendo', 59.99, 'Aventura epica', 'Nintendo Switch'),"
				+ "(2, 'Red Dead Redemption 2', '2018', 'Rockstar Games', 49.99, 'Aventura del viejo oeste', 'Play Station 4'),"
				+ "(3, 'Minecraft', '2011', 'Mojang', 29.99, 'Mundo abierto y construccion', 'Multiplataforma')";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/dbgametop", "root", "");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Datos insertados en la tabla tvideojuegos");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

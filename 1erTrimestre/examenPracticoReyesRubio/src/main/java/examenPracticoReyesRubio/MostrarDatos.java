package examenPracticoReyesRubio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MostrarDatos {
	public static void main(String[] args) {
		// En esta clase lo que hacemos es mostrar los datos que ya hemos insertado
		// anteriormente y mostrarmos mensaje de éxito o error en cada caso.
		Connection conn = null;
		Statement stmt = null;
		String sql = "SELECT * FROM tvideojuegos";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/dbgametop", "root", "");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int idjuego = rs.getInt("idjuego");
				String nombre = rs.getString("nombre");
				int anio = rs.getInt("anio");
				String compania = rs.getString("compañia"); // te lo pongo con n por si no te carga la ñ
				float precio = rs.getFloat("precio");
				String sinopsis = rs.getString("sinopsis");
				String plataforma = rs.getString("plataforma");

				System.out.println("idjuego: " + idjuego + ", nombre: " + nombre + ", anio: " + anio + ", compañia: "
						+ compania + ", precio: " + precio + ", sinopsis: " + sinopsis + ", plataforma: " + plataforma);
			}
			rs.close();
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
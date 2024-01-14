package modeloVistaControlador;

import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class TvideojuegosModel {
	private Connection conn;

	public TvideojuegosModel(String dbURL, String dbUser, String dbPassword) throws SQLException {

		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	public List<Tvideojuegos> getAllTvideojuegos() throws SQLException {
		List<Tvideojuegos> datos = new ArrayList<>();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM clientes");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int idjuego = rs.getInt("idjuego");
			String nombre = rs.getString("nombre");
			int anio = rs.getInt("anio");
			String compañia = rs.getString("compañia");
			float precio = rs.getFloat("precio");
			String sinopsis = rs.getString("sinopsis");
			String plataforma = rs.getString("plataforma");

			datos.add(new Tvideojuegos(idjuego, nombre, anio, compañia, precio, sinopsis, plataforma));
		}

		stmt.close();
		rs.close();
		return datos;
	}

	public void close() throws SQLException {
		conn.close();
	}
}

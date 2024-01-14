package examenPracticoReyesRubio;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class EjecutarProcedimiento {

	public static void main(String[] args) {
		// En esta clase ejecutamos el proceso que hicimos en CrearProcedimiento y
		// mostramos mensaje de error en caso de fallar o mensaje de acierto
		Connection conn = null;

		CallableStatement cstmt = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/dbgametop", "root", "");

			cstmt = conn.prepareCall("call nombrejuego()");

			cstmt.execute();

			ResultSet rs = cstmt.getResultSet();

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

			System.out.println("Procedimiento ejecutado");

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
package examenPracticoReyesRubio;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class CrearProcedimiento {

	public static void main(String[] args) {
		// En esta clase borramos el procedimiento en caso de existir y posteriormente
		// creamos uno donde vemos todo lo que hay en la bd dbgametop
		Connection conn = null;
		PreparedStatement presta = null;

		String dropProcedure = "DROP PROCEDURE IF EXISTS nombrejuego";
		String createProcedure = "CREATE PROCEDURE nombrejuego() " + "BEGIN " + "SELECT * FROM tvideojuegos;" + "END;";

		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost/dbgametop", "root", "");

			presta = conn.prepareStatement(dropProcedure);

			presta.executeUpdate();

			presta = conn.prepareStatement(createProcedure);

			presta.executeUpdate();

			System.out.println("Procedimiento creado");

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
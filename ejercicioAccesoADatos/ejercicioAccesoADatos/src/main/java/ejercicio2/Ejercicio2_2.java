package ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio2_2 {

	public static void main(String[] args) {
		Connection conect = null;
		Statement stmt = null;
		
		String sql =/*"CREATE DATABASE TiendaPc;";*/
				
				"CREATE TABLE productos(id INT PRIMARY KEY,"
				+ "nombreProd VARCHAR(40) NOT NULL,"
				+ "fabricante VARCHAR(30))";
		try {
			conect = DriverManager.getConnection("jdbc:mysql://localhost/TiendaPc","root","admin");
			stmt=conect.createStatement();
			stmt.execute(sql);
			System.out.println("tabla creada");
			conect.close();
			stmt.close();
		}catch(SQLException e) {
			System.out.println("Falló");
			e.printStackTrace();
		}

	}

}

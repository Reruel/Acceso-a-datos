package ejercicioAccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTabla {

	public static void main(String[] args) {
		Connection conect = null;
		Statement stmt = null;
		
		String sql =/*"CREATE DATABASE ejercicio1";*/
				
				/*"CREATE TABLE usuario(id INT PRIMARY KEY,"
				+ "nif VARCHAR(10) NOT NULL,"
				+ "nombre VARCHAR(60) NOT NULL,"
				+ "edad INT NOT NULL, "
				+ "ciudad VARCHAR(30))";*/
				
				/*"INSERT INTO usuario(id, nif, nombre, edad, ciudad) VALUES (1,'111','Alberto',40,'Malaga')";*/
				"SELECT * FROM usuario";
		try {
			conect = DriverManager.getConnection("jdbc:mysql://localhost/ejercicio1","root","admin");
			stmt=conect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String nif = rs.getString("nif");
				String nombre = rs.getString("nombre");
				int edad = rs.getInt("edad");
				String ciudad = rs.getString("ciudad");
				
				System.out.println("id: " + id + "\nnif: " + nif + "\nnombre: " + nombre+ "\nedad: " + edad + "\nciudad: " + ciudad);
			}
			conect.close();
			stmt.close();
			rs.close();
		}catch(SQLException e) {
			System.out.println("Falló");
			e.printStackTrace();
		}
		
		

	}

}


package ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio2_4 {
	static String login = "root";
	static String password = "admin";
	static String url = "jdbc:mysql://localhost/TiendaPc";
	public static void main(String[] args) throws Exception{
		   String sql="SELECT * FROM productos";
		   Statement stmt = null;
		   Connection conn = null;
		   try{
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   conn = DriverManager.getConnection(url,login,password);
			   stmt = conn.createStatement();
			   ResultSet rs = stmt.executeQuery(sql);
			   if (conn != null) {
		            System.out.println("Conexión a BBDD "+url+" … Ok");
		            System.out.println("BBDD TiendaPc-Tabla productos");
		            System.out.println("id nombreProd fabricante");
			   }
			   System.out.println("….........................");
			   while(rs.next()) {
				   int id = rs.getInt("id");
				   String np = rs.getString("nombreProd");
				   String fabricante = rs.getString("fabricante");
				   System.out.println(id + " " + np + " " + fabricante);
			   }
			   rs.close();
			   conn.close();
			   stmt.close();
	      }catch(SQLException e){
	    	  System.out.println("Error"+e.getMessage());
	      }
	}
}

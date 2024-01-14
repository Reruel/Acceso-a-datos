package ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio2_3Extra {

		static String login = "root";
		static String password = "admin";
		static String url = "jdbc:mysql://localhost/TiendaPc";
		public static void main(String[] args) throws Exception{
			   String sql=/*"DELETE FROM productos WHERE id = 2";*/
					   "DROP TABLE productos";
			   Statement stmt = null;
			   Connection conn = null;
			   try{
		//Desde aquí se encarga del driver JDBC    
				   conn = DriverManager.getConnection(url,login,password);
				   stmt = conn.createStatement();
				   stmt.executeUpdate(sql);
				   conn.close();
				   stmt.close();
				   //System.out.println("registro eliminado");
				   System.out.println("Tabla eliminada");
		      }catch(SQLException e){
		    	  System.out.println("Error"+e.getMessage());
		      }
		}

	}

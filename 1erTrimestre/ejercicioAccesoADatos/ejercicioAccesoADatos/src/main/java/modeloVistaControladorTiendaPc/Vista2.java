package modeloVistaControladorTiendaPc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Vista2 {
	public void mostrarClientes(ResultSet rs) {
		// TODO Auto-generated method stub
		if(rs!=null) {
			System.out.println("BBDD TiendaPc - Tabla productos");
			System.out.println("id | nombreProd | fabricante");
			System.out.println("-------------------");
			try {
				while(rs.next()) {
					int id = rs.getInt("id");
					String nombreProd = rs.getString("nombreProd");
					String fabricante = rs.getString("fabricante");
					System.out.println(id+ " " + nombreProd+" "+fabricante);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Error");
		}
	}
}

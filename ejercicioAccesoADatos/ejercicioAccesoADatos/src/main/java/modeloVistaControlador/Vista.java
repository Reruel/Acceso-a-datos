package modeloVistaControlador;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Vista {

	public void mostrarClientes(ResultSet rs) {
		// TODO Auto-generated method stub
		if(rs!=null) {
			System.out.println("BBDD empresa - Tabla clientes");
			System.out.println("id | nif | nombre");
			System.out.println("-------------------");
			try {
				while(rs.next()) {
					String id = rs.getString("id");
					String nif = rs.getString("nif");
					String nombre = rs.getString("nombre");
					System.out.println(id+ " " + nif+" "+nombre);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Error");
		}
	}

}

package modeloVistaControlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Modelo {
	private Connection conn;
	public Modelo(String url, String login, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,login,password);	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet obtenerDatosClientes() {
		try {
			Statement consulta= conn.createStatement();
			String sql = "SELECT * FROM clientes";
			return consulta.executeQuery(sql);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void cerrarConexion() {
		try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}

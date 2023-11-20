package modeloVistaControlador;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost/dbgametop"; 
        String dbUser = "root"; // 
        String dbPassword = ""; // 

        try {
            TvideojuegosController controller = new TvideojuegosController(dbURL, dbUser, dbPassword);
            controller.mostrarTvideojuegos(); 
            controller.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }
}

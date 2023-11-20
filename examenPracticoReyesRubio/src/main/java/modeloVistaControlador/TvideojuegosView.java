package modeloVistaControlador;

import java.util.List;
import java.sql.Connection;

public class TvideojuegosView {

	public void mostrarClientes(List<Tvideojuegos> datos) {
		for (Tvideojuegos datos1 : datos) {
			System.out.println("ID juego: " + datos1.getIdjuego());
			System.out.println("Nombre: " + datos1.getNombre());
			System.out.println("Año: " + datos1.getAnio());
			System.out.println("Compañía: " + datos1.getCompañia());
			System.out.println("Precio: " + datos1.getPrecio());
			System.out.println("Sinopsis: " + datos1.getSinopsis());
			System.out.println("Plataforma: " + datos1.getPlataforma());
			System.out.println();
		}
	}
}
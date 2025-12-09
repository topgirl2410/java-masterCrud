package crud;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 * Clase encargada de gestionar la conexión y las operaciones relacionadas con
 * la base de datos MySQL para la entidad Huesped.
 *
 * Se considera la capa de acceso a datos (DAO) dentro del patrón MVC.
 */
public class DataHuesped {

	/**
	 * Establece y devuelve una conexión con la base de datos MySQL.
	 *
	 * @return un objeto {@link Connection} si la conexión fue exitosa, o null si
	 *         hubo un error.
	 */
	public Connection conectar() {
		Connection cx = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?useSSL=false&serverTimezone=UTC",
					"princess", "Sabater_82");
			System.out.println("✔ Conexión exitosa");
		} catch (SQLException e) {
			System.out.println("❌ Error en la conexión: " + e.getMessage());
		}
		return cx;
	}

	/**
	 * Método principal solo para pruebas de conexión a la base de datos.
	 *
	 * @param args argumentos no utilizados
	 */
	public static void main(String[] cecyto) {
		DataHuesped dh = new DataHuesped();
		dh.conectar();
	}

	/**
	 * Inserta un objeto {@link Huesped} en la base de datos.
	 * 
	 * El método utiliza un PreparedStatement para evitar inyecciones SQL y asegura
	 * que se asignen correctamente los valores del huésped.
	 *
	 * @param h el objeto Huesped que se desea insertar en la base de datos
	 * @return true si la inserción fue exitosa, false si ocurrió algún error
	 * 
	 * 
	 */
	public boolean insertarHuesped(Huesped h) {
		String sql = "INSERT INTO huesped "
				+ "(codigoHuesped, nombre, apellidos, direccion, ciudad, numTarjeta, numHabitacion) "
				+ "VALUES (?,?,?,?,?,?,?)";

		try (Connection cx = conectar(); PreparedStatement ps = cx.prepareStatement(sql)) {

			ps.setInt(1, h.getCodigo());
			ps.setString(2, h.getNombre());
			ps.setString(3, h.getApellidos());
			ps.setString(4, h.getDireccion());
			ps.setString(5, h.getCiudad());
			ps.setString(6, h.getNumTarjeta());
			ps.setInt(7, h.getNumHabitacion());

			return ps.executeUpdate() > 0;

		} catch (SQLException e) {
			System.out.println("❌ Error al insertar: " + e.getMessage());
			return false;
		}
	}
}

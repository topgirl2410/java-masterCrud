package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase DAO (Data Access Object) encargada de gestionar la comunicación entre
 * el programa y la base de datos MySQL para la entidad Huesped.
 *
 * Incluye operaciones como insertar y buscar huéspedes.
 */
public class DataHuesped {

	/**
	 * Establece y devuelve una conexión con la base de datos MySQL.
	 *
	 * @return un objeto {@link Connection} si la conexión fue exitosa, o null si
	 *         ocurrió un error.
	 */
	public Connection conectar() {
		try {
			Connection cx = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/hotel?useSSL=false&serverTimezone=UTC", "princess", "Sabater_82");
			System.out.println("✔ Conexión exitosa");
			return cx;

		} catch (SQLException e) {
			System.out.println("❌ Error en la conexión: " + e.getMessage());
			return null;
		}
	}

	/**
	 * Inserta un nuevo huésped en la base de datos.
	 *
	 * @param h objeto Huesped que se desea guardar.
	 * @return true si la inserción fue exitosa, false si ocurrió un error.
	 */
	public boolean insertarHuesped(Huesped h) {

		String sql = """
				INSERT INTO huesped
				(codigoHuesped, nombre, apellidos, direccion, ciudad, numTarjeta, numHabitacion)
				VALUES (?,?,?,?,?,?,?)
				""";

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
			System.out.println("❌ Error al insertar huésped: " + e.getMessage());
			return false;
		}
	}

	/**
	 * Busca un huésped en la base de datos por su código único.
	 *
	 * @param codigoHuesped código del huésped a buscar.
	 * @return un objeto {@link Huesped} con los datos encontrados, o null si el
	 *         huésped no existe.
	 */
	public Huesped cargarHuesped(int codigoHuesped) {

		String sql = "SELECT * FROM huesped WHERE codigoHuesped = ?";

		try (Connection cx = conectar(); PreparedStatement ps = cx.prepareStatement(sql)) {

			ps.setInt(1, codigoHuesped);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return new Huesped(rs.getInt("codigoHuesped"), rs.getString("nombre"), rs.getString("apellidos"),
						rs.getString("direccion"), rs.getString("ciudad"), rs.getString("numTarjeta"),
						rs.getInt("numHabitacion"));
			}

		} catch (SQLException e) {
			System.out.println("❌ Error al cargar huésped: " + e.getMessage());
		}

		return null;
	}
}

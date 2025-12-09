package crud;

/**
 * Clase que representa a un huésped del hotel. Contiene la información personal
 * y administrativa asociada al cliente dentro del sistema.
 *
 * Esta clase forma parte del modelo dentro del patrón MVC y trabaja junto con
 * DataHuesped para la gestión en la base de datos.
 */
public class Huesped {

	/** Código único que identifica al huésped en la base de datos */
	int codigoHuesped;

	/** Nombre, apellidos, direccion, ciudad, numero de tarjeta del huesped */
	String nombre, apellidos, direccion, ciudad, numTarjeta;

	/** Número de habitación asignada al huésped */
	int numHabitacion;

	/** Objeto de acceso a datos para la gestión del huésped */
	DataHuesped dh = new DataHuesped();

	/**
	 * Constructor completo para crear un huésped con todos los datos requeridos.
	 *
	 * @param codigoHuesped código único del huésped
	 * @param nombre        nombre del huésped
	 * @param apellidos     apellidos del huésped
	 * @param direccion     dirección completa del huésped
	 * @param ciudad        ciudad del huésped
	 * @param numTarjeta    número de tarjeta del huésped
	 * @param numHabitacion número de habitación asignada
	 */

	public Huesped(int codigoHuesped, String nombre, String apellidos, String direccion, String ciudad,
			String numTarjeta, int numHabitacion) {

		this.codigoHuesped = codigoHuesped;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.numTarjeta = numTarjeta;
		this.numHabitacion = numHabitacion;
	}

	/**
	 * Constructor vacío utilizado cuando se requiere construir un huésped sin
	 * parámetros iniciales.
	 */

	public Huesped() {
	}

	/**
	 * Inserta este huésped en la base de datos utilizando la clase DataHuesped.
	 *
	 * @return true si el huésped fue insertado correctamente, false en caso
	 *         contrario.
	 */

	public boolean insertarHuesped() {
		return dh.insertarHuesped(this);
	}

	// GETTERS Y SETTERS

	/**
	 * Obtiene el código único del huésped.
	 * 
	 * @return código del huésped
	 */
	public int getCodigo() {
		return codigoHuesped;
	}

	/**
	 * Establece el código del huésped.
	 * 
	 * @param codigo nuevo código a asignar
	 */
	public void setCodigo(int codigo) {
		this.codigoHuesped = codigo;
	}

	/**
	 * Obtiene el nombre del huésped.
	 * 
	 * @return nombre del huésped
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del huésped.
	 * 
	 * @param nombre nuevo nombre a asignar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene los apellidos del huésped.
	 * 
	 * @return apellidos del huésped
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Establece los apellidos del huésped.
	 * 
	 * @param apellidos nuevos apellidos a asignar
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Obtiene la dirección del huésped.
	 * 
	 * @return dirección del huésped
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Establece la dirección del huésped.
	 * 
	 * @param direccion nueva dirección a asignar
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Obtiene la ciudad del huésped.
	 * 
	 * @return ciudad del huésped
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Establece la ciudad del huésped.
	 * 
	 * @param ciudad nueva ciudad a asignar
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Obtiene el número de tarjeta del huésped.
	 * 
	 * @return número de tarjeta
	 */
	public String getNumTarjeta() {
		return numTarjeta;
	}

	/**
	 * Establece el número de tarjeta del huésped.
	 * 
	 * @param numTarjeta nuevo número de tarjeta a asignar
	 */
	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	/**
	 * Obtiene el número de habitación asignada al huésped.
	 * 
	 * @return número de habitación
	 */
	public int getNumHabitacion() {
		return numHabitacion;
	}

	/**
	 * Establece el número de habitación del huésped.
	 * 
	 * @param numHabitacion nueva habitación a asignar
	 * 
	 * 
	 */
	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}
}

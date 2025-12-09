package crud;

/**
 * Clase que representa a un huésped del hotel. Contiene la información personal
 * y administrativa asociada al cliente dentro del sistema.
 *
 * Esta clase forma parte del modelo dentro del patrón MVC.
 */
public class Huesped {

	/** Código único que identifica al huésped en la base de datos. */
	private int codigoHuesped;

	/** Datos personales del huésped. */
	private String nombre;
	private String apellidos;
	private String direccion;
	private String ciudad;
	private String numTarjeta;

	/** Número de habitación asignada al huésped. */
	private int numHabitacion;

	/**
	 * Constructor completo utilizado para crear un huésped con toda su información.
	 *
	 * @param codigoHuesped código único del huésped.
	 * @param nombre        nombre del huésped.
	 * @param apellidos     apellidos del huésped.
	 * @param direccion     dirección del huésped.
	 * @param ciudad        ciudad de residencia del huésped.
	 * @param numTarjeta    número de tarjeta del huésped.
	 * @param numHabitacion número de habitación asignada.
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
	 * Constructor vacío utilizado para crear un huésped sin datos iniciales.
	 */
	public Huesped() {
	}

	// -------------------
	// GETTERS Y SETTERS
	// -------------------

	/**
	 * Obtiene el código único del huésped.
	 * 
	 * @return el código del huésped.
	 */
	public int getCodigo() {
		return codigoHuesped;
	}

	/**
	 * Asigna un nuevo código al huésped.
	 * 
	 * @param codigo nuevo código del huésped.
	 */
	public void setCodigo(int codigo) {
		this.codigoHuesped = codigo;
	}

	/**
	 * Obtiene el nombre del huésped.
	 * 
	 * @return nombre del huésped.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre del huésped.
	 * 
	 * @param nombre nuevo nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene los apellidos del huésped.
	 * 
	 * @return apellidos del huésped.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Modifica los apellidos del huésped.
	 * 
	 * @param apellidos nuevos apellidos.
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Obtiene la dirección del huésped.
	 * 
	 * @return dirección del huésped.
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Modifica la dirección del huésped.
	 * 
	 * @param direccion nueva dirección.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Obtiene la ciudad del huésped.
	 * 
	 * @return ciudad del huésped.
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Modifica la ciudad del huésped.
	 * 
	 * @param ciudad nueva ciudad.
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Obtiene el número de tarjeta del huésped.
	 * 
	 * @return número de tarjeta.
	 */
	public String getNumTarjeta() {
		return numTarjeta;
	}

	/**
	 * Modifica el número de tarjeta del huésped.
	 * 
	 * @param numTarjeta nuevo número de tarjeta.
	 */
	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	/**
	 * Obtiene el número de habitación asignada.
	 * 
	 * @return número de habitación.
	 */
	public int getNumHabitacion() {
		return numHabitacion;
	}

	/**
	 * Modifica el número de habitación del huésped.
	 * 
	 * @param numHabitacion nueva habitación asignada.
	 */
	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}
}

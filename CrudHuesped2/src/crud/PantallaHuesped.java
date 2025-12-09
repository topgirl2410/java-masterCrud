package crud;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Ventana gráfica encargada de gestionar el CRUD de huéspedes. Permite insertar
 * un nuevo huésped en la base de datos mediante el uso de la clase Huesped y el
 * acceso a datos de DataHuesped.
 *
 * Componentes incluidos: - Campos de texto para datos del huésped - Botones de
 * acción (Insertar, Cargar, Actualizar, Eliminar) - Validaciones básicas de
 * longitud de los campos
 *
 * Esta clase representa la parte "Vista" del patrón MVC.
 */

public class PantallaHuesped {

	/** Ventana principal del programa */
	private JFrame frame;
	/** Campo para introducir el código del huésped */
	private JTextField txtCodigoHuesped;

	/** Campo para introducir el nombre del huésped */
	private JTextField txtNombre;

	/** Campo para introducir el apellido del huésped */
	private JTextField txtApellidos;

	/** Campo para introducir la direccion del huésped */
	private JTextField txtDireccion;

	/** Campo para introducir la ciudad del huésped */
	private JTextField txtCiudad;

	/** Campo para introducir el número de tarjeta */
	private JTextField txtNumTarjeta;

	/** Campo para introducir el número de habitación */
	private JTextField txtNumHabitacion;

	/** Botón para insertar un huésped */
	private JButton btnInsertar;

	/** Botón para cargar los registros (pendiente de implementar) */
	private JButton btnCargar;

	/** Botón para eliminar un huésped (pendiente de implementar) */
	private JButton btnEliminar;

	/** Botón para actualizar los datos de un huésped (pendiente de implementar) */
	private JButton btnActualizar;

	/** Componente spinner no utilizado actualmente */
	private final JSpinner spinner = new JSpinner();

	/**
	 * Método principal que inicia la aplicación. Crea una instancia de
	 * PantallaHuesped y muestra la ventana.
	 *
	 * @param args argumentos de línea de comandos (no utilizados)
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaHuesped window = new PantallaHuesped();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Constructor de la clase que inicializa la interfaz gráfica.
	 */
	public PantallaHuesped() {
		initialize();
	}

	/**
	 * Configura y construye todos los componentes de la interfaz: - Etiquetas -
	 * Campos de texto con validación de longitud - Botones y sus acciones
	 * 
	 * Este método organiza completamente el diseño de la ventana.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("CRUD HUESPED");
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// ----- Etiquetas y campos de texto -----

		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(110, 44, 121, 17);
		frame.getContentPane().add(lblCodigo);

		txtCodigoHuesped = new JTextField();
		txtCodigoHuesped.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtCodigoHuesped.getText().length() >= 5) {
					e.consume();
				}
			}
		});
		txtCodigoHuesped.setBounds(249, 42, 114, 21);
		frame.getContentPane().add(txtCodigoHuesped);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(110, 90, 102, 17);
		frame.getContentPane().add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtNombre.getText().length() >= 30) {
					e.consume();
				}
			}
		});
		txtNombre.setBounds(249, 88, 114, 21);
		frame.getContentPane().add(txtNombre);

		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(110, 131, 102, 17);
		frame.getContentPane().add(lblApellidos);

		txtApellidos = new JTextField();
		txtApellidos.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtApellidos.getText().length() >= 30) {
					e.consume();
				}
			}
		});
		txtApellidos.setBounds(249, 129, 114, 21);
		frame.getContentPane().add(txtApellidos);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(110, 175, 102, 17);
		frame.getContentPane().add(lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtDireccion.getText().length() >= 125) {
					e.consume();
				}
			}
		});
		txtDireccion.setBounds(249, 173, 114, 21);
		frame.getContentPane().add(txtDireccion);

		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(110, 218, 102, 17);
		frame.getContentPane().add(lblCiudad);

		txtCiudad = new JTextField();
		txtCiudad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtCiudad.getText().length() >= 125) {
					e.consume();
				}
			}
		});
		txtCiudad.setBounds(249, 216, 114, 21);
		frame.getContentPane().add(txtCiudad);

		JLabel lblNumTarjeta = new JLabel("Numero Tarjeta");
		lblNumTarjeta.setBounds(110, 264, 102, 17);
		frame.getContentPane().add(lblNumTarjeta);

		txtNumTarjeta = new JTextField();
		txtNumTarjeta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtNumTarjeta.getText().length() >= 30) {
					e.consume();
				}
			}
		});
		txtNumTarjeta.setBounds(249, 262, 114, 21);
		frame.getContentPane().add(txtNumTarjeta);

		JLabel lblNumHabitacion = new JLabel("Numero Habitacion");
		lblNumHabitacion.setBounds(110, 307, 150, 17);
		frame.getContentPane().add(lblNumHabitacion);

		txtNumHabitacion = new JTextField();
		txtNumHabitacion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtNumHabitacion.getText().length() >= 3) {
					e.consume();
				}
			}
		});
		txtNumHabitacion.setBounds(249, 305, 114, 21);
		frame.getContentPane().add(txtNumHabitacion);

		// ---- BOTONES ----

		btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {

			/**
			 * Acción ejecutada al presionar el botón Insertar. Crea un objeto Huesped con
			 * los datos de la interfaz y usa DataHuesped para guardarlo en la base de
			 * datos.
			 */
			public void actionPerformed(ActionEvent e) {
				try {
					Huesped huesped = new Huesped(Integer.parseInt(txtCodigoHuesped.getText()), txtNombre.getText(),
							txtApellidos.getText(), txtDireccion.getText(), txtCiudad.getText(),
							txtNumTarjeta.getText(), Integer.parseInt(txtNumHabitacion.getText()));

					DataHuesped dh = new DataHuesped(); // ⬅️ usamos el DAO
					if (dh.insertarHuesped(huesped)) { // ⬅️ ya no huesped.insertarHuesped()
						JOptionPane.showMessageDialog(null, "Se insertó correctamente");
						limpiar();
					} else {
						JOptionPane.showMessageDialog(null, "Error al insertar");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error al insertar");
				}
			}
		});
		btnInsertar.setBounds(22, 467, 105, 27);
		frame.getContentPane().add(btnInsertar);

		btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {

			/**
			 * Acción ejecutada al presionar el botón Cargar. Pide al usuario un código de
			 * huésped, lo busca en la base de datos y, si existe, rellena los campos del
			 * formulario con sus datos.
			 */
			public void actionPerformed(ActionEvent e) {
				try {
					String input = JOptionPane.showInputDialog("Ingresa el código de huésped a cargar:");

					// Si el usuario cancela o deja vacío
					if (input == null || input.trim().isEmpty()) {
						return;
					}

					int id = Integer.parseInt(input.trim());

					DataHuesped dh = new DataHuesped();
					Huesped h = dh.cargarHuesped(id);

					if (h != null) {
						txtCodigoHuesped.setText(String.valueOf(h.getCodigo()));
						txtNombre.setText(h.getNombre());
						txtApellidos.setText(h.getApellidos());
						txtDireccion.setText(h.getDireccion());
						txtCiudad.setText(h.getCiudad());
						txtNumTarjeta.setText(h.getNumTarjeta());
						txtNumHabitacion.setText(String.valueOf(h.getNumHabitacion()));
					} else {
						JOptionPane.showMessageDialog(null, "No existe ningún huésped con ese código");
					}

				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "El código debe ser un número");
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error al cargar");
				}
			}
		});
		btnCargar.setBounds(154, 467, 105, 27);
		frame.getContentPane().add(btnCargar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(295, 467, 105, 27);
		frame.getContentPane().add(btnEliminar);

		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(432, 467, 105, 27);
		frame.getContentPane().add(btnActualizar);

		JList list = new JList();
		list.setBounds(169, 405, 200, 50);
		frame.getContentPane().add(list);
	}

	/**
	 * Limpia todos los campos de entrada del formulario de la interfaz gráfica.
	 * 
	 * Este método restablece a vacío cada uno de los {@link JTextField} utilizados
	 * para introducir los datos del huésped, permitiendo que el usuario pueda
	 * volver a ingresar información desde cero.
	 * 
	 * Además, devuelve el foco al campo correspondiente al código del huésped para
	 * facilitar una nueva inserción.
	 */
	public void limpiar() {
		txtCodigoHuesped.setText("");
		txtNombre.setText("");
		txtApellidos.setText("");
		txtDireccion.setText("");
		txtCiudad.setText("");
		txtNumTarjeta.setText("");
		txtNumHabitacion.setText("");

		// Coloca el cursor al primer campo
		txtCodigoHuesped.requestFocus();
	}
}

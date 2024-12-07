package ventanaOlvidoContraseña;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class OlvidoContraseña extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textEmailRecupera;
	private DatosOlvidoContraseña datosOlvidoContraseña;
	private JButton btnCancelaRecupera;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlvidoContraseña frame = new OlvidoContraseña();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OlvidoContraseña() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(OlvidoContraseña.class.getResource("/images/ICO.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 250, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		datosOlvidoContraseña = new DatosOlvidoContraseña();
		contentPane.add(datosOlvidoContraseña, BorderLayout.CENTER);

		GridBagLayout gbl_datosOlvidoContraseña = new GridBagLayout();
		gbl_datosOlvidoContraseña.columnWidths = new int[] { 30, 100, 100, 100, 100, 30 }; // Añadí valores en las													// centrar mejor.
		gbl_datosOlvidoContraseña.rowHeights = new int[] { 30, 50, 50, 50, 50, 50, 50, 30 }; // Ajusta la altura de
																								// filas.
		gbl_datosOlvidoContraseña.columnWeights = new double[] {0.1, 1.0, 1.0, 1.0, 1.0, 0.1 };
		gbl_datosOlvidoContraseña.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0 };
		datosOlvidoContraseña.setLayout(gbl_datosOlvidoContraseña);

		JLabel lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(OlvidoContraseña.class.getResource("/images/Logo.jpg")));
		GridBagConstraints gbc_lblImagen = new GridBagConstraints();
		gbc_lblImagen.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagen.gridx = 1;
		gbc_lblImagen.gridy = 0;
		gbc_lblImagen.gridwidth = 4;
		datosOlvidoContraseña.add(lblImagen, gbc_lblImagen);

		// Etiqueta centrada
		JLabel lblIntroduceEmail = new JLabel("Introduce tu correo electrónico: ");
		lblIntroduceEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblIntroduceEmail = new GridBagConstraints();
		gbc_lblIntroduceEmail.insets = new Insets(5, 5, 5, 5); // Margen interno.
		gbc_lblIntroduceEmail.gridx = 1; // Columna central.
		gbc_lblIntroduceEmail.gridy = 1; // Fila.
		gbc_lblIntroduceEmail.gridwidth = 4; // Ocupa 2 columnas.
		gbc_lblIntroduceEmail.anchor = GridBagConstraints.CENTER; // Centra dentro de la celda.
		datosOlvidoContraseña.add(lblIntroduceEmail, gbc_lblIntroduceEmail);

		// Campo de texto centrado
		textEmailRecupera = new JTextField();
		GridBagConstraints gbc_textEmailRecupera = new GridBagConstraints();
		gbc_textEmailRecupera.insets = new Insets(5, 5, 5, 5);
		gbc_textEmailRecupera.gridx = 1; // Columna central.
		gbc_textEmailRecupera.gridy = 2; // Fila.
		gbc_textEmailRecupera.gridwidth = 4; // Ocupa 2 columnas.
		gbc_textEmailRecupera.fill = GridBagConstraints.HORIZONTAL; // Se expande horizontalmente.
		datosOlvidoContraseña.add(textEmailRecupera, gbc_textEmailRecupera);
		textEmailRecupera.setColumns(10);

		// Botón 1 centrado
		JButton btnAceptaRecupera = new JButton("Aceptar");
		GridBagConstraints gbc_btnAceptaRecupera = new GridBagConstraints();
		gbc_btnAceptaRecupera.insets = new Insets(5, 5, 5, 5);
		gbc_btnAceptaRecupera.gridx = 3; // Columna central izquierda.
		gbc_btnAceptaRecupera.gridy = 5; // Fila.
		gbc_btnAceptaRecupera.gridwidth = 1;
		gbc_btnAceptaRecupera.anchor = GridBagConstraints.CENTER; // Centra dentro de la celda.
		datosOlvidoContraseña.add(btnAceptaRecupera, gbc_btnAceptaRecupera);

		// Botón 2 centrado
		btnCancelaRecupera = new JButton("Cancelar");
		btnCancelaRecupera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GridBagConstraints gbc_btnCancelaRecupera = new GridBagConstraints();
		gbc_btnCancelaRecupera.insets = new Insets(5, 5, 5, 5);
		gbc_btnCancelaRecupera.gridx = 4; // Columna central derecha.
		gbc_btnCancelaRecupera.gridy = 5; // Fila.
		gbc_btnCancelaRecupera.gridwidth = 1;
		gbc_btnCancelaRecupera.anchor = GridBagConstraints.CENTER; // Centra dentro de la celda.
		datosOlvidoContraseña.add(btnCancelaRecupera, gbc_btnCancelaRecupera);

	}

	public DatosOlvidoContraseña getDatosOlvidoContraseña() {
		return datosOlvidoContraseña;
	}

	public JButton getBtnNewButton_1() {
		return btnCancelaRecupera;
	}

	public JTextField getTextField() {
		return textEmailRecupera;
	}
}

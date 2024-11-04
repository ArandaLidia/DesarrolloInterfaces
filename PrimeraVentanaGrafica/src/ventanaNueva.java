import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;

public class ventanaNueva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaNueva frame = new ventanaNueva();
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
	public ventanaNueva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 250, 450, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton botonNuevo = new JButton("Aceptar");
		botonNuevo.setBounds(172, 229, 84, 23);
		botonNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(botonNuevo);
		
		textField = new JTextField();
		textField.setBounds(147, 21, 195, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(64, 24, 49, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(147, 52, 195, 51);
		contentPane.add(textArea);
		
		JLabel lblDescripcin = new JLabel("Descripción");
		lblDescripcin.setBounds(64, 57, 72, 14);
		contentPane.add(lblDescripcin);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto las condiciones de privacidad");
		chckbxNewCheckBox.setBounds(119, 199, 233, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(64, 114, 72, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hombre");
		rdbtnNewRadioButton.setBounds(145, 110, 111, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(147, 136, 111, 23);
		contentPane.add(rdbtnMujer);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(147, 172, 109, 20);
		contentPane.add(passwordField);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(64, 175, 72, 14);
		contentPane.add(lblContrasea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(419, 11, 17, 399);
		contentPane.add(scrollBar);
	}
}

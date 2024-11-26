package ventanasComponentes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.awt.event.ActionEvent;

public class ventanaPrincipal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUser;
	private JTextField textPassword;
	private JButton btnEntrar;
	private JComboBox comboRol;
	private JButton btnClear;
	private JButton btnSalir;
	private final String user = "abc";
	private final String password ="abc";
	private ventanaAlumno vAl;
	private ventanaProfesor vPr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal frame = new ventanaPrincipal();
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
	public ventanaPrincipal(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textUser = new JTextField();
		textUser.setBounds(124, 46, 123, 20);
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setBounds(124, 95, 123, 20);
		contentPane.add(textPassword);
		textPassword.setColumns(10);
		
		JLabel lablUser = new JLabel("USUARIO");
		lablUser.setFont(new Font("Tahoma", Font.BOLD, 14));
		lablUser.setBounds(10, 46, 89, 17);
		contentPane.add(lablUser);
		
		JLabel lablPassword = new JLabel("CONTRASEÑA");
		lablPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lablPassword.setBounds(10, 95, 109, 17);
		contentPane.add(lablPassword);
		
		JLabel lblCargo = new JLabel("CARGO");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCargo.setBounds(10, 142, 68, 17);
		contentPane.add(lblCargo);
		
		comboRol = new JComboBox();
		comboRol.setFont(new Font("Tahoma", Font.PLAIN, 8));
		comboRol.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opción...", "Alumno", "Profesor"}));
		comboRol.setBounds(124, 141, 123, 22);
		contentPane.add(comboRol);
		
		JLabel labelIcon = new JLabel("New label");
		labelIcon.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/imagenes/Universidad-europea-logo_poc9mEM.2e16d0ba.fill-767x384 (1).png")));
		labelIcon.setBounds(257, 68, 163, 75);
		contentPane.add(labelIcon);
		
		btnClear = new JButton("LIMPIAR");
		btnClear.addActionListener(this);
		btnClear.setBounds(127, 215, 89, 23);
		contentPane.add(btnClear);
		
		btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(this);
		btnEntrar.setBounds(235, 215, 89, 23);
		contentPane.add(btnEntrar);
		
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(334, 215, 89, 23);
		contentPane.add(btnSalir);
		
	}
	public JButton getBtnEntrar() {
		return btnEntrar;
	}
	public JComboBox getComboRol() {
		return comboRol;
	}
	public JButton getBtnClear() {
		
		return btnClear;
	}
	public JButton getBtnSalir() {
		return btnSalir;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object object = e.getSource();
		if(e.getSource().equals(btnSalir)) {
			System.exit(EXIT_ON_CLOSE);
		}
		
		if(e.getSource().equals(btnClear)) {
			textPassword.setText("");
			textUser.setText("");
			comboRol.setSelectedIndex(0);
		}
		
		if(object.equals(btnEntrar)) {
			if(textUser.getText().equals("")|| textPassword.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Valores vacíos");
			}else {
				if (comboRol.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(null, "Debe elegir un rol.");
				}else {
					if (textUser.getText().equals(user)|| textPassword.getText().equals(password)) {
						if(comboRol.getSelectedItem().equals("Alumno")) {
							vAl = new ventanaAlumno();
							vAl.setVisible(true);
							dispose();
						}
						if (comboRol.getSelectedItem().equals("Profesor")) {
							vPr=new ventanaProfesor();
							vPr.setVisible(true);
							dispose();
						}
					}else {
						JOptionPane.showMessageDialog(null, "Usuario no encontrado");
					}
				}
			}
		}
		
	}
}

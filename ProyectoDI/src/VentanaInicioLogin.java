import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JSeparator;
import javax.swing.UIManager;

public class VentanaInicioLogin extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel LogoUniDam;
	private JTextField textoUsuario;
	private JTextField textoPassword;
	private JButton btnLimpiar;
	private JButton btnEntrar;
	private JButton btnSalir;
	private JComboBox<String> rolDesplegable;
	private String usuario ="lidia";
	private String password ="1234";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicioLogin frame = new VentanaInicioLogin();
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
	public VentanaInicioLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaInicioLogin.class.getResource("/Images/ICO.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		LogoUniDam = new JPanel();
		LogoUniDam.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(LogoUniDam);
		LogoUniDam.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(VentanaInicioLogin.class.getResource("/Images/Logo1.jpg")));
		lblNewLabel.setBounds(276, 33, 150, 105);
		LogoUniDam.add(lblNewLabel);
		
		JLabel usuario = new JLabel("USUARIO");
		usuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		usuario.setBounds(35, 59, 78, 14);
		LogoUniDam.add(usuario);
		
		JLabel password = new JLabel("CONTRASEÑA");
		password.setFont(new Font("Tahoma", Font.BOLD, 14));
		password.setBounds(35, 108, 116, 14);
		LogoUniDam.add(password);
		
		JLabel rol = new JLabel("CARGO");
		rol.setFont(new Font("Tahoma", Font.BOLD, 14));
		rol.setBounds(35, 153, 78, 14);
		LogoUniDam.add(rol);
		
		rolDesplegable = new JComboBox<String>();
		rolDesplegable.addActionListener(this);
		rolDesplegable.setFont(new Font("Tahoma", Font.PLAIN, 8));
		rolDesplegable.setModel(new DefaultComboBoxModel<String>(new String[] {"Selecciona una opción", "Alumno", "Profesor"}));
		rolDesplegable.setSelectedItem("Selecciona una opción");
		rolDesplegable.setSelectedIndex(0);
		rolDesplegable.setBounds(143, 152, 107, 22);
		LogoUniDam.add(rolDesplegable);
		
		textoUsuario = new JTextField();
		textoUsuario.addActionListener(this);
		textoUsuario.setBounds(143, 58, 107, 20);
		LogoUniDam.add(textoUsuario);
		textoUsuario.setColumns(10);
		
		textoPassword = new JTextField();
		textoPassword.addActionListener(this);
		textoPassword.setBounds(143, 107, 108, 20);
		LogoUniDam.add(textoPassword);
		textoPassword.setColumns(10);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setBackground(Color.LIGHT_GRAY);
		btnLimpiar.setForeground(SystemColor.desktop);
		btnLimpiar.setBounds(143, 212, 86, 23);
		LogoUniDam.add(btnLimpiar);
		
		btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(this);
		btnEntrar.setForeground(SystemColor.desktop);
		btnEntrar.setBackground(Color.LIGHT_GRAY);
		btnEntrar.setBounds(254, 212, 84, 23);
		LogoUniDam.add(btnEntrar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setForeground(SystemColor.desktop);
		btnSalir.setBackground(Color.LIGHT_GRAY);
		btnSalir.setBounds(348, 212, 78, 23);
		LogoUniDam.add(btnSalir);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(35, 185, 391, 17);
		LogoUniDam.add(separator);
	}
	public JButton getBtnLimpiar() {
		return btnLimpiar;
	}
	public JButton getBtnEntrar() {
		return btnEntrar;
	}
	public JButton getBtnSalir() {
		return btnSalir;
	}
	public JComboBox getRolDesplegable() {
		return rolDesplegable;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 int selectedIndex = rolDesplegable.getSelectedIndex();
		if(e.getSource().equals(btnSalir)) {
			System.exit(EXIT_ON_CLOSE);
		}
		if(e.getSource().equals(btnLimpiar)) {
			textoUsuario.setText("");
			textoPassword.setText("");
			rolDesplegable.setSelectedIndex(0);
		}
		if(e.getSource().equals(btnEntrar)) {
			if(textoUsuario.getText().equals(usuario) && textoPassword.getText().equals(password)&&selectedIndex==1|selectedIndex==2) {
				JOptionPane.showMessageDialog(null, "Sesión iniciada con éxito");
			}else if(textoUsuario.getText().equals("") || textoPassword.getText().equals("")){
				JOptionPane.showMessageDialog(null, "Campos vacíos, introduzca datos");
			}else if(selectedIndex==0){
				JOptionPane.showMessageDialog(null, "Elija un tipo de usuario");
			}else {
				JOptionPane.showMessageDialog(null, "Datos incorrectos");
			}
		}
	}
}

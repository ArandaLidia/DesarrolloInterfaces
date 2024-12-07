package registro;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtEmail; // Declarar el JTextField
    private JTextField textNombre;
    private JTextField textApellidos;
    private JTextField textDNI;
    private JPasswordField passwordConfirmContrasenia;
    private JPasswordField passwordContrasenia;
    private JButton btnCancelar;
    private JButton btnAceptar;
    private JCheckBox chckMostrarContraseña;
    private JRadioButton rdbtnProfesor;
    private JRadioButton rdbtnAlumno;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Registro frame = new Registro();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Registro() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Registro.class.getResource("/images/ICO.jpg")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(550, 10, 600, 900);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
        gbl_contentPane.columnWidths = new int[] { 30, 120, 100, 30 };
        gbl_contentPane.rowHeights = new int[] { 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30,30, 30 };
        contentPane.setLayout(gbl_contentPane);

        // Logo
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(Registro.class.getResource("/images/Logo.jpg")));
        GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
        gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_1.gridx = 1;
        gbc_lblNewLabel_1.gridy = 1;
        gbc_lblNewLabel_1.gridwidth = 2;
        contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

        // Título
        JLabel lblNewLabel = new JLabel("Registro de usuarios");
        lblNewLabel.setForeground(new Color(205, 133, 63));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel.gridx = 1;
        gbc_lblNewLabel.gridy = 2;
        gbc_lblNewLabel.gridwidth = 2;
        gbc_lblNewLabel.anchor=GridBagConstraints.WEST;
        contentPane.add(lblNewLabel, gbc_lblNewLabel);

        // Botones de selección
        rdbtnProfesor = new JRadioButton("Profesor");
        rdbtnProfesor.setFont(new Font("Tahoma", Font.PLAIN, 12));
        GridBagConstraints gbc_rdbtnProfesor = new GridBagConstraints();
        gbc_rdbtnProfesor.insets = new Insets(0, 0, 5, 5);
        gbc_rdbtnProfesor.gridx = 1;
        gbc_rdbtnProfesor.gridy = 3;
        gbc_rdbtnProfesor.anchor = GridBagConstraints.WEST;
        contentPane.add(rdbtnProfesor, gbc_rdbtnProfesor);

        rdbtnAlumno = new JRadioButton("Alumno");
        rdbtnAlumno.setFont(new Font("Tahoma", Font.PLAIN, 12));
        GridBagConstraints gbc_rdbtnAlumno = new GridBagConstraints();
        gbc_rdbtnAlumno.insets = new Insets(0, 0, 5, 5);
        gbc_rdbtnAlumno.gridx = 2;
        gbc_rdbtnAlumno.gridy = 3;
        gbc_rdbtnAlumno.anchor = GridBagConstraints.WEST;
        contentPane.add(rdbtnAlumno, gbc_rdbtnAlumno);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdbtnAlumno);
        buttonGroup.add(rdbtnProfesor);
        rdbtnProfesor.setSelected(true);

        // Correo electrónico
        JLabel lblEmail = new JLabel("Correo Electrónico:");
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GridBagConstraints gbc_lblEmail = new GridBagConstraints();
        gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
        gbc_lblEmail.gridx = 1;
        gbc_lblEmail.gridy = 4;
        gbc_lblEmail.anchor = GridBagConstraints.WEST;
        contentPane.add(lblEmail, gbc_lblEmail);

        txtEmail = new JTextField();
        txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
        GridBagConstraints gbc_txtEmail = new GridBagConstraints();
        gbc_txtEmail.gridwidth = 2;
        gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
        gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtEmail.gridx = 1;
        gbc_txtEmail.gridy = 5;
        contentPane.add(txtEmail, gbc_txtEmail);
        txtEmail.setColumns(20);

        // Nombre
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GridBagConstraints gbc_lblNombre = new GridBagConstraints();
        gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
        gbc_lblNombre.gridx = 1;
        gbc_lblNombre.gridy = 6;
        gbc_lblNombre.anchor = GridBagConstraints.WEST;
        contentPane.add(lblNombre, gbc_lblNombre);
        
        textNombre = new JTextField();
        textNombre.setToolTipText("");
        textNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
        GridBagConstraints gbc_textNombre = new GridBagConstraints();
        gbc_textNombre.gridwidth = 2;
        gbc_textNombre.insets = new Insets(0, 0, 5, 5);
        gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
        gbc_textNombre.gridx = 1;
        gbc_textNombre.gridy = 7;
        contentPane.add(textNombre, gbc_textNombre);
        textNombre.setColumns(10);

        // Apellidos
        JLabel lblApellidos = new JLabel("Apellidos:");
        lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
        gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
        gbc_lblApellidos.gridx = 1;
        gbc_lblApellidos.gridy = 8;
        gbc_lblApellidos.anchor = GridBagConstraints.WEST;
        contentPane.add(lblApellidos, gbc_lblApellidos);
        
        textApellidos = new JTextField();
        textApellidos.setToolTipText("");
        textApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textApellidos.setColumns(10);
        GridBagConstraints gbc_textApellidos = new GridBagConstraints();
        gbc_textApellidos.gridwidth = 2;
        gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
        gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
        gbc_textApellidos.gridx = 1;
        gbc_textApellidos.gridy = 9;
        contentPane.add(textApellidos, gbc_textApellidos);

        // Documento de identidad
        JLabel lblDNI = new JLabel("Documento de identidad:");
        lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GridBagConstraints gbc_lblDNI = new GridBagConstraints();
        gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
        gbc_lblDNI.gridx = 1;
        gbc_lblDNI.gridy = 10;
        gbc_lblDNI.anchor = GridBagConstraints.WEST;
        contentPane.add(lblDNI, gbc_lblDNI);
        
        textDNI = new JTextField();
        textDNI.setToolTipText("");
        textDNI.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textDNI.setColumns(10);
        GridBagConstraints gbc_textDNI = new GridBagConstraints();
        gbc_textDNI.gridwidth = 2;
        gbc_textDNI.insets = new Insets(0, 0, 5, 5);
        gbc_textDNI.fill = GridBagConstraints.HORIZONTAL;
        gbc_textDNI.gridx = 1;
        gbc_textDNI.gridy = 11;
        contentPane.add(textDNI, gbc_textDNI);

        // Contraseña
        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GridBagConstraints gbc_lblPassword = new GridBagConstraints();
        gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
        gbc_lblPassword.gridx = 1;
        gbc_lblPassword.gridy = 12;
        gbc_lblPassword.anchor = GridBagConstraints.WEST;
        contentPane.add(lblPassword, gbc_lblPassword);
        
        passwordContrasenia = new JPasswordField();
        passwordContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 14));
        GridBagConstraints gbc_passwordContrasenia = new GridBagConstraints();
        gbc_passwordContrasenia.gridwidth = 2;
        gbc_passwordContrasenia.insets = new Insets(0, 0, 5, 5);
        gbc_passwordContrasenia.fill = GridBagConstraints.HORIZONTAL;
        gbc_passwordContrasenia.gridx = 1;
        gbc_passwordContrasenia.gridy = 13;
        contentPane.add(passwordContrasenia, gbc_passwordContrasenia);

        // Confirmar contraseña
        JLabel lblConfirmPassword = new JLabel("Confirma la contraseña:");
        lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GridBagConstraints gbc_lblConfirmPassword = new GridBagConstraints();
        gbc_lblConfirmPassword.insets = new Insets(0, 0, 5, 5);
        gbc_lblConfirmPassword.gridx = 1;
        gbc_lblConfirmPassword.gridy = 14;
        gbc_lblConfirmPassword.anchor = GridBagConstraints.WEST;
        contentPane.add(lblConfirmPassword, gbc_lblConfirmPassword);
        
        passwordConfirmContrasenia = new JPasswordField();
        passwordConfirmContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 14));
        GridBagConstraints gbc_passwordConfirmContrasenia = new GridBagConstraints();
        gbc_passwordConfirmContrasenia.gridwidth = 2;
        gbc_passwordConfirmContrasenia.insets = new Insets(0, 0, 5, 5);
        gbc_passwordConfirmContrasenia.fill = GridBagConstraints.HORIZONTAL;
        gbc_passwordConfirmContrasenia.gridx = 1;
        gbc_passwordConfirmContrasenia.gridy = 15;
        contentPane.add(passwordConfirmContrasenia, gbc_passwordConfirmContrasenia);
        
        chckMostrarContraseña = new JCheckBox("Mostrar contraseña");
        GridBagConstraints gbc_chckMostrarContraseña = new GridBagConstraints();
        gbc_chckMostrarContraseña.insets = new Insets(0, 0, 5, 5);
        gbc_chckMostrarContraseña.gridx = 1;
        gbc_chckMostrarContraseña.gridy = 16;
        gbc_chckMostrarContraseña.anchor = GridBagConstraints.WEST;
        contentPane.add(chckMostrarContraseña, gbc_chckMostrarContraseña);
        
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        	}
        });
        btnCancelar.setHorizontalAlignment(SwingConstants.RIGHT);
        GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
        gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
        gbc_btnCancelar.gridx = 1;
        gbc_btnCancelar.gridy = 19;
        contentPane.add(btnCancelar, gbc_btnCancelar);
        
        btnAceptar = new JButton("Aceptar");
        GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
        gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
        gbc_btnAceptar.gridx = 2;
        gbc_btnAceptar.gridy = 19;
        gbc_btnAceptar.anchor=GridBagConstraints.EAST;
        contentPane.add(btnAceptar, gbc_btnAceptar);
        
        chckMostrarContraseña.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					passwordContrasenia.setEchoChar((char)0);
					passwordConfirmContrasenia.setEchoChar((char)0);
				}else {
					passwordContrasenia.setEchoChar('●');
					passwordConfirmContrasenia.setEchoChar('●');
				}
				
			}
		});
    }
	public JButton getBtnCancelar() {
		return btnCancelar;
	}
	public JButton getBtnAceptar() {
		return btnAceptar;
	}
	public JCheckBox getChckMostrarContraseña() {
		return chckMostrarContraseña;
	}
	public JRadioButton getRdbtnProfesor() {
		return rdbtnProfesor;
	}
	public JRadioButton getRdbtnAlumno() {
		return rdbtnAlumno;
	}
	public JTextField getTxtEmail() {
		return txtEmail;
	}
	public JTextField getTextNombre() {
		return textNombre;
	}
	public JTextField getTextApellidos() {
		return textApellidos;
	}
	public JTextField getTextDNI() {
		return textDNI;
	}
	public JPasswordField getPasswordContrasenia() {
		return passwordContrasenia;
	}
	public JPasswordField getPasswordConfirmContrasenia() {
		return passwordConfirmContrasenia;
	}
}


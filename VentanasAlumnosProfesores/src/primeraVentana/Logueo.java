package primeraVentana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import registro.Registro;
import ventanaAlumno.Alumno;
import ventanaOlvidoContraseña.OlvidoContraseña;
import ventanaProfesor.ventanaProfesorPrueba;

import javax.swing.ImageIcon;

public class Logueo extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textName;
    private JTextField textPassword;
    private JComboBox<String> cmbCargo;
    private JButton btnRegistrate;
    private JButton btnClear;
    private JButton btnEnter;
    private JButton btnClose;
    private JLabel lblImagen;
    public final static String nombre= "lidia";
    final static String password = "uem";

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Logueo frame = new Logueo();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public Logueo() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(Logueo.class.getResource("/images/ICO.jpg")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(550, 275, 600, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        // Panel inferior con botones
        JPanel panelBotones = new JPanel();
        panelBotones.setBorder(new EmptyBorder(10, 10, 15, 10));
        contentPane.add(panelBotones, BorderLayout.SOUTH);

        btnRegistrate = new JButton("Regístrate");
        btnRegistrate.addActionListener(this); // Asigna el ActionListener
        panelBotones.add(btnRegistrate);

        btnClear = new JButton("Limpiar");
        btnClear.addActionListener(this); // Asigna el ActionListener
        panelBotones.add(btnClear);

        btnEnter = new JButton("Entrar");
        btnEnter.addActionListener(this); // Asigna el ActionListener
        panelBotones.add(btnEnter);

        btnClose = new JButton("Cerrar");
        btnClose.addActionListener(this); // Asigna el ActionListener
        panelBotones.add(btnClose);

        // Panel central con formulario
        JPanel datosLogueo = new JPanel();
        contentPane.add(datosLogueo, BorderLayout.CENTER);
        GridBagLayout gbl_datosLogueo = new GridBagLayout();
        gbl_datosLogueo.columnWidths = new int[] { 100, 0, 100, 50 };
        gbl_datosLogueo.rowHeights = new int[] { 5, 5, 0, 0, 30, 30, 30, 30, 30, 0, 0 };
        gbl_datosLogueo.columnWeights = new double[] { 0.0, 0.0, 1.0 };
        gbl_datosLogueo.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
        datosLogueo.setLayout(gbl_datosLogueo);
        
        lblImagen = new JLabel("");
        lblImagen.setIcon(new ImageIcon(Logueo.class.getResource("/images/Logo1.jpg")));
        GridBagConstraints gbc_lblImagen = new GridBagConstraints();
        gbc_lblImagen.gridwidth = 4;
        gbc_lblImagen.insets = new Insets(0, 0, 5, 5);
        gbc_lblImagen.gridx = 0;
        gbc_lblImagen.gridy = 2;
        datosLogueo.add(lblImagen, gbc_lblImagen);

        // Nombre
        JLabel lblName = new JLabel("Nombre");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 11));
        GridBagConstraints gbc_lblName = new GridBagConstraints();
        gbc_lblName.anchor = GridBagConstraints.EAST;
        gbc_lblName.insets = new Insets(0, 0, 5, 5);
        gbc_lblName.gridx = 0;
        gbc_lblName.gridy = 5;
        datosLogueo.add(lblName, gbc_lblName);

        textName = new JTextField();
        textName.setFont(new Font("Tahoma", Font.PLAIN, 11));
        GridBagConstraints gbc_textName = new GridBagConstraints();
        gbc_textName.insets = new Insets(0, 0, 5, 5);
        gbc_textName.fill = GridBagConstraints.HORIZONTAL;
        gbc_textName.gridx = 2;
        gbc_textName.gridy = 5;
        datosLogueo.add(textName, gbc_textName);
        textName.setColumns(10);

        // Password
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
        GridBagConstraints gbc_lblPassword = new GridBagConstraints();
        gbc_lblPassword.anchor = GridBagConstraints.EAST;
        gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
        gbc_lblPassword.gridx = 0;
        gbc_lblPassword.gridy = 6;
        datosLogueo.add(lblPassword, gbc_lblPassword);

        textPassword = new JPasswordField();
        textPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
        GridBagConstraints gbc_textPassword = new GridBagConstraints();
        gbc_textPassword.insets = new Insets(0, 0, 5, 5);
        gbc_textPassword.fill = GridBagConstraints.HORIZONTAL;
        gbc_textPassword.gridx = 2;
        gbc_textPassword.gridy = 6;
        datosLogueo.add(textPassword, gbc_textPassword);
        textPassword.setColumns(10);

        // Cargo
        JLabel lblCargo = new JLabel("Cargo");
        lblCargo.setFont(new Font("Tahoma", Font.PLAIN, 11));
        GridBagConstraints gbc_lblCargo = new GridBagConstraints();
        gbc_lblCargo.anchor = GridBagConstraints.EAST;
        gbc_lblCargo.insets = new Insets(0, 0, 5, 5);
        gbc_lblCargo.gridx = 0;
        gbc_lblCargo.gridy = 7;
        datosLogueo.add(lblCargo, gbc_lblCargo);

        cmbCargo = new JComboBox<>();
        cmbCargo.setModel(new DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "Alumno", "Profesor" }));
        GridBagConstraints gbc_cmbCargo = new GridBagConstraints();
        gbc_cmbCargo.insets = new Insets(0, 0, 5, 5);
        gbc_cmbCargo.fill = GridBagConstraints.HORIZONTAL;
        gbc_cmbCargo.gridx = 2;
        gbc_cmbCargo.gridy = 7;
        datosLogueo.add(cmbCargo, gbc_cmbCargo);

        // Enlace "Olvido Contraseña"
        JLabel lblOlvidoPasswd = new JLabel("<html><u>¿No recuerda su contraseña? Pulse aquí</u></html>");
        lblOlvidoPasswd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new OlvidoContraseña().setVisible(true);
            }
        });
        lblOlvidoPasswd.setHorizontalAlignment(SwingConstants.LEFT);
        GridBagConstraints gbc_lblOlvidoPasswd = new GridBagConstraints();
        gbc_lblOlvidoPasswd.insets = new Insets(0, 0, 5, 5);
        gbc_lblOlvidoPasswd.gridx = 2;
        gbc_lblOlvidoPasswd.gridy = 8;
        datosLogueo.add(lblOlvidoPasswd, gbc_lblOlvidoPasswd);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();

        // Botón "Regístrate"
        if (ob == btnRegistrate) {
            new Registro().setVisible(true);
        }

        // Botón "Limpiar"
        if (ob == btnClear) {
            textName.setText("");
            textPassword.setText("");
            cmbCargo.setSelectedIndex(0);
        }

        // Botón "Entrar"
        if (ob == btnEnter) {
            String nombreIngresado = textName.getText(); 
            String passwordIngresado = textPassword.getText();
            String cargo = (String) cmbCargo.getSelectedItem();

            if (nombreIngresado.isEmpty() || passwordIngresado.isEmpty() || "Seleccione una opción...".equals(cargo)) {
      
                JOptionPane.showMessageDialog(this, "Por favor, rellena todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                
                if (nombreIngresado.equals(nombre) && passwordIngresado.equals(password)) {
                   
                    JOptionPane.showMessageDialog(this, "¡Bienvenido " + nombre + "!", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                    if (cargo.equals("Alumno")) {
                        new Alumno().setVisible(true);
                    } else if (cargo.equals("Profesor")) {
                        new ventanaProfesorPrueba().setVisible(true);
                    }
                } else {
                    // Si alguna de las credenciales es incorrecta
                    JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        // Botón "Cerrar"
        if (ob == btnClose) {
            System.exit(0);
        }
    }

}

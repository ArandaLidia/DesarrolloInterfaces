package ventanaProfesor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import primeraVentana.Logueo;

import javax.swing.JCheckBox;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaProfesorPrueba extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JTable table_1;
	private JCheckBox chckbxPrimerCurso;
	private JCheckBox chckbxSegundoCurso;
	private JRadioButton rdbtnAdministracionSistemas;
	private JRadioButton rdbtnDAM;
	private JRadioButton rdbtnDAW;
	private JRadioButton rdbtnSistemasMicroinformaticos;
	private JButton btnBuscar;
	private JButton btnLimpiar;
	private JButton btnPonerNota;
	private JButton btnAtras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaProfesorPrueba frame = new ventanaProfesorPrueba();
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
	public ventanaProfesorPrueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 200,1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{1,1,1,1,1,1,1,1};
		gbl_contentPane.rowHeights = new int[]{1,1, 1, 1, 0,1,1,1,1,1,1};
		gbl_contentPane.columnWeights = new double[]{1,1.0,1.0,1,1.0,1,1,1};
		gbl_contentPane.rowWeights = new double[]{1,1,1, 1, 1.0,1,1,1,1,1,1};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ventanaProfesorPrueba.class.getResource("/images/Logo1.jpg")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenido al área de profesor: "+Logueo.nombre);
		lblNewLabel_1.setForeground(new Color(205, 133, 63));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 4;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 0;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 2;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.anchor=GridBagConstraints.EAST;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Curso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(205, 133, 63)));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 4;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{73};
		gbl_panel.rowHeights = new int[]{73, 0};
		gbl_panel.columnWeights = new double[]{0.0};
		gbl_panel.rowWeights = new double[]{0.0,0.0};
		panel.setLayout(gbl_panel);
		
		chckbxPrimerCurso = new JCheckBox("Primer curso");
		GridBagConstraints gbc_chckbxPrimerCurso = new GridBagConstraints();
		gbc_chckbxPrimerCurso.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxPrimerCurso.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxPrimerCurso.gridx = 0;
		gbc_chckbxPrimerCurso.gridy = 0;
		panel.add(chckbxPrimerCurso, gbc_chckbxPrimerCurso);
		
		chckbxSegundoCurso = new JCheckBox("Segundo curso");
		GridBagConstraints gbc_chckbxSegundoCurso = new GridBagConstraints();
		gbc_chckbxSegundoCurso.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxSegundoCurso.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxSegundoCurso.gridx = 0;
		gbc_chckbxSegundoCurso.gridy = 1;
		panel.add(chckbxSegundoCurso, gbc_chckbxSegundoCurso);
		
		ButtonGroup grupoCheckButtonGroup = new ButtonGroup();
		grupoCheckButtonGroup.add(chckbxPrimerCurso);
		grupoCheckButtonGroup.add(chckbxSegundoCurso);
		chckbxPrimerCurso.setSelected(true);
	
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Formaci\u00F3n Profesional", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(205, 133, 63)));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 4;
		gbc_panel_1.anchor=GridBagConstraints.WEST;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0,0,0,0};
		gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0,0,0,0};
		panel_1.setLayout(gbl_panel_1);
		
		
		rdbtnAdministracionSistemas = new JRadioButton("Administración de Sistemas Informáticos en Red");
		GridBagConstraints gbc_rdbtnAdministracionSistemas = new GridBagConstraints();
		gbc_rdbtnAdministracionSistemas.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnAdministracionSistemas.gridx = 0;
		gbc_rdbtnAdministracionSistemas.gridy = 0;
		gbc_rdbtnAdministracionSistemas.anchor=GridBagConstraints.WEST;
		
		panel_1.add(rdbtnAdministracionSistemas, gbc_rdbtnAdministracionSistemas);
		
		
		rdbtnDAM = new JRadioButton("Desarrollo de Aplicaciones Multiplataforma");
		GridBagConstraints gbc_rdbtnDAM = new GridBagConstraints();
		gbc_rdbtnDAM.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnDAM.gridx = 0;
		gbc_rdbtnDAM.gridy = 1;
		gbc_rdbtnDAM.anchor=GridBagConstraints.WEST;
		panel_1.add(rdbtnDAM, gbc_rdbtnDAM);
		
		rdbtnDAW = new JRadioButton("Desarrollo de Aplicaciones Web");
		rdbtnDAW.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_rdbtnDAW = new GridBagConstraints();
		gbc_rdbtnDAW.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnDAW.gridx = 0;
		gbc_rdbtnDAW.gridy = 2;
		gbc_rdbtnDAW.anchor=GridBagConstraints.WEST;
		panel_1.add(rdbtnDAW, gbc_rdbtnDAW);
		
		rdbtnSistemasMicroinformaticos = new JRadioButton("Sistemas Microinformáticos y Redes");
		GridBagConstraints gbc_rdbtnSistemasMicroinformaticos = new GridBagConstraints();
		gbc_rdbtnSistemasMicroinformaticos.gridx = 0;
		gbc_rdbtnSistemasMicroinformaticos.gridy = 3;
		gbc_rdbtnSistemasMicroinformaticos.anchor=GridBagConstraints.WEST;
		panel_1.add(rdbtnSistemasMicroinformaticos, gbc_rdbtnSistemasMicroinformaticos);
		
		ButtonGroup grupoRadio=new ButtonGroup();
		grupoRadio.add(rdbtnAdministracionSistemas);
		grupoRadio.add(rdbtnDAM);
		grupoRadio.add(rdbtnDAW);
		grupoRadio.add(rdbtnSistemasMicroinformaticos);
		rdbtnAdministracionSistemas.setSelected(true);
		
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 4;
		gbc_scrollPane.gridy = 4;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		defaultTableModel.addColumn("ID");
		defaultTableModel.addColumn("Nombre");
		defaultTableModel.addColumn("Curso");
		defaultTableModel.addColumn("Ciclo");
		table_1 = new JTable(defaultTableModel);
		scrollPane.setViewportView(table_1);
		
		btnBuscar = new JButton("Buscar");
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 1;
		gbc_btnBuscar.gridy = 7;
		contentPane.add(btnBuscar, gbc_btnBuscar);
		btnBuscar.addActionListener(this);
		
		btnLimpiar = new JButton("Limpiar");
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiar.gridx = 2;
		gbc_btnLimpiar.gridy = 7;
		contentPane.add(btnLimpiar, gbc_btnLimpiar);
		btnLimpiar.addActionListener(this);
		
		btnPonerNota = new JButton("Poner notas");
		GridBagConstraints gbc_btnPonerNota = new GridBagConstraints();
		gbc_btnPonerNota.insets = new Insets(0, 0, 5, 5);
		gbc_btnPonerNota.gridx = 5;
		gbc_btnPonerNota.gridy = 8;
		contentPane.add(btnPonerNota, gbc_btnPonerNota);
		btnPonerNota.addActionListener(this);
		
		JButton btnVerNotas = new JButton("Ver notas");
		GridBagConstraints gbc_btnVerNotas = new GridBagConstraints();
		gbc_btnVerNotas.insets = new Insets(0, 0, 5, 5);
		gbc_btnVerNotas.gridx = 6;
		gbc_btnVerNotas.gridy = 8;
		contentPane.add(btnVerNotas, gbc_btnVerNotas);
		btnVerNotas.addActionListener(this);
		
		btnAtras = new JButton("Atrás");
		GridBagConstraints gbc_btnAtras = new GridBagConstraints();
		gbc_btnAtras.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtras.gridx = 6;
		gbc_btnAtras.gridy = 9;
		contentPane.add(btnAtras, gbc_btnAtras);
		btnAtras.addActionListener(this);
		
	}

	public JCheckBox getChckbxPrimerCurso() {
		return chckbxPrimerCurso;
	}
	public JCheckBox getChckbxSegundoCurso() {
		return chckbxSegundoCurso;
	}
	public JRadioButton getRdbtnAdministracionSistemas() {
		return rdbtnAdministracionSistemas;
	}
	public JRadioButton getRdbtnDAM() {
		return rdbtnDAM;
	}
	public JRadioButton getRdbtnDAW() {
		return rdbtnDAW;
	}
	public JRadioButton getRdbtnSistemasMicroinformaticos() {
		return rdbtnSistemasMicroinformaticos;
	}
	public JButton getBtnBuscar() {
		return btnBuscar;
	}
	public JButton getBtnLimpiar() {
		return btnLimpiar;
	}
	public JButton getBtnPonerNota() {
		return btnPonerNota;
	}
	public JButton getBtnAtras() {
		return btnAtras;
	}
	
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		
		if(object.equals(btnAtras)) {
			dispose();
		}
		
	}
}

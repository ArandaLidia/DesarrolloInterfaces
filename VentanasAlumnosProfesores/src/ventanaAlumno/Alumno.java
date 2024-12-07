package ventanaAlumno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import primeraVentana.Logueo;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alumno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JButton btnAtras;
	Logueo logeo =  new Logueo();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alumno frame = new Alumno();
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
	public Alumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 250, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{1,1,1, 0,1,1};
		gbl_contentPane.rowHeights = new int[]{1,1,1,1,1,1,1};
		gbl_contentPane.columnWeights = new double[]{1,1.0,1, 1.0,1.0,1.0};
		gbl_contentPane.rowWeights = new double[]{1.0,1,1,1.0,1,1,1};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Alumno.class.getResource("/images/Logo1.jpg")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
	
		JLabel lblNewLabel_1 = new JLabel("Bienvenido al área de alumnos: "+ Logueo.nombre.toUpperCase());
		lblNewLabel_1.setForeground(new Color(205, 133, 63));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Módulos matriculados");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("ID modulo");
		modelo.addColumn("Nombre");
		modelo.addColumn("1º Trimestre");
		modelo.addColumn("2º Trimestre");
		modelo.addColumn("3º Trimestre");
		modelo.addColumn("Profesor");


		 table = new JTable(modelo); // Creamos la tabla con el modelo
	        JScrollPane scrollPane = new JScrollPane(table); // Envolvemos la tabla en un JScrollPane
	        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
	        gbc_scrollPane.gridwidth = 3; // La tabla ocupa 3 columnas
	        gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
	        gbc_scrollPane.fill = GridBagConstraints.BOTH; // Llenar el espacio asignado
	        gbc_scrollPane.gridx = 1;
	        gbc_scrollPane.gridy = 2;
	        contentPane.add(scrollPane, gbc_scrollPane);
		
		btnAtras = new JButton("Atrás");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GridBagConstraints gbc_btnAtras = new GridBagConstraints();
		gbc_btnAtras.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtras.gridx = 2;
		gbc_btnAtras.gridy = 5;
		gbc_btnAtras.anchor = GridBagConstraints.EAST;
		contentPane.add(btnAtras, gbc_btnAtras);
	}

	public JButton getBtnAtras() {
		return btnAtras;
	}
}

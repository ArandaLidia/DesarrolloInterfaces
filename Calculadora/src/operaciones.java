import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;

public class operaciones extends JPanel {

	private static final long serialVersionUID = 1L;
	private final JButton btnNewButton_9 = new JButton("*");

	/**
	 * Create the panel.
	 */
	public operaciones() {
		setLayout(new GridLayout(5, 4, 3, 3));
		
		JButton btnNewButton_1 = new JButton("Ce");
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("C");
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("⌫");
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("/");
		add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("7");
		add(btnNewButton);
		
		JButton btnNewButton_6 = new JButton("8");
		add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("9");
		add(btnNewButton_5);
		add(btnNewButton_9);
		
		JButton btnNewButton_12 = new JButton("4");
		add(btnNewButton_12);
		
		JButton btnNewButton_8 = new JButton("5");
		add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("6");
		add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("-");
		add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("1");
		add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("2");
		add(btnNewButton_13);
		
		JButton btnNewButton_16 = new JButton("3");
		add(btnNewButton_16);
		
		JButton btnNewButton_14 = new JButton("+");
		add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("%");
		add(btnNewButton_15);
		
		JButton btnNewButton_17 = new JButton("0");
		add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("=");
		add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("π");
		add(btnNewButton_19);

	}

}

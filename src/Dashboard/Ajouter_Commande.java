package Dashboard;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Ajouter_Commande extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Ajouter_Commande() {
		setBackground(Color.DARK_GRAY);
		setBounds(0 , 0, 400, 360);
		setVisible(true);
		setLayout(null);
		
		JLabel lblAjouter = new JLabel("Ajouter une Commande");
		lblAjouter.setFont(new Font("Dialog", Font.BOLD, 22));
		lblAjouter.setBounds(52, 12, 295, 27);
		lblAjouter.setForeground(Color.WHITE);
		add(lblAjouter);
		
		textField = new JTextField();
		textField.setBounds(200, 59, 163, 27);
		add(textField);
		textField.setColumns(10);

	}
}

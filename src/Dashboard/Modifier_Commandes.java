package Dashboard;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Modifier_Commandes extends JPanel {

	/**
	 * Create the panel.
	 */
	public Modifier_Commandes() {
		setBackground(Color.DARK_GRAY);
		setBounds(0 , 0, 400, 360);
		setVisible(true);
		setLayout(null);
		
		JLabel lblAjouter = new JLabel("MODIFIER");
		lblAjouter.setBounds(133, 166, 133, 27);
		lblAjouter.setForeground(Color.WHITE);
		lblAjouter.setFont(new Font("Dialog", Font.BOLD, 22));
		add(lblAjouter);

	}

}

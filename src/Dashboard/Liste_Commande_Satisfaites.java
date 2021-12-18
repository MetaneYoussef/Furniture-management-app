package Dashboard;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Liste_Commande_Satisfaites extends JPanel {

	/**
	 * Create the panel.
	 */
	public Liste_Commande_Satisfaites() {
		setBackground(Color.DARK_GRAY);
		setBounds(0 , 0, 400, 360);
		setVisible(true);
		setLayout(null);
		
		JLabel lblListeSatis_1 = new JLabel("LISTE SATIS");
		lblListeSatis_1.setForeground(Color.WHITE);
		lblListeSatis_1.setFont(new Font("Dialog", Font.BOLD, 22));
		lblListeSatis_1.setBounds(122, 166, 155, 27);
		add(lblListeSatis_1);
	}

}

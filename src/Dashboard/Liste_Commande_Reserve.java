package Dashboard;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Liste_Commande_Reserve extends JPanel {

	/**
	 * Create the panel.
	 */
	public Liste_Commande_Reserve() {
		setBackground(Color.DARK_GRAY);
		setBounds(0 , 0, 400, 360);
		setVisible(true);
		setLayout(null);
		
		JLabel lblListeSatis = new JLabel("LISTE RES");
		lblListeSatis.setForeground(Color.WHITE);
		lblListeSatis.setFont(new Font("Dialog", Font.BOLD, 22));
		lblListeSatis.setBounds(122, 166, 155, 27);
		add(lblListeSatis);
		
	}

}

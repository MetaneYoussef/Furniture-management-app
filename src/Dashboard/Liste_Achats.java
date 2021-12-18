package Dashboard;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Liste_Achats extends JPanel {

	/**
	 * Create the panel.
	 */
	public Liste_Achats() {
		setBackground(Color.DARK_GRAY);
		setBounds(0 , 0, 400, 360);
		setLayout(null);
		
		JLabel lblListeAchat = new JLabel("LISTE ACHAT");
		lblListeAchat.setForeground(Color.WHITE);
		lblListeAchat.setFont(new Font("Dialog", Font.BOLD, 22));
		lblListeAchat.setBounds(114, 166, 172, 27);
		add(lblListeAchat);
		setVisible(true);
	}

}

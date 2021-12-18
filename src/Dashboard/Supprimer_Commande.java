package Dashboard;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Supprimer_Commande extends JPanel {

	/**
	 * Create the panel.
	 */
	public Supprimer_Commande() {
		setBackground(Color.DARK_GRAY);
		setBounds(0 , 0, 400, 360);
		setVisible(true);
		setLayout(null);
		
		JLabel lblSupprimer = new JLabel("SUPPRIMER");
		lblSupprimer.setForeground(Color.WHITE);
		lblSupprimer.setFont(new Font("Dialog", Font.BOLD, 22));
		lblSupprimer.setBounds(127, 166, 145, 27);
		add(lblSupprimer);

	}

}

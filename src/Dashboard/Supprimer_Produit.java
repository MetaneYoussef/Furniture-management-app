package Dashboard;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class Supprimer_Produit extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 735505899837708230L;
	JTextPane Referance;
	JLabel lblProduitSupprim;
	JLabel lblProduitIntrouvable ;
	/**
	 * Create the panel.
	 */
	public Supprimer_Produit() {
		setBackground(Color.DARK_GRAY);
		setBounds(0 , 0, 400, 360);
		setVisible(true);
		setLayout(null);
		
		JLabel lblAjouter = new JLabel("SUPPRIMER");
		lblAjouter.setFont(new Font("Dialog", Font.BOLD, 22));
		lblAjouter.setBounds(125, 12, 145, 27);
		lblAjouter.setForeground(Color.WHITE);
		add(lblAjouter);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.BLACK);
		panel.setBounds(12, 51, 376, 288);
		add(panel);
		
		JLabel lblReference = new JLabel("Reference");
		lblReference.setForeground(Color.WHITE);
		lblReference.setFont(new Font("Dialog", Font.BOLD, 17));
		lblReference.setBounds(23, 66, 97, 28);
		panel.add(lblReference);
		
		 Referance = new JTextPane();
		Referance.setBounds(178, 66, 167, 28);
		panel.add(Referance);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_1.setBounds(99, 250, 185, 26);
		panel.add(panel_1);
		button_click(panel_1);
		
		JLabel lblSupprimer = new JLabel("Supprimer");
		lblSupprimer.setForeground(Color.WHITE);
		lblSupprimer.setBounds(52, 4, 80, 15);
		panel_1.add(lblSupprimer);
		
		 lblProduitSupprim = new JLabel("Produit Supprimé");
		 lblProduitSupprim.setVisible(false);
		lblProduitSupprim.setForeground(Color.GREEN);
		lblProduitSupprim.setBounds(126, 208, 124, 15);
		panel.add(lblProduitSupprim);
		
		 lblProduitIntrouvable = new JLabel("Produit Introuvable");
		lblProduitIntrouvable.setVisible(false);
		lblProduitIntrouvable.setForeground(Color.RED);
		lblProduitIntrouvable.setBounds(117, 181, 141, 15);
		panel.add(lblProduitIntrouvable);
		
		
	}
	public void button_click(JPanel panel_2) {
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2.setBackground(SystemColor.controlShadow);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				panel_2.setBackground(Color.GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_2.setBackground(UIManager.getColor("ColorChooser.foreground"));
				panel_2.setBackground(Color.LIGHT_GRAY);
				if(Gestion_Des_Produits.Produits.chercherProduit(Referance.getText()) == null) {
					lblProduitSupprim.setVisible(false);
					lblProduitIntrouvable.setVisible(true);
				}else {
					Gestion_Des_Produits.Produits.supprimer(Referance.getText());
					lblProduitIntrouvable.setVisible(false);
					lblProduitSupprim.setVisible(true);
					Referance.setText("");
				}
			}
		
		});
	}
}

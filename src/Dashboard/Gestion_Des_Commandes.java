package Dashboard;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Image;

public class Gestion_Des_Commandes extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8649815693848061150L;
	private Image image_Commandes_satis= new ImageIcon(Graphical_Interface.class.getResource("/Images/Commandes_Satis.png")).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
	private Image image_Commandes_res = new ImageIcon(Graphical_Interface.class.getResource("/Images/Commander_res.png")).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
	private Image image_SUP = new ImageIcon(Graphical_Interface.class.getResource("/Images/trash.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
	private Image image_Modifier = new ImageIcon(Graphical_Interface.class.getResource("/Images/modifier.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
	private Image image_List_Commandes = new ImageIcon(Graphical_Interface.class.getResource("/Images/Liste_Commandes.png")).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
	private Image image_Commandes = new ImageIcon(Graphical_Interface.class.getResource("/Images/commander-de-la-nourriture.png")).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
	Ajouter_Commande panelAjouter = new Ajouter_Commande();
	Supprimer_Commande panelSupprimer = new Supprimer_Commande();
	Modifier_Commandes panelModifier = new Modifier_Commandes();
	Liste_Commande_Reserve panelListeReserve = new Liste_Commande_Reserve();
	Liste_Commande_Satisfaites panelListeSatisfaites = new Liste_Commande_Satisfaites();
	Liste_Achats panelListeAchats = new Liste_Achats();
	JPanel panel_maine = new JPanel();
	/**
	 * Create the panel.
	 */
	public Gestion_Des_Commandes() {
		setBackground(Color.RED);
		setLayout(null);
		setBounds(0 , 0, 400, 360);;
		
		panel_maine.setBackground(Color.DARK_GRAY);
		panel_maine.setBounds(0, 0, 400, 360);
		add(panel_maine);
		panel_maine.setLayout(null);
		panelAjouter.setVisible(false);
		panelSupprimer.setVisible(false);
		panelModifier.setVisible(false);
		panelListeReserve.setVisible(false);
		panelListeSatisfaites.setVisible(false);
		panel_maine.setVisible(true);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 179, 376, 2);
		panel_maine.add(separator);
		separator.setForeground(Color.BLACK);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(128, 14, 8, 336);
		panel_maine.add(separator_1);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLACK);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(260, 14, 8, 336);
		panel_maine.add(separator_1_1);
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1.setForeground(Color.BLACK);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 14, 112, 159);
		panel_maine.add(panel);
		panel.setLayout(null);
		panel.setBackground(SystemColor.controlShadow);
		
		JLabel lblAjouterUnProduits = new JLabel("Ajouter");
		lblAjouterUnProduits.setForeground(Color.WHITE);
		lblAjouterUnProduits.setBounds(30, 117, 52, 30);
		panel.add(lblAjouterUnProduits);
		
		JLabel label_1 = new JLabel("+");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.BOLD, 35));
		label_1.setBounds(12, 13, 29, 30);
		panel.add(label_1);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(24, 48, 64, 64);
		label_4.setIcon(new ImageIcon(image_Commandes));
		panel.add(label_4);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(142, 14, 112, 159);
		panel_maine.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBackground(SystemColor.controlShadow);
		
		JLabel lblAjouterUnProduits_1_1 = new JLabel("Modifier");
		lblAjouterUnProduits_1_1.setForeground(Color.WHITE);
		lblAjouterUnProduits_1_1.setBounds(27, 120, 58, 30);
		panel_2.add(lblAjouterUnProduits_1_1);
		
		JLabel label_3_1 = new JLabel("");
		label_3_1.setBounds(12, 8, 32, 32);
		label_3_1.setIcon(new ImageIcon(image_Modifier));
		panel_2.add(label_3_1);
		
		JLabel label_4_2 = new JLabel("");
		label_4_2.setBounds(24, 48, 64, 64);
		label_4_2.setIcon(new ImageIcon(image_Commandes));
		panel_2.add(label_4_2);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(142, 187, 112, 159);
		panel_maine.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBackground(SystemColor.controlShadow);
		
		JLabel label = new JLabel("");
		label.setBounds(24, 32, 64, 64);
		label.setIcon(new ImageIcon(image_Commandes_res));
		panel_3.add(label);
		
		JLabel lblAjouterUnProduits_1_3_2_1 = new JLabel("Afficher Liste");
		lblAjouterUnProduits_1_3_2_1.setForeground(Color.WHITE);
		lblAjouterUnProduits_1_3_2_1.setBounds(9, 113, 94, 30);
		panel_3.add(lblAjouterUnProduits_1_3_2_1);
		
		JLabel lblAjouterUnProduits_1_3_1_1_1 = new JLabel("Resèrvés");
		lblAjouterUnProduits_1_3_1_1_1.setForeground(Color.WHITE);
		lblAjouterUnProduits_1_3_1_1_1.setBounds(22, 129, 68, 30);
		panel_3.add(lblAjouterUnProduits_1_3_1_1_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBounds(274, 187, 112, 159);
		panel_maine.add(panel_4_1);
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(SystemColor.controlShadow);
		
		JLabel lblAjouterUnProduits_1_3_2 = new JLabel("Afficher Liste");
		lblAjouterUnProduits_1_3_2.setForeground(Color.WHITE);
		lblAjouterUnProduits_1_3_2.setBounds(9, 113, 94, 30);
		panel_4_1.add(lblAjouterUnProduits_1_3_2);
		
		JLabel lblAjouterUnProduits_1_3_1_1 = new JLabel("Satisfaits");
		lblAjouterUnProduits_1_3_1_1.setForeground(Color.WHITE);
		lblAjouterUnProduits_1_3_1_1.setBounds(22, 129, 68, 30);
		panel_4_1.add(lblAjouterUnProduits_1_3_1_1);
		
		JLabel label_2_1 = new JLabel("");
		label_2_1.setBounds(24, 32, 64, 64);
		label_2_1.setIcon(new ImageIcon(image_Commandes_satis));
		panel_4_1.add(label_2_1);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 187, 112, 159);
		panel_maine.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setBackground(SystemColor.controlShadow);
		
		JLabel lblAjouterUnProduits_1_3 = new JLabel("Afficher Liste");
		lblAjouterUnProduits_1_3.setForeground(Color.WHITE);
		lblAjouterUnProduits_1_3.setBounds(8, 113, 94, 30);
		panel_4.add(lblAjouterUnProduits_1_3);
		
		JLabel lblAjouterUnProduits_1_3_1 = new JLabel("Des achats");
		lblAjouterUnProduits_1_3_1.setForeground(Color.WHITE);
		lblAjouterUnProduits_1_3_1.setBounds(16, 129, 79, 30);
		panel_4.add(lblAjouterUnProduits_1_3_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(24, 32, 64, 64);
		label_2.setIcon(new ImageIcon(image_List_Commandes));
		panel_4.add(label_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(274, 14, 112, 159);
		panel_maine.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.controlShadow);
		
		JLabel lblAjouterUnProduits_1 = new JLabel("Supprimer");
		lblAjouterUnProduits_1.setForeground(Color.WHITE);
		lblAjouterUnProduits_1.setBounds(20, 117, 73, 30);
		panel_1.add(lblAjouterUnProduits_1);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(12, 12, 32, 32);
		label_3.setIcon(new ImageIcon(image_SUP));
		panel_1.add(label_3);
		
		JLabel label_4_1 = new JLabel("");
		label_4_1.setBounds(24, 48, 64, 64);
		label_4_1.setIcon(new ImageIcon(image_Commandes));
		panel_1.add(label_4_1);
		
		button_click(panel,panelAjouter);
		button_click(panel_1,panelSupprimer);
		button_click(panel_4,panelListeAchats);
		button_click(panel_4_1,panelListeSatisfaites);
		button_click(panel_2,panelModifier);
		button_click(panel_3,panelListeReserve);
		
		
	}
	public void button_click(JPanel panel_2,JPanel panel_3) {
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
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				add(panel_3);
				panelAjouter.setVisible(false);
				panelSupprimer.setVisible(false);
				panelModifier.setVisible(false);
				panelListeReserve.setVisible(false);
				panelListeSatisfaites.setVisible(false);
				panelListeAchats.setVisible(false);
				
				panel_3.setVisible(true);
				panel_maine.setVisible(false);
				
				
			}
		});
	}
}

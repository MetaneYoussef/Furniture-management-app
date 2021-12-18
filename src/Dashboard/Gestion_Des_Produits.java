package Dashboard;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import projet_.Liste_Des_Produits;

import java.awt.Color;
import java.awt.Image;
import java.awt.Font;

public class Gestion_Des_Produits extends JPanel {

	private Image image_Client = new ImageIcon(Graphical_Interface.class.getResource("/Images/production.png")).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
	private Image image_SUP = new ImageIcon(Graphical_Interface.class.getResource("/Images/trash.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
	private Image image_Modifier = new ImageIcon(Graphical_Interface.class.getResource("/Images/modifier.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
	private Image image_List = new ImageIcon(Graphical_Interface.class.getResource("/Images/Liste.png")).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
	Ajouter_Produit panelAjouterproduit = new Ajouter_Produit();
	Supprimer_Produit panelSupprimerproduit = new Supprimer_Produit();
	Modifier_Produit panelModifierProduit = new Modifier_Produit();
	Afficher_Liste_Produit panelListeProduit = new Afficher_Liste_Produit();
	JPanel panel_maine = new JPanel();
	public static Liste_Des_Produits Produits = new Liste_Des_Produits();
	/**
	 * 
	 */
	private static final long serialVersionUID = 2475278329657722167L;

	/**
	 * Create the panel.
	 */
	public Gestion_Des_Produits() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		setBounds(0 , 0, 400, 360);
		
		
		panel_maine.setBackground(Color.DARK_GRAY);
		panel_maine.setBounds(0, 0, 400, 360);
		panelAjouterproduit.setVisible(false);
		panelSupprimerproduit.setVisible(false);
		panelModifierProduit.setVisible(false);
		panelListeProduit.setVisible(false);
		panel_maine.setVisible(true);
		add(panel_maine);
		panel_maine.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(39, 179, 322, 2);
		panel_maine.add(separator);
		separator.setForeground(SystemColor.infoText);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(198, 24, 2, 311);
		panel_maine.add(separator_1);
		separator_1.setForeground(SystemColor.infoText);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 31, 144, 133);
		panel_maine.add(panel);
		panel.setBackground(SystemColor.controlShadow);
		panel.setLayout(null);
		JLabel lblAjouterUnProduits = new JLabel("Ajouter");
		lblAjouterUnProduits.setForeground(SystemColor.text);
		lblAjouterUnProduits.setBounds(46, 91, 52, 30);
		panel.add(lblAjouterUnProduits);
		
		
		JLabel label = new JLabel("");
		label.setForeground(Color.WHITE);
		label.setBounds(40, 15, 64, 64);
		panel.add(label);
		label.setIcon(new ImageIcon(image_Client));
		
		JLabel label_1 = new JLabel("+");
		label_1.setFont(new Font("Dialog", Font.BOLD, 35));
		label_1.setForeground(SystemColor.text);
		label_1.setBounds(12, 0, 36, 42);
		panel.add(label_1);
		
		button_click(panel,panelAjouterproduit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(37, 195, 144, 133);
		panel_maine.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.controlShadow);
		
		JLabel lblAjouterUnProduits_1 = new JLabel("Supprimer");
		lblAjouterUnProduits_1.setForeground(Color.WHITE);
		lblAjouterUnProduits_1.setBounds(35, 91, 73, 30);
		panel_1.add(lblAjouterUnProduits_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(40, 15, 64, 64);
		label_2.setIcon(new ImageIcon(image_Client));
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(12, 0, 32, 50);
		label_3.setIcon(new ImageIcon(image_SUP));
		panel_1.add(label_3);
		button_click(panel_1,panelSupprimerproduit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(218, 195, 144, 133);
		panel_maine.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBackground(SystemColor.controlShadow);
		
		JLabel lblAjouterUnProduits_2 = new JLabel("La Liste");
		lblAjouterUnProduits_2.setForeground(Color.WHITE);
		lblAjouterUnProduits_2.setBounds(46, 91, 62, 30);
		panel_2.add(lblAjouterUnProduits_2);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(40, 15, 64, 67);
		label_4.setIcon(new ImageIcon(image_List));
		panel_2.add(label_4);
		button_click(panel_2,panelListeProduit);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(218, 31, 144, 133);
		panel_maine.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBackground(SystemColor.controlShadow);
		
		JLabel lblModifier = new JLabel("Modifier");
		lblModifier.setForeground(Color.WHITE);
		lblModifier.setBounds(43, 91, 58, 30);
		panel_3.add(lblModifier);
		
		JLabel label_2_1 = new JLabel("");
		label_2_1.setForeground(Color.WHITE);
		label_2_1.setBounds(40, 15, 64, 64);
		label_2_1.setIcon(new ImageIcon(image_Client));
		panel_3.add(label_2_1);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(12, 0, 40, 51);
		label_5.setIcon(new ImageIcon(image_Modifier));
		panel_3.add(label_5);
		button_click(panel_3,panelModifierProduit);
		
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
				panelAjouterproduit.setVisible(false);
				panelSupprimerproduit.setVisible(false);
				panelModifierProduit.setVisible(false);
				panelListeProduit.setVisible(false);
				
				panel_3.setVisible(true);
				panel_maine.setVisible(false);
				
				
			}
		});
	}
}

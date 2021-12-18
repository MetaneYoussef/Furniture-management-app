package Dashboard;
import projet_.*;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import projet_.Client;
import projet_.GestionClients;

public class Gestion_Des_Clients extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8649815693848061150L;
	private Image image_Client_list = new ImageIcon(Graphical_Interface.class.getResource("/Images/client_list.png")).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
	private Image image_Client = new ImageIcon(Graphical_Interface.class.getResource("/Images/client.png")).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
	private Image image_SUP = new ImageIcon(Graphical_Interface.class.getResource("/Images/trash.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
	private Image image_Modifier = new ImageIcon(Graphical_Interface.class.getResource("/Images/modifier.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
	Ajouter_Client panelAjouterClient = new Ajouter_Client();
	Modifier_Client panelModifierClient = new Modifier_Client ();
	Supprimer_Client panelSupprimerClient = new Supprimer_Client();
	Afficher_Liste_Client panelListeClient = new Afficher_Liste_Client();
	JPanel panel_main = new JPanel();
	public static GestionClients listeClients= new GestionClients();
	
	/**
	 * Create the panel.
	 */
	public Gestion_Des_Clients() {
		setBackground(Color.DARK_GRAY);
		setBounds(0 , 0, 400, 360);
		setLayout(null);
		
		//JPanel panel_main = new JPanel();
		
		panel_main.setBackground(Color.DARK_GRAY);
		panel_main.setBounds(0, 0, 400, 360);
		add(panel_main);
		panelAjouterClient.setVisible(false);
		panelModifierClient.setVisible(false);
		panelSupprimerClient.setVisible(false);
		panelListeClient.setVisible(false);
		panel_main.setVisible(true);
		panel_main.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 179, 376, 2);
		panel_main.add(separator);
		separator.setForeground(SystemColor.infoText);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(196, 12, 8, 336);
		panel_main.add(separator_1);
		separator_1.setForeground(SystemColor.infoText);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 24, 144, 133);
		panel_main.add(panel);
		panel.setBackground(SystemColor.controlShadow);
		panel.setLayout(null);
		
		JLabel lblAjouterUnProduits = new JLabel("Ajouter");
		lblAjouterUnProduits.setBounds(46, 91, 52, 30);
		lblAjouterUnProduits.setForeground(Color.WHITE);
		panel.add(lblAjouterUnProduits);
		
		JLabel label_1 = new JLabel("+");
		label_1.setBounds(12, 13, 29, 30);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.BOLD, 35));
		panel.add(label_1);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(40, 27, 64, 64);
		label_4.setIcon(new ImageIcon(image_Client));
		panel.add(label_4);
	
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(27, 207, 144, 127);
		panel_main.add(panel_1);
		panel_1.setBackground(SystemColor.controlShadow);
		panel_1.setLayout(null);
		
		JLabel lblAjouterUnProduits_1 = new JLabel("Supprimer");
		lblAjouterUnProduits_1.setForeground(Color.WHITE);
		lblAjouterUnProduits_1.setBounds(35, 85, 73, 30);
		panel_1.add(lblAjouterUnProduits_1);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(12, 12, 32, 32);
		label_3.setIcon(new ImageIcon(image_SUP));
		panel_1.add(label_3);
		
		JLabel label_4_1 = new JLabel("");
		label_4_1.setBounds(40, 21, 64, 64);
		label_4_1.setIcon(new ImageIcon(image_Client));
		panel_1.add(label_4_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(225, 204, 144, 133);
		panel_main.add(panel_2);
		panel_2.setBackground(SystemColor.controlShadow);
		panel_2.setLayout(null);
		
		JLabel lblAjouterUnProduits_1_1 = new JLabel("Modifier");
		lblAjouterUnProduits_1_1.setForeground(Color.WHITE);
		lblAjouterUnProduits_1_1.setBounds(40, 91, 58, 30);
		panel_2.add(lblAjouterUnProduits_1_1);
		
		JLabel label_3_1 = new JLabel("");
		label_3_1.setIcon(new ImageIcon(image_Modifier));
		label_3_1.setBounds(12, 12, 32, 32);
		panel_2.add(label_3_1);
		
		JLabel label_4_2 = new JLabel("");
		label_4_2.setBounds(40, 27, 64, 64);
		label_4_2.setIcon(new ImageIcon(image_Client));
		panel_2.add(label_4_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(225, 23, 144, 133);
		panel_main.add(panel_4);
		panel_4.setBackground(SystemColor.controlShadow);
		panel_4.setLayout(null);
		
		JLabel lblAjouterUnProduits_1_3 = new JLabel("Afficher Liste");
		lblAjouterUnProduits_1_3.setForeground(Color.WHITE);
		lblAjouterUnProduits_1_3.setBounds(25, 87, 94, 30);
		panel_4.add(lblAjouterUnProduits_1_3);
		
		JLabel lblAjouterUnProduits_1_3_1 = new JLabel("Des Clients");
		lblAjouterUnProduits_1_3_1.setForeground(Color.WHITE);
		lblAjouterUnProduits_1_3_1.setBounds(30, 103, 84, 30);
		panel_4.add(lblAjouterUnProduits_1_3_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(41, 11, 64, 64);
		label_2.setIcon(new ImageIcon(image_Client_list));
		panel_4.add(label_2);
		
		button_click(panel,panelAjouterClient);
		button_click(panel_1,panelSupprimerClient);
		button_click(panel_2,panelModifierClient);
		button_click(panel_4,panelListeClient);
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
				panelAjouterClient.setVisible(false);
				panelModifierClient.setVisible(false);
				panelSupprimerClient.setVisible(false);
				panelListeClient.setVisible(false);
				
				panel_3.setVisible(true);
				panel_main.setVisible(false);
			}
		});
	}
}


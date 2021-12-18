package Dashboard;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

import javax.swing.SwingConstants;
import java.awt.Panel;

import java.awt.Image;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Point;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.SystemColor;

public class Graphical_Interface {

	public JFrame frame;
	private Image image_q = new ImageIcon(Graphical_Interface.class.getResource("/Images/logout-64.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
	private Image image_Client = new ImageIcon(Graphical_Interface.class.getResource("/Images/client.png")).getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
	private Image image_Commandes = new ImageIcon(Graphical_Interface.class.getResource("/Images/commander-de-la-nourriture.png")).getImage().getScaledInstance(28, 28, Image.SCALE_SMOOTH);
	private Image image_Produits = new ImageIcon(Graphical_Interface.class.getResource("/Images/production.png")).getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
	Gestion_Des_Clients panelClient = new Gestion_Des_Clients();
	Gestion_Des_Produits panelProduit;
	Gestion_Des_Commandes panelCommandes;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graphical_Interface window = new Graphical_Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	/**
	 * Create the application.
	 */
	public Graphical_Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(255, 140, 0));
		frame.getContentPane().setLayout(null);
		
		
		panelProduit = new Gestion_Des_Produits();
		panelCommandes = new Gestion_Des_Commandes();
		 
		panelClient.setVisible(false);
		panelProduit.setVisible(false);
		panelCommandes.setVisible(false);
		 
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 250, 423);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setMinimumSize(new Dimension(32, 32));
		lblNewLabel.setMaximumSize(new Dimension(32, 32));
		lblNewLabel.setLocation(new Point(32, 32));
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setSize(new Dimension(32, 32));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("/home/youssef/Desktop/POO_PROJECT/DASH BOARD/src/Images/Dark Green Simple Vector House Icon Logo Template.png"));
		lblNewLabel.setBounds(16, 12, 217, 125);
		panel.add(lblNewLabel);
		
		JLabel lblMenuDeLadmin = new JLabel("MENU DE L'ADMIN");
		lblMenuDeLadmin.setForeground(Color.WHITE);
		lblMenuDeLadmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuDeLadmin.setBounds(22, 127, 205, 24);
		panel.add(lblMenuDeLadmin);
		
		Panel panel_1 = new Panel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1.setBackground(Color.DARK_GRAY);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1.setBackground(Color.GRAY);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				panel_1.setBackground(Color.BLACK);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_1.setBackground(UIManager.getColor("ColorChooser.foreground"));
				panel_1.setBackground(Color.GRAY);
			}
		});
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(0, 353, 250, 49);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			if (JOptionPane.showConfirmDialog(null, "Etes vous sur de vouloir quitter cette application?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION)== 0) {
					
						System.exit(0);
			}
		}}
		);
		
		JLabel lblQuitter = new JLabel("QUITTER");
		lblQuitter.setBounds(112, 17, 57, 15);
		lblQuitter.setForeground(Color.WHITE);
		lblQuitter.setBackground(new Color(255, 255, 255));
		lblQuitter.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblQuitter);
		
		JLabel label_icon_q = new JLabel("");
		label_icon_q.setBounds(75, 9, 28, 30);
		panel_1.add(label_icon_q);
		label_icon_q.setIcon(new ImageIcon(image_q));
		
		Panel panel_2 = new Panel();
		
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2.setBackground(UIManager.getColor("ColorChooser.foreground"));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				panel_2.setBackground(Color.GRAY);
				panelClient.panel_main.setVisible(true);
				menuClicked(panelClient);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_2.setBackground(UIManager.getColor("ColorChooser.foreground"));
				panel_2.setBackground(Color.LIGHT_GRAY);
			}
		});
		panel_2.setBackground(new Color(51, 51, 51));
		panel_2.setBounds(0, 157, 262, 38);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblGestionDesClients = new JLabel("Gestion Des Clients");
		lblGestionDesClients.setBounds(54, 12, 139, 15);
		lblGestionDesClients.setForeground(Color.WHITE);
		panel_2.add(lblGestionDesClients);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.WHITE);
		label.setBounds(15, 0, 24, 38);
		panel_2.add(label);
		label.setIcon(new ImageIcon(image_Client));
		
		Panel panel_2_1 = new Panel();
		panel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2_1.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2_1.setBackground(UIManager.getColor("ColorChooser.foreground"));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				panel_2_1.setBackground(Color.GRAY);
				panelCommandes.panel_maine.setVisible(true);
				menuClicked(panelCommandes);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_2_1.setBackground(UIManager.getColor("ColorChooser.foreground"));
				panel_2_1.setBackground(Color.LIGHT_GRAY);
			}
		});
		panel_2_1.setBackground(UIManager.getColor("Button.foreground"));
		panel_2_1.setBounds(0, 202, 262, 38);
		panel.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblGestionDesCommandes = new JLabel("Gestion Des Commandes");
		lblGestionDesCommandes.setForeground(Color.WHITE);
		lblGestionDesCommandes.setBounds(54, 11, 176, 15);
		panel_2_1.add(lblGestionDesCommandes);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setBounds(12, 3, 30, 32);
		panel_2_1.add(label_1);
		label_1.setIcon(new ImageIcon(image_Commandes));
		
		Panel panel_2_2 = new Panel();
		panel_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2_2.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2_2.setBackground(UIManager.getColor("ColorChooser.foreground"));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				panel_2_2.setBackground(Color.GRAY);
				panelProduit.panel_maine.setVisible(true);
				menuClicked(panelProduit);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_2_2.setBackground(UIManager.getColor("ColorChooser.foreground"));
				panel_2_2.setBackground(Color.LIGHT_GRAY);
			}
		});
	
		panel_2_2.setBackground(UIManager.getColor("Button.foreground"));
		panel_2_2.setBounds(0, 247, 262, 38);
		panel.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JLabel lblGestionDesProduits = new JLabel("Gestion Des Produits");
		lblGestionDesProduits.setForeground(Color.WHITE);
		lblGestionDesProduits.setBounds(54, 12, 176, 15);
		panel_2_2.add(lblGestionDesProduits);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(15, 0, 24, 38);
		panel_2_2.add(label_2);
		label_2.setIcon(new ImageIcon(image_Produits));
		
		JPanel PanelMain = new JPanel();
		PanelMain.setBackground(Color.GRAY);
		PanelMain.setBorder(null);
		PanelMain.setBounds(262, 17, 400, 360);
		frame.getContentPane().add(PanelMain);
		PanelMain.setLayout(null);
		
		PanelMain.add(panelClient);
		PanelMain.add(panelCommandes);
		PanelMain.add(panelProduit);
		
		
		JLabel lbl_close = new JLabel("X");
		lbl_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			if (JOptionPane.showConfirmDialog(null, "Etes vous sur de vouloir quitter cette application?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION)== 0) {
					
						System.exit(0);
			}
			}
					@Override
					public void mouseEntered(MouseEvent arg0) {
						lbl_close.setForeground(Color.RED);
					}
					@Override
					public void mouseExited(MouseEvent arg0) {
						lbl_close.setForeground(Color.DARK_GRAY);
					}
		}
		);
		lbl_close.setForeground(SystemColor.activeCaptionText);
		lbl_close.setBounds(665, 1, 18, 18);
		frame.getContentPane().add(lbl_close);
		
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 678, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void menuClicked(JPanel panel ){
		panelClient.setVisible(false);
		panelProduit.setVisible(false);
		panelCommandes.setVisible(false);
		
		panel.setVisible(true);
	}
}

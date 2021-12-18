package Dashboard;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Point;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class Graphical_Interface_Client {

	public JFrame frame;
	private Image image_q = new ImageIcon(Graphical_Interface.class.getResource("/Images/logout-64.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
	private Image image_user = new ImageIcon(Graphical_Interface.class.getResource("/Images/user.png")).getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
	private Image image_Commandes = new ImageIcon(Graphical_Interface.class.getResource("/Images/commander-de-la-nourriture.png")).getImage().getScaledInstance(28, 28, Image.SCALE_SMOOTH);
	private Image image_Produits = new ImageIcon(Graphical_Interface.class.getResource("/Images/production.png")).getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
	private JTextField textField;
	private JTable table;
	String Header[] = {"Nom","Type","Reference","Descriptif","Caracteristiques","Prix"}; 
	int row;
	 DefaultTableModel dtm;

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
	public Graphical_Interface_Client() {
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
		
		Panel panel_2_2 = new Panel();
		
	
		panel_2_2.setBackground(UIManager.getColor("Button.foreground"));
		panel_2_2.setBounds(0, 183, 262, 145);
		panel.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JLabel youssef = new JLabel("Metane youssef");
		youssef.setForeground(Color.WHITE);
		youssef.setBounds(51, 12, 176, 15);
		panel_2_2.add(youssef);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(15, 0, 24, 38);
		panel_2_2.add(label_2);
		label_2.setIcon(new ImageIcon(image_user));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(0, 34, 262, 99);
		panel_2_2.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Montant");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(12, 12, 70, 15);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Montant info");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(12, 36, 122, 15);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Montant elec");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setBounds(12, 53, 122, 15);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel(" kits");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setBounds(12, 72, 112, 15);
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("(-75) 1500 DA");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setBounds(146, 36, 104, 15);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("(-75) 1500 DA");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setBounds(146, 53, 104, 15);
		panel_2.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("(-75) 1500 DA");
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setBounds(146, 72, 104, 15);
		panel_2.add(lblNewLabel_1_3_1);
		
		JPanel PanelMain = new JPanel();
		PanelMain.setBackground(Color.GRAY);
		PanelMain.setBorder(null);
		PanelMain.setBounds(262, 17, 400, 360);
		frame.getContentPane().add(PanelMain);
		PanelMain.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 23, 270, 19);
		PanelMain.add(textField);
		textField.setColumns(10);
		
		JLabel lblChercherProduit = new JLabel("Chercher Produit:");
		lblChercherProduit.setForeground(Color.WHITE);
		lblChercherProduit.setBounds(12, 10, 125, 15);
		PanelMain.add(lblChercherProduit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 52, 376, 227);
		PanelMain.add(scrollPane);
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table = new JTable();
		scrollPane.setViewportView(table);
		dtm = new DefaultTableModel(Header,0);
		table.setModel(dtm);
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//displayproductlist();
			}
		});
		
		
		
		JButton btnEffecturerUneCommande = new JButton("Effecturer une Commande");
		btnEffecturerUneCommande.setBounds(77, 323, 245, 25);
		PanelMain.add(btnEffecturerUneCommande);
		
		JButton btnChercher = new JButton("Chercher");
		btnChercher.setBounds(286, 20, 105, 25);
		PanelMain.add(btnChercher);
		
		
		
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
	

}

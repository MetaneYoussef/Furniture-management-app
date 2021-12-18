package Dashboard;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.UIManager;

import projet_.Client;

public class Modifier_Client extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4294616717615884418L;
	private JTextPane mdp ;
	private JTextPane Address;
	private JTextPane Nom;
	private JTextPane Prenom;
	private JTextPane NbClient;
	JLabel lblClientIntrouvable;
	JLabel lblClientModifier;
	/**
	 * Create the panel.
	 */
	public Modifier_Client() {
		setBackground(Color.DARK_GRAY);
		setBounds(0 , 0, 400, 360);
		setVisible(true);
		setLayout(null);
		
		JLabel lblHereIsAdd = new JLabel("Modifier Un Client ");
		lblHereIsAdd.setFont(new Font("Dialog", Font.BOLD, 17));
		lblHereIsAdd.setForeground(Color.WHITE);
		lblHereIsAdd.setBounds(111, 13, 174, 52);
		add(lblHereIsAdd);
		
		Nom = new JTextPane();
		Nom.setBounds(180, 82, 189, 21);
		add(Nom);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setForeground(Color.WHITE);
		lblNom.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNom.setBounds(37, 78, 58, 28);
		add(lblNom);
		
		Prenom = new JTextPane();
		Prenom.setBounds(180, 121, 189, 21);
		add(Prenom);
		
		JLabel lblNom_1 = new JLabel("Prénom");
		lblNom_1.setForeground(Color.WHITE);
		lblNom_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNom_1.setBounds(37, 117, 107, 28);
		add(lblNom_1);
		
		Address = new JTextPane();
		Address.setBounds(180, 164, 189, 21);
		add(Address);
		
		JLabel lblNom_2 = new JLabel("Address");
		lblNom_2.setForeground(Color.WHITE);
		lblNom_2.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNom_2.setBounds(37, 160, 107, 28);
		add(lblNom_2);
		
		mdp = new JTextPane();
		mdp.setBounds(180, 205, 189, 21);
		add(mdp);
		
		JLabel lblNom_3 = new JLabel("Mot de passe");
		lblNom_3.setForeground(Color.WHITE);
		lblNom_3.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNom_3.setBounds(37, 201, 135, 28);
		add(lblNom_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_2.setBounds(82, 311, 205, 36);
		add(panel_2);
		
		JLabel lblModifier = new JLabel("Modifier");
		lblModifier.setForeground(Color.WHITE);
		lblModifier.setBounds(73, 10, 58, 15);
		panel_2.add(lblModifier);
		
		button_click(panel_2);
		
		lblClientModifier = new JLabel("Client Modifier!");
		lblClientModifier.setVisible(false);
		lblClientModifier.setForeground(Color.GREEN);
		lblClientModifier.setBackground(Color.GREEN);
		lblClientModifier.setBounds(142, 279, 115, 15);
		add(lblClientModifier);
		
		JLabel lblNom_3_1 = new JLabel("Nb Client");
		lblNom_3_1.setForeground(Color.WHITE);
		lblNom_3_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNom_3_1.setBounds(37, 242, 135, 28);
		add(lblNom_3_1);
		
		NbClient = new JTextPane();
		NbClient.setBounds(180, 246, 189, 21);
		add(NbClient);
		
		lblClientIntrouvable = new JLabel("Client Introuvable");
		lblClientIntrouvable.setForeground(Color.RED);
		lblClientIntrouvable.setBounds(132, 279, 135, 15);
		lblClientIntrouvable.setVisible(false);
		add(lblClientIntrouvable);
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
				
				if(Gestion_Des_Clients.listeClients.chercherClient(Integer.parseInt(NbClient.getText())) == null) {
					lblClientModifier.setVisible(false);
					lblClientIntrouvable.setVisible(true);
				}else {
					Gestion_Des_Clients.listeClients.modifierClient(Integer.parseInt(NbClient.getText()), Nom.getText(),Prenom.getText(),Address.getText().toUpperCase(),mdp.getText());
					lblClientIntrouvable.setVisible(false);
					lblClientModifier.setVisible(true);
					mdp.setText("");
					Address.setText("");
					Nom.setText("");
					Prenom.setText("");
				}
			}
		
		});
	}
	
}

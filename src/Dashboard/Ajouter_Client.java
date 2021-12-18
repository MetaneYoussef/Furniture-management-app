package Dashboard;
import java.util.Scanner;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.UIManager;

import projet_.Client;

public class Ajouter_Client extends JPanel {

	/**
	 * 
	 */
	Scanner sc=new Scanner(System.in);
	private static final long serialVersionUID = 1L;
	Client cl;
	JTextPane mdp ;
	JTextPane Address;
	JTextPane Nom;
	JTextPane Prenom;
	JLabel lblClientAjout = new JLabel("Client Ajouté !");
	/**
	 * Create the panel.
	 */
	public Ajouter_Client() {
		setBackground(Color.DARK_GRAY);
		setBounds(0 , 0, 400, 360);
		setVisible(true);
		setLayout(null);

		
		JLabel lblHereIsAdd = new JLabel("Ajouter Un Client");
		lblHereIsAdd.setFont(new Font("Dialog", Font.BOLD, 17));
		lblHereIsAdd.setForeground(Color.WHITE);
		lblHereIsAdd.setBounds(116, 12, 167, 36);
		add(lblHereIsAdd);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setForeground(Color.WHITE);
		lblNom.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNom.setBounds(12, 76, 167, 36);
		add(lblNom);
		
		JLabel lblHereIsAdd_1_1 = new JLabel("Prénom");
		lblHereIsAdd_1_1.setForeground(Color.WHITE);
		lblHereIsAdd_1_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblHereIsAdd_1_1.setBounds(12, 128, 167, 36);
		add(lblHereIsAdd_1_1);
		
		JLabel lblHereIsAdd_1_2 = new JLabel("Address");
		lblHereIsAdd_1_2.setForeground(Color.WHITE);
		lblHereIsAdd_1_2.setFont(new Font("Dialog", Font.BOLD, 17));
		lblHereIsAdd_1_2.setBounds(12, 180, 167, 36);
		add(lblHereIsAdd_1_2);
		
		JLabel lblHereIsAdd_1_3 = new JLabel("Mot De Passe");
		lblHereIsAdd_1_3.setForeground(Color.WHITE);
		lblHereIsAdd_1_3.setFont(new Font("Dialog", Font.BOLD, 17));
		lblHereIsAdd_1_3.setBounds(12, 232, 167, 36);
		add(lblHereIsAdd_1_3);
		
		Nom = new JTextPane();
		Nom.setBounds(155, 80, 233, 28);
		add(Nom);
		
		
		Prenom = new JTextPane();
		Prenom.setBounds(155, 132, 233, 28);
		add(Prenom);
	
		Address = new JTextPane();
		Address.setBounds(155, 184, 233, 28);
		add(Address);
		
		mdp = new JTextPane();
		mdp.setBounds(155, 236, 233, 28);
		add(mdp);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.darkShadow"));
		panel.setBounds(90, 312, 205, 36);
		add(panel);
		panel.setLayout(null);
		button_click(panel);
		JLabel lblAjouter = new JLabel("Ajouter");
		lblAjouter.setForeground(Color.WHITE);
		lblAjouter.setBounds(76, 10, 52, 15);
		panel.add(lblAjouter);
		
		
		lblClientAjout.setForeground(Color.GREEN);
		lblClientAjout.setBounds(150, 280, 100, 15);
		lblClientAjout.setVisible(false);
		add(lblClientAjout);

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
				Client cl=new Client();
				cl.setMotdepasse(mdp.getText());
				cl.setAdresse(Address.getText().toUpperCase());
				cl.setNom(Nom.getText());
				cl.setPrenom(Prenom.getText());
				Gestion_Des_Clients.listeClients.ajouterClient(cl);
				lblClientAjout.setVisible(true);
				mdp.setText("");
				Address.setText("");
				Nom.setText("");
				Prenom.setText("");
			}
		
		});
	}
}

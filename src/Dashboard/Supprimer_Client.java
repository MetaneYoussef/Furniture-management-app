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

public class Supprimer_Client extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3837434112405404928L;
	JTextPane NbClient;
	JLabel lblClientIntrouvable;
	JLabel lblClientSupprim;
	/**
	 * Create the panel.
	 */
	public Supprimer_Client() {
		setBackground(Color.DARK_GRAY);
		setBounds(0 , 0, 400, 360);
		setVisible(true);
		setLayout(null);
		
		JLabel lblHereIsAdd = new JLabel("Supprimer un Client");
		lblHereIsAdd.setFont(new Font("Dialog", Font.BOLD, 17));
		lblHereIsAdd.setForeground(Color.WHITE);
		lblHereIsAdd.setBounds(108, 0, 184, 42);
		add(lblHereIsAdd);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.BLACK);
		panel.setBounds(12, 42, 376, 288);
		add(panel);
		
		JLabel lblReference = new JLabel("Numero Du Client");
		lblReference.setForeground(Color.WHITE);
		lblReference.setFont(new Font("Dialog", Font.BOLD, 14));
		lblReference.setBounds(23, 66, 150, 28);
		panel.add(lblReference);
		
		NbClient = new JTextPane();
		NbClient.setBounds(178, 66, 167, 28);
		panel.add(NbClient);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_1.setBounds(99, 250, 185, 26);
		panel.add(panel_1);
		
		JLabel lblSupprimer = new JLabel("Supprimer");
		lblSupprimer.setForeground(Color.WHITE);
		lblSupprimer.setBounds(52, 4, 80, 15);
		panel_1.add(lblSupprimer);
		
		lblClientSupprim = new JLabel("Client Supprimé");
		lblClientSupprim.setVisible(false);
		lblClientSupprim.setFont(new Font("Dialog", Font.BOLD, 17));
		lblClientSupprim.setForeground(Color.GREEN);
		lblClientSupprim.setBounds(113, 160, 150, 15);
		panel.add(lblClientSupprim);
		
		lblClientIntrouvable = new JLabel("Client Introuvable");
		lblClientIntrouvable.setVisible(false);
		lblClientIntrouvable.setForeground(Color.RED);
		lblClientIntrouvable.setFont(new Font("Dialog", Font.BOLD, 17));
		lblClientIntrouvable.setBounds(102, 187, 171, 15);
		panel.add(lblClientIntrouvable);
		button_click(panel_1);
		
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
					lblClientSupprim.setVisible(false);
					lblClientIntrouvable.setVisible(true);
				}else {
					Gestion_Des_Clients.listeClients.supprimerClient(Integer.parseInt(NbClient.getText()));
					lblClientIntrouvable.setVisible(false);
					lblClientSupprim.setVisible(true);
					NbClient.setText("");
				}
			}
		
		});
	}
}

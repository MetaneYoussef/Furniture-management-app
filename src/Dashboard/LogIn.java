package Dashboard;

import java.lang.System;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Button;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LogIn {

	private JFrame frame;
	private JTextField txtEnterVotreNom;
	private JPasswordField txtMotDePasse;
	private JLabel lblLoginMessage = new JLabel("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.frame.setUndecorated(true);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public LogIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 238, 381);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(-116, 89, 479, 167);
		label.setIcon(new ImageIcon("/home/youssef/Desktop/POO_PROJECT/poo_project/src/images/Dark Green Simple Vector House Icon Logo Template.png"));
		panel.add(label);
		
		JLabel lblModernizeYourLife = new JLabel("MODERNIZE YOUR LIFE");
		lblModernizeYourLife.setHorizontalAlignment(SwingConstants.CENTER);
		lblModernizeYourLife.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		lblModernizeYourLife.setForeground(Color.WHITE);
		lblModernizeYourLife.setBounds(12, 231, 210, 15);
		panel.add(lblModernizeYourLife);
		
		
		
		txtEnterVotreNom = new JTextField();
		txtEnterVotreNom.setToolTipText("Enter votre nom");
		txtEnterVotreNom.setBounds(310, 103, 321, 41);
		frame.getContentPane().add(txtEnterVotreNom);
		txtEnterVotreNom.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(310, 143, 321, 9);
		frame.getContentPane().add(separator);
		
		JLabel lblUsername = new JLabel("Nom & Prénom");
		lblUsername.setBounds(310, 84, 152, 15);
		frame.getContentPane().add(lblUsername);
		
		txtMotDePasse = new JPasswordField();
		txtMotDePasse.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if(txtMotDePasse.equals("Mot de passe")) {
				txtMotDePasse.setEchoChar('●');
				txtMotDePasse.setText("");
			}
				else {
					txtMotDePasse.selectAll();
				}
			}	
			@Override
			public void focusLost(FocusEvent arg0) {
				if(txtMotDePasse.equals("")) {
					txtMotDePasse.setText("Mot de passe");
					txtMotDePasse.setEchoChar((char)0);
				}
			}
		});
		txtMotDePasse.setColumns(10);
		txtMotDePasse.setBounds(310, 179, 321, 41);
		frame.getContentPane().add(txtMotDePasse);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(310, 213, 169, -16);
		frame.getContentPane().add(separator_1_1);
		
		JLabel lblPrnom_1 = new JLabel("Mot de passe");
		lblPrnom_1.setBounds(310, 156, 102, 15);
		frame.getContentPane().add(lblPrnom_1);
		
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
		lbl_close.setForeground(new Color(255, 102, 0));
		lbl_close.setBounds(674, 0, 22, 27);
		frame.getContentPane().add(lbl_close);
		
		
		Button button = new Button("Log In");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
							if(txtEnterVotreNom.getText().equals("admin") && txtMotDePasse.getText().equals("admin123")) {
							//if user inputs are correct
							lblLoginMessage.setText("");
					
							JOptionPane.showMessageDialog(null, "Connexion réussie");
							frame.dispose();
							Graphical_Interface window = new Graphical_Interface();
							window.frame.setVisible(true);
						}else if(txtEnterVotreNom.getText().equals("client") && txtMotDePasse.getText().equals("client")){
							lblLoginMessage.setText("");
							JOptionPane.showMessageDialog(null, "Connexion réussie");
							frame.dispose();
							Graphical_Interface_Client window = new Graphical_Interface_Client();
							window.frame.setVisible(true);
						}
						else if(txtEnterVotreNom.getText().equals("") || txtEnterVotreNom.getText().equals("Nom d'utilisateur") || 
								txtMotDePasse.equals("") || txtMotDePasse.equals("Mot de Passe")) {
							lblLoginMessage.setText("Veuillez remplir tout les champs demandés!");
						}
						else {
							lblLoginMessage.setText("le nom d'utilisateur ou le mot de passe sont invalides!");
						}
			}
		});
		button.setFont(new Font("Ubuntu Light", Font.BOLD, 16));
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(255, 51, 0));
		button.setBounds(310, 288, 321, 41);
		frame.getContentPane().add(button);
		lblLoginMessage.setForeground(new Color(255, 0, 0));
		
		lblLoginMessage.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblLoginMessage.setBounds(345, 243, 250, 20);
		frame.getContentPane().add(lblLoginMessage);
		
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 696, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

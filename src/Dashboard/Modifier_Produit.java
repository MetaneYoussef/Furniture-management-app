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

import projet_.Produit;
import projet_.TypeProduits;

import javax.swing.JComboBox;

public class Modifier_Produit extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7976408124526399135L;
	JTextPane Nom;
	JTextPane Referance;
	JTextPane Description;
	JTextPane Caracter;
	JComboBox multiple;
	JTextPane Prix;
	JLabel lblProduitModfi;
	JLabel lblProduitIntrouvable;
	/**
	 * Create the panel.
	 */
	public Modifier_Produit() {
		setBackground(Color.DARK_GRAY);
		setBounds(0 , 0, 400, 360);
		setVisible(true);
		setLayout(null);
		
		JLabel lblAjouter = new JLabel("Modifier un produit");
		lblAjouter.setFont(new Font("Dialog", Font.BOLD, 22));
		lblAjouter.setBounds(75, 8, 255, 27);
		lblAjouter.setForeground(Color.WHITE);
		add(lblAjouter);
		
		JTextPane Nom = new JTextPane();
		Nom.setBounds(228, 56, 134, 19);
		add(Nom);
		
		JLabel lblNom = new JLabel("Nom du Produit");
		lblNom.setForeground(Color.WHITE);
		lblNom.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNom.setBounds(41, 53, 115, 21);
		add(lblNom);
		
		JLabel lblNom_1 = new JLabel("Referance");
		lblNom_1.setForeground(Color.WHITE);
		lblNom_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNom_1.setBounds(41, 81, 78, 21);
		add(lblNom_1);
		
		JLabel lblNom_2 = new JLabel("Description");
		lblNom_2.setForeground(Color.WHITE);
		lblNom_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNom_2.setBounds(41, 109, 86, 19);
		add(lblNom_2);
		
		JLabel lblNom_3 = new JLabel("Type");
		lblNom_3.setForeground(Color.WHITE);
		lblNom_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNom_3.setBounds(41, 135, 48, 27);
		add(lblNom_3);
		
		JLabel lblNom_4 = new JLabel("Caracteristique");
		lblNom_4.setForeground(Color.WHITE);
		lblNom_4.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNom_4.setBounds(41, 169, 126, 19);
		add(lblNom_4);
		
		JComboBox type = new JComboBox(new Object[]{"Informatique","Electronique","Electromenager","Kits Solaires","Mobile"});
		type.setFont(new Font("Dialog", Font.BOLD, 11));
		type.setToolTipText("Choose a type");
		type.setBounds(228, 137, 134, 19);
		add(type);
		
		JLabel lblNom_4_1 = new JLabel("Prix");
		lblNom_4_1.setForeground(Color.WHITE);
		lblNom_4_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNom_4_1.setBounds(41, 195, 78, 19);
		add(lblNom_4_1);
		
		JTextPane Reference = new JTextPane();
		Reference.setBounds(228, 83, 134, 19);
		add(Reference);
		
		JTextPane Description = new JTextPane();
		Description.setBounds(228, 110, 134, 19);
		add(Description);
		
		JTextPane Prix = new JTextPane();
		Prix.setBounds(228, 191, 134, 19);
		add(Prix);
		
		JTextPane Caracter = new JTextPane();
		Caracter.setBounds(228, 164, 134, 19);
		add(Caracter);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_2.setBounds(127, 317, 146, 27);
		add(panel_2);
		
		JLabel lblAjouter_1 = new JLabel("Modifier");
		lblAjouter_1.setForeground(Color.WHITE);
		lblAjouter_1.setBounds(47, 6, 69, 15);
		panel_2.add(lblAjouter_1);
		
		lblProduitModfi = new JLabel("Produit Modfié!");
		lblProduitModfi.setVisible(false);
		lblProduitModfi.setForeground(Color.GREEN);
		lblProduitModfi.setBounds(141, 246, 117, 15);
		add(lblProduitModfi);
		
		 lblProduitIntrouvable = new JLabel("Produit Introuvable!");
		 lblProduitIntrouvable.setVisible(false);
		lblProduitIntrouvable.setForeground(Color.RED);
		lblProduitIntrouvable.setBounds(127, 269, 146, 15);
		add(lblProduitIntrouvable);
		button_click(panel_2);
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
				System.out.print(Gestion_Des_Produits.Produits.chercherProduit(Referance.getText())+"\n");
				if (Gestion_Des_Produits.Produits.chercherProduit(Referance.getText()) == null) {
					System.out.print("product not found\n");
					lblProduitModfi.setVisible(false);
					lblProduitIntrouvable.setVisible(true);
				}else {
				Gestion_Des_Produits.Produits.modifier(Nom.getText(),
						Referance.getText(),
						Double.parseDouble(Prix.getText()),
						Description.getText(),
						Caracter.getText(),
						choisir_type(multiple.getSelectedItem().toString()));
				lblProduitModfi.setVisible(true);
				lblProduitIntrouvable.setVisible(false);
				}
			}
		});
	}

	public static TypeProduits choisir_type(String S) {
		 switch(S)
	        {
			        case "Mobile":
			        	return TypeProduits.Mobile;
			        
			        case "Electronique":
			        	return(TypeProduits.Electronique);
				    
			        case "Electromenager":
			        	return(TypeProduits.Electromenager);
				    
			        case "Informatique":
			        	return(TypeProduits.Informatiques);
				    
			        case "Kits Solaires":
			        	return(TypeProduits.Kits_Solaires);
				    
				    default:
				    	System.out.print("\nEntrer un type valide\n");
				    	return null;
				    
	        }
	}

}

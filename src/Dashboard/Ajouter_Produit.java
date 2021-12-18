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

import projet_.Client;
import projet_.Produit;
import projet_.TypeProduits;

import javax.swing.JComboBox;

public class Ajouter_Produit extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8642571539391772413L;
	JTextPane Nom;
	JTextPane Referance;
	JTextPane Description;
	JTextPane Caracter;
	JComboBox multiple;
	JTextPane Prix;
	JLabel lblProduitsAjout;
	/**
	 * Create the panel.
	 */
	public Ajouter_Produit() {
		setBackground(Color.DARK_GRAY);
		setBounds(0 , 0, 400, 360);
		setVisible(true);
		setLayout(null);
		
		JLabel lblAjouter = new JLabel("AJOUTER");
		lblAjouter.setFont(new Font("Dialog", Font.BOLD, 22));
		lblAjouter.setBounds(145, 12, 109, 27);
		lblAjouter.setForeground(Color.WHITE);
		add(lblAjouter);
		
		Nom = new JTextPane();
		Nom.setBounds(199, 61, 189, 21);
		add(Nom);
		
		JLabel lblNom = new JLabel("Nom du Produit");
		lblNom.setForeground(Color.WHITE);
		lblNom.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNom.setBounds(12, 52, 146, 27);
		add(lblNom);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(UIManager.getColor("Button.darkShadow"));
		panel.setBounds(91, 312, 205, 36);
		add(panel);
		
		JLabel lblAjouter_1 = new JLabel("Ajouter");
		lblAjouter_1.setForeground(Color.WHITE);
		lblAjouter_1.setBounds(76, 10, 52, 15);
		panel.add(lblAjouter_1);
		
		Referance = new JTextPane();
		Referance.setBounds(199, 95, 189, 21);
		add(Referance);
		
		JLabel lblNom_1 = new JLabel("Referance");
		lblNom_1.setForeground(Color.WHITE);
		lblNom_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNom_1.setBounds(12, 89, 155, 27);
		add(lblNom_1);
		
		 Description = new JTextPane();
		Description.setBounds(199, 131, 189, 21);
		add(Description);
		
		JLabel lblNom_2 = new JLabel("Description");
		lblNom_2.setForeground(Color.WHITE);
		lblNom_2.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNom_2.setBounds(12, 125, 155, 27);
		add(lblNom_2);
		
		JLabel lblNom_3 = new JLabel("Type");
		lblNom_3.setForeground(Color.WHITE);
		lblNom_3.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNom_3.setBounds(12, 161, 155, 27);
		add(lblNom_3);
		
		 Caracter = new JTextPane();
		Caracter.setBounds(199, 201, 189, 21);
		add(Caracter);
		
		JLabel lblNom_4 = new JLabel("Caracteristique");
		lblNom_4.setForeground(Color.WHITE);
		lblNom_4.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNom_4.setBounds(12, 195, 155, 27);
		add(lblNom_4);
		String Type[]= {"Informatique","Electronique","Electromenager","Kits Solaires","Mobile"};
		multiple = new JComboBox(Type);
		multiple.setToolTipText("Choose a type");
		multiple.setBounds(199, 164, 189, 27);
		add(multiple);
		
		JLabel lblNom_4_1 = new JLabel("Prix");
		lblNom_4_1.setForeground(Color.WHITE);
		lblNom_4_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNom_4_1.setBounds(12, 230, 155, 27);
		add(lblNom_4_1);
		
		Prix = new JTextPane();
		Prix.setBounds(199, 236, 189, 21);
		add(Prix);
		
		 lblProduitsAjout = new JLabel("Produits Ajouté");
		lblProduitsAjout.setForeground(Color.GREEN);
		lblProduitsAjout.setBounds(137, 285, 125, 15);
		lblProduitsAjout.setVisible(false);
		add(lblProduitsAjout);
		button_click(panel);
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
				
				Gestion_Des_Produits.Produits.ajouterProduit(new Produit(Nom.getText(),
						Referance.getText(),
						Double.parseDouble(Prix.getText()),
						Description.getText(),
						Caracter.getText(),
						choisir_type(multiple.getSelectedItem().toString())));
				lblProduitsAjout.setVisible(true);
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

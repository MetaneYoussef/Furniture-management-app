package Dashboard;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Afficher_Liste_Produit extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1784870701308740750L;
	private JTable table;
	String Header[] = {"Nom","Type","Reference","Descriptif","Caracteristiques","Prix"}; 
	int row;
	 DefaultTableModel dtm;
	
	/**
	 * Create the panel.
	 */
	public Afficher_Liste_Produit() {
		setBackground(Color.DARK_GRAY);
		setBounds(0 , 0, 400, 360);
		setVisible(true);
		setLayout(null);
		
		JLabel lblAjouter = new JLabel("Afficher La liste des produits");
		lblAjouter.setFont(new Font("Dialog", Font.BOLD, 22));
		lblAjouter.setBounds(12, 12, 376, 27);
		lblAjouter.setForeground(Color.WHITE);
		add(lblAjouter);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 51, 376, 260);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		dtm = new DefaultTableModel(Header,0);
		table.setModel(dtm);
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				displayproductlist();
			}
		});
		btnUpdate.setBounds(145, 323, 117, 25);
		add(btnUpdate);
		
		
		
	}
	public void displayproductlist() {
		int i;
		dtm.setRowCount(0);
		if(Gestion_Des_Produits.Produits.getProduits().size()>0) {
			System.out.print("the size is :"+Gestion_Des_Produits.Produits.getProduits().size()+"\n");
			
			for(i=0;i<Gestion_Des_Produits.Produits.getProduits().size();i++)
			{
				System.out.print("Client " +i+"\n");
				Object[] objs = {Gestion_Des_Produits.Produits.getProduits().get(i).getNom(),
						Gestion_Des_Produits.Produits.getProduits().get(i).getType(),
						Gestion_Des_Produits.Produits.getProduits().get(i).getReference(),
						Gestion_Des_Produits.Produits.getProduits().get(i).getDescriptif(),
						Gestion_Des_Produits.Produits.getProduits().get(i).getCaracteristiques(),
						Gestion_Des_Produits.Produits.getProduits().get(i).getPrix()};
	            dtm.addRow(objs);
			}
			Gestion_Des_Clients.listeClients.afficherClients();
		}
	}

}

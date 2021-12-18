package Dashboard;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Afficher_Liste_Client extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6984921332604921009L;
	String Header[] = {"Nb Client","Nom","Prenom","Address","Mot De Passe"}; 
	int row;
	 DefaultTableModel dtm;
	 private JTable table;
	/**
	 * Create the panel.
	 */
	public Afficher_Liste_Client() {
		setBackground(Color.DARK_GRAY);
		setBounds(0 , 0, 400, 360);
		setVisible(true);
		setLayout(null);
		
		JLabel lblHereIsAdd = new JLabel("Afficher Liste");
		lblHereIsAdd.setFont(new Font("Dialog", Font.BOLD, 17));
		lblHereIsAdd.setForeground(Color.WHITE);
		lblHereIsAdd.setBounds(137, 12, 125, 27);
		add(lblHereIsAdd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 46, 376, 260);
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
		if(Gestion_Des_Clients.listeClients.getClients().size()>0) {
			System.out.print("the size is :"+Gestion_Des_Clients.listeClients.getClients().size()+"\n");
			
			for(i=0;i<Gestion_Des_Clients.listeClients.getClients().size();i++)
			{
				System.out.print("Client " +i+"\n");
				Object[] objs = {Gestion_Des_Clients.listeClients.getClients().get(i).getNbClient(),
						Gestion_Des_Clients.listeClients.getClients().get(i).getNom(),
						Gestion_Des_Clients.listeClients.getClients().get(i).getPrenom(),
						Gestion_Des_Clients.listeClients.getClients().get(i).getAdresse(),
						Gestion_Des_Clients.listeClients.getClients().get(i).getMotdepasse()};
	            dtm.addRow(objs);
			}
			Gestion_Des_Clients.listeClients.afficherClients();
		}
	}
}

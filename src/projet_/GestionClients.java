package projet_;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestionClients {
	Scanner sc=new Scanner(System.in);
	private ArrayList<Client> clients;
    
	
	public GestionClients()
	{
		this.clients=new ArrayList<Client>();
		//Client cl=new Client();
		
        //this.ajouter(cl);
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	
	public Client chercherClient(int nbClient){
		
		for (int i = 0; i<clients.size(); i++)
		{
			if(nbClient == clients.get(i).getNbClient())
				return clients.get(i);
		}
		return null;
	}
	
	public void ajouterClient(Client cl) {
		
				if (!clients.contains(cl))
				{
					clients.add(cl);
					System.out.println("- Client ajouter:"+ cl.toString());
				}
				else
				{
					System.out.println("Erreur: le client existe deja"+cl.toString());		
				}
	}
	public void ajoutersescommandes(int numClient,Commande e,ArrayList<Client> c ) {
		for (int i = 0; i<c.size(); i++)
		{
			if(numClient == c.get(i).getNbClient())
			{
				c.get(i).getAchats().add(e);
				System.out.println("Commande N°:"+e.getNumCommande()+" ajoutee au client N°: "+numClient);
		    }
	    }
	}
	

	public void modifierClient(int nbClient, String nom, String pre, String adr, String mp) {
		Client cl = chercherClient(nbClient);
		if (cl!=null)
		{
			cl.setNom(nom);
			cl.setPrenom(pre);
			cl.setAdresse(adr);
			cl.setMotdepasse(mp);
			System.out.println("Client modifié"+cl.toString());
		}
		else
		{
		System.out.println("Client n'existe pas");
		}				
	}

	public void supprimerClient(int nbClient) {
		Client cl = chercherClient(nbClient);
		if (cl!=null)
		{
			clients.remove(cl);
			System.out.println("Client supprimé");
		}
		else
		{
		System.out.println("Client n'existe pas");
		}				
	}
	
	public void afficherClients()
	{
		Iterator<Client> it=clients.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

package projet_;
import java.util.ArrayList;
import java.util.Date;

public class Commande {
	private ArrayList <Produit> produits;
	private Liste_Des_Produits produits2;
	private Date date;
	private static int ct;
	private int numCommande;
	private int nbrClient;
	private String ville;
	
	
	public ArrayList<Produit> getProduits() {
		return produits;
	}
	public void setProduits(ArrayList<Produit> produits) {
		this.produits = produits;
	}
	
	public Liste_Des_Produits getProduits2() {
		return produits2;
	}
	public void setProduits2(Liste_Des_Produits produits2) {
		this.produits2 = produits2;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getNumCommande() {
		return numCommande;
	}
	
	public int getNbrClient() {
		return nbrClient;
	}
	
	public void setNbrClient(int nbrClient) {
		this.nbrClient = nbrClient;
	}
	
	public Commande() {
		this.date = new Date();
		ct++;
		numCommande=ct;
		ville="";
	}
	public Commande(ArrayList<Produit> p, String ville, int nbrClient)
	{
		this.produits = p;
		this.date = date;
		ct++;
		numCommande=ct;
		this.ville=ville;
		this.nbrClient=nbrClient;
		
	}
	public Commande(Liste_Des_Produits produits2,String ville, int nbrClient) {
		this.produits2 = produits2;
		this.date = date;
		ct++;
		numCommande=ct;
		this.ville=ville;
		this.nbrClient=nbrClient;
	}
	@Override
	public String toString() {
		return "Commande No: "+numCommande+",\nDate=" + date + "\n";
	}
	public void afficherCommande() {
		System.out.println(this.toString());
		System.out.println("Les produits achetés sont:");
		produits2.afficher_Liste();
	}

}

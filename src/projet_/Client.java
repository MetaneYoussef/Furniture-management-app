package projet_;

import java.util.ArrayList;

public class Client {
	private String nom;
	private String prenom;
	private String adresse;
	private String motdepasse;
	private int nbClient;
	private static double montantInfo;
	private static double montantElec;
	private static double montantKits;
	private static int nbrpachete;
	private static int cpt;
	private ArrayList<Commande> achats;
	                                        //*************CONSTRUCTEURS******************//
	//Constructeur sans parametres
	
	public Client() {
		this("","","","",0,0,0,0,0);
	}
	
	//Constructeur avec parametres
	
	public Client(String nom, String prenom, String adresse,String motdepasse, int nbClient, double montantInfo, double montantElec, double montantKits, int nbrpachete) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.motdepasse=motdepasse;
		cpt++;
		this.nbClient = cpt;
		this.montantInfo=montantInfo;
		this.montantElec=montantElec;
		this.montantKits=montantKits;
		this.nbrpachete=nbrpachete;
	}
	
                                               //************Les assesseurs*****************//
	//Getters
	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public String getMotdepasse() {
		return motdepasse;
	}

	public int getNbClient() {
		return nbClient;
	}

	public static int getNbrpachete() {
		return nbrpachete;
	}
	
	public static double getMontantInfo() {
		return montantInfo;
	}

	public static double getMontantElec() {
		return montantElec;
	}

	public static double getMontantKits() {
		return montantKits;
	}
	
	public ArrayList<Commande> getAchats() {
		return achats;
	}

	//Setters
	

	public void setAchats(ArrayList<Commande> achats) {
		this.achats = achats;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	
	public void setNbClient(int nbClient) {
		this.nbClient = nbClient;
	}

	public static void setNbrpachete(int nbrpachete) {
		Client.nbrpachete = nbrpachete;
	}
	
	public static void setMontantInfo(double montantInfo) {
		Client.montantInfo = montantInfo;
	}
	
	public static void setMontantElec(double montantElec) {
		Client.montantElec = montantElec;
	}

	public static void setMontantKits(double montantKits) {
		Client.montantKits = montantKits;
	}
	
	//Methodes d'affichage
	
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", nbClient=" + nbClient + "]";
	}
	
	public void afficherClient()
	{
		System.out.println(this.toString());
	}

}

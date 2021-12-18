package projet_;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class GestionCommandes {
	private ArrayList<Commande> commandes;
	private ArrayList<Produit> prods;
	Liste_Des_Produits produits = new Liste_Des_Produits();
	private Date date;
	Scanner sc=new Scanner(System.in);
	
	public GestionCommandes()
	{
		this.commandes=new ArrayList<Commande>();
		this.date=new Date();
	}

	
	public ArrayList<Commande> getCommandes() {
		return commandes;
	}

	
	public void setCommandes(ArrayList<Commande> Commandes) {
		this.commandes = commandes;
	}

	
	public Date getDate() {
		return date;
	}

	
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public Commande chercherCommande(int numCom){
			
		for (int i = 0; i<commandes.size(); i++)
		{
			if(numCom == commandes.get(i).getNumCommande())
				return commandes.get(i);
		}
			return null;
	}
	    
	
	public void ajouterCommande(Commande cmd,GestionClients lc)
	{   int choix=1;
		while(choix==1) {			
			Produit p=new Produit();
    		produits.ajouterProduit(p);
    
    		switch(p.getType()) {
				    	case Mobile:
					    		GestionStock.nbr_produits_mobile--;
					    		GestionStock.produits_mobile++;
					    break;
					   	case Electronique:
					    		GestionStock.nbr_produits_electronique--;
					    		GestionStock.produits_electronique++;
				 		break;
				     	case Electromenager:
					    		GestionStock.nbr_produits_electromenager--;
					    		GestionStock.produits_electromenager++;
			    		break;
					   	case Informatiques:
					    		GestionStock.nbr_produits_infomatique--;
					    		GestionStock.produits_infomatique++;
			
				  		break;
				    	case Kits_Solaires:
					    		GestionStock.nbr_produits_kits--;
					    		GestionStock.produits_kits++;
			
				 		break;
		    	}
    		System.out.print("ajouter un autre produits ? Y(1)/N(2)");
    		choix = sc.nextInt();
    		}
		
		
			System.out.println("Entrer votre ville");
			String x=sc.next();
			System.out.println("Entrer votre numero client");
			int y=sc.nextInt();
			
			prods=produits.getProduits();
			cmd=new Commande(prods,x.toUpperCase(),y);
	        cmd.setProduits(prods);
	        cmd.setProduits2(produits);
	        cmd.setDate(new Date());
			this.commandes.add(cmd);
			System.out.println("Commande ajout�e");
			/*
			ArrayList<Client> c=lc.getClients();
			lc.ajoutersescommandes(y, cmd,c);*/
		}
		
		//MODIFICATION DE LA COMMANDE
	public void modifierCommande(int n,Liste_Des_Produits p, String ville, int numClient)
	{
		Commande c = chercherCommande(n);
		if(c!= null)
		{   System.out.println("Entrer la liste des produits");
			c.setProduits2(p);
			System.out.println("Entrer la ville");
			c.setVille(ville);	
			System.out.println("Entrer Numero Client");
			c.setNbrClient(numClient);
		}
	}
		
	
	//SUPPRESSION D'UNE COMMANDE + MODIFIER LE STOCK
	public void supprimerCommande(int numCom)
	{    Commande cmd= chercherCommande(numCom);
		if(cmd != null)
		{
			commandes.remove(cmd);
			ArrayList<Produit> temporaire=cmd.getProduits();
			for (int i=0;i<temporaire.size();i++)
			{
				switch(temporaire.get(i).getType()) {
		    	case Mobile:
			    		GestionStock.nbr_produits_mobile++;
		    	break;
		    	
		    	case Electronique:
			    		GestionStock.nbr_produits_electronique++;
	    		break;
			   	
		    	case Electromenager:
			    		GestionStock.nbr_produits_electromenager++;
	    		break;
		    	
			   	case Informatiques:
			    		GestionStock.nbr_produits_infomatique++;
			   	break;
			   	
			   	case Kits_Solaires:
			    		GestionStock.nbr_produits_kits++;
		  		break;
			    	}
			}
				System.out.println("Commande annul�e");
		}
	}
	
	
	//AFFICHAGE D'UNE COMMANDE
	public void afficherCom()
	{   
		for (int i=0; i<commandes.size();i++)
		{
			//System.out.println(it.next());
			commandes.get(i).afficherCommande(); 
		}
	}
	
	//*********************************AFFICHAGE FILTRE*****************************************
	
	//AFFICHAGE DU PRODUIT LE PLUS COMMERSIALISE
	
	public void afficherProduitsPlusCommercialise(Date d1, Date d2, GestionCommandes commandes) {
		ArrayList<Commande> com=commandes.getCommandes();
		for(int i=0;i<com.size();i++)
		{
			if(com.get(i).getDate().after(d1) && com.get(i).getDate().before(d2))
			{
				switch(com.get(i).getProduits().get(i).getType())
				{
					case Mobile:
						GestionStock.produits_mobile++;
						break;
		    	
					case Electronique:
						GestionStock.produits_electronique++;
						break;
		    
					case Electromenager:
						GestionStock.produits_electromenager++;
						break;
		    
					case Informatiques:
						GestionStock.produits_infomatique++;
						break;
		    
					case Kits_Solaires:
						GestionStock.produits_kits++;
						break;
		    	}
			}
		}
		int plus_commercialise=GestionCommandes.max();
		switch(plus_commercialise) 
		{
    		case 0:
    			System.out.println("Le produit le plus commercialis� c'est : Mobile");;
    			break;
    		
    		case 1:
    			System.out.println("Les produits les plus commercialis�s sont : Les produits Electroniques");;
    			break;
    		
    		case 2:
    			System.out.println("Les produits les plus commercialis�s sont : Les produits Kits");
    			break;
    		
    		case 3:
    			System.out.println("Les produits les plus commercialis�s sont : Les produits Informatiques");;
    			break;
    		
    		case 4:
    			System.out.println("Les produits les plus commercialis�s sont : Les produits Electromenager");;
    			break;
    	}	
	}
	
	//AFFICHAGE DU PRODUIT LE MOINS COMMERCIALISE
	public void afficherProduitsMoinsCommercialise(Date d1, Date d2, GestionCommandes commandes) {
		ArrayList<Commande> com=commandes.getCommandes();
		for(int i=0;i<com.size();i++) {
			if(com.get(i).getDate().after(d1) && com.get(i).getDate().before(d2))
			{
				switch(com.get(i).getProduits().get(i).getType()) {
		    	case Mobile:
		    		GestionStock.produits_mobile++;
		    	break;
		    	case Electronique:
		    		GestionStock.produits_electronique++;
		    		break;
		    	case Electromenager:
		    		GestionStock.produits_electromenager++;
		    		break;
		    	case Informatiques:
		    		GestionStock.produits_infomatique++;
		    		break;
		    	case Kits_Solaires:
		    		GestionStock.produits_kits++;
		    		break;
		    	}
			}
		}
		int plus_commercialise=GestionCommandes.min();
		switch(plus_commercialise) {
    	case 0:
    		System.out.println("Le produit le moins commercialis� c'est : Mobile");;
    	break;
    	case 1:
    		System.out.println("Les produits le moins commercialis�s sont : Les produits Electroniques");;
    		break;
    	case 2:
    		System.out.println("Les produits les moins commercialis�s sont : Les produits Kits");
    		break;
    	case 3:
    		System.out.println("Les produits les moins commercialis�s sont : Les produits Informatiques");;
    		break;
    	case 4:
    		System.out.println("Les produits les moins commercialis�s sont : Les produits Electromenager");;
    		break;
    	}	
	}
	
	
	//AFFICHAGE DES ACHATS DES PRODUITS
	public void afficherAchat(TypeProduits t, Date d1, Date d2,GestionCommandes commandes) {
		ArrayList<Commande> com=commandes.getCommandes();
		for(int i=0;i<com.size();i++) 
		{
			if(com.get(i).getDate().after(d1) && com.get(i).getDate().before(d2))
			{
				ArrayList<Produit> p= com.get(i).getProduits();
				if(p.get(i).getType()==t)
				{
					com.get(i).afficherCommande();
				}
			}
		}
	}
	
	
	//AFFICHAGE DU PRODUIT PAR VILLE 
	public void afficherProduitparville(Date d, Date d0, TypeProduits type , String ville,GestionCommandes commandes) 
	{   
		ArrayList<Commande> com=commandes.getCommandes();
		for(int i=0;i<com.size();i++) 
		{
			if(com.get(i).getDate().after(d) && com.get(i).getDate().before(d0))
			{
				if(com.get(i).getVille()==ville)
				{
					ArrayList<Produit> p= com.get(i).getProduits();
					if(p.get(i).getType()==type)
					{
						com.get(i).afficherCommande();
					}
					
				}
			}		
		}
	}
	
	
	//SUPPLEMENTAIRE POUR L'AFFICHAGE DU PRODUIT PLUS/MOINS COMMERSIALISE
	public static int max() {
		int [] max= {GestionStock.produits_mobile,GestionStock.produits_electronique,GestionStock.produits_kits,GestionStock.produits_infomatique,GestionStock.produits_electromenager};
	    int x=max[0], pc=0;
		for(int i=1;i<5;i++) {
	    	if(x<max[i])
	    	{
	    		x=max[i];
	    		pc=i;
	    	}
	    }
		return pc;
	}
	
	
	public static int min() {
		int [] min= {GestionStock.produits_mobile,GestionStock.produits_electronique,GestionStock.produits_kits,GestionStock.produits_infomatique,GestionStock.produits_electromenager};
	    int x=min[0], pc=0;
		for(int i=1;i<5;i++) {
	    	if(x>min[i])
	    	{
	    		x=min[i];
	    		pc=i;
	    	}
	    }
		return pc;
	}

}

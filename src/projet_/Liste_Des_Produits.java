package projet_;
import java.util.ArrayList;
import java.util.Scanner;

public class Liste_Des_Produits {
	Scanner sc=new Scanner(System.in);
	ArrayList<Produit> produits;
	
	//constucteur
	public Liste_Des_Produits() {
		this.produits=new ArrayList<Produit>();
	}
	///GETTERS && SETTERS
	public ArrayList<Produit> getProduits() {
		return produits;
	}

	public void setProduits(ArrayList<Produit> produits) {
		this.produits = produits;
	}

	
	
	/// RECHERCHE
    public Produit chercherProduit(String reference){
		
		for (int i = 0; i<produits.size(); i++)
		{
			if(reference.equals(produits.get(i).getReference()))
				return produits.get(i);
		}
		return null;
	}
    
    
    ///AJOUTER UN PRODUIT
    public void ajouterProduit(Produit p)
    {	
    	///CREATION D'UNE INSTANCE DU PRODUIT
        System.out.println("Veuillez saisir le nom du produit :\t");
        p.setNom(sc.next());
        System.out.println("Veillez saisir la reference:\t");
        p.setReference(sc.next());
        System.out.println("Veillez saisir la Description:\t");
        p.setDescriptif(sc.next());
        System.out.println("Definir le type:"
        		+"\n1- Mobile"
        		+"\n2- Electronique"
        		+"\n3- Electromenager"
        		+"\n4- Informatiques"
        		+"\n5- Kits_Solaires"
        		+"\nVeuillez sasir votre choix:  "
        		);
        p.setType(choisir_type(sc.nextInt()));
        System.out.println("Veillez saisir le prix:\t");
        p.setPrix(sc.nextDouble());
    	produits.add(p);
    	switch(p.getType()) {
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
    
    
    
    ///SUPPRIMER UN PRODUIT
    public void supprimer(String reference)
    {
    	
    	if(chercherProduit(reference)!=null)
    	{
    		for (int i = 0; i<produits.size(); i++)
    		{
    			if(reference.equals(produits.get(i).getReference())) {
    				switch(produits.get(i).getType()) {
    		    	case Mobile:
    		    		GestionStock.nbr_produits_mobile--;
    		    	break;
    		    	case Electronique:
    		    		GestionStock.nbr_produits_electronique--;
    		    		break;
    		    	case Electromenager:
    		    		GestionStock.nbr_produits_electromenager--;
    		    		break;
    		    	case Informatiques:
    		    		GestionStock.nbr_produits_infomatique--;
    		    		break;
    		    	case Kits_Solaires:
    		    		GestionStock.nbr_produits_kits--;
    		    		break;
    		    	}
    				produits.remove(i);
    				System.out.print("Produit Supprim� !");
    			}
    		}
    	}else System.out.print("Ce produits n'existe pas !");
    }
    
    
    
    
    ////MODIFIER UN PRODUIT
    public void modifier(String nom,String reference, double prix, String descriptif,String caracteristiques,TypeProduits type)
    {
    	Produit p=chercherProduit(reference);
    	if(p!=null) {
    		p.setCaracteristiques(caracteristiques);
    		p.setNom(nom);
    		p.setDescriptif(descriptif);
            p.setType(type);
            p.setPrix(prix);
            System.out.println("Produit modifieé!");
            }
    }
   
    
    ///AFFICHAGE DE LA LISTE 
    public void afficher_Liste() {
    	for(Produit p: produits)
    	{
    		p.afficherProduit();
    	}
    }
    
    ///AFFICHAGE PAR TYPE
    public void afficher_type(TypeProduits Type) {
    	for(Produit p: produits) {
    		if(p.getType() == Type) {
    			p.afficherProduit();
    		}
    	}
    }
    
  //CHOIX DU TYPE
  		public static TypeProduits choisir_type(int i) {
  			 switch(i)
  		        {
  				        case 1:
  				        	return TypeProduits.Mobile;
  				        
  				        case 2:
  				        	return(TypeProduits.Electronique);
  					    
  				        case 3:
  				        	return(TypeProduits.Electromenager);
  					    
  				        case 4:
  				        	return(TypeProduits.Informatiques);
  					    
  				        case 5:
  				        	return(TypeProduits.Kits_Solaires);
  					    
  					    default:
  					    	System.out.print("\nEntrer un type valide\n");
  					    	return null;
  					    
  		        }
  		}
    
}

package projet_;

import java.util.Arrays;

public class Produit {
	
	private String nom;
	private String reference;
	private String descriptif;
	private String caracteristiques;
	private double prix;
	private TypeProduits type;
	
	
	
	
	//// CONSTRUCTEURS
	  public Produit() {
	    	this.nom="";
	    	this.reference="";
	    	this.descriptif="";
	    	this.prix=0.;
	    }
	  
	  public Produit(String n, String r, double p,String d,String C,TypeProduits T)
	    {
	    	this.nom=n;
	    	this.reference=r;
	    	this.descriptif=d;
	    	this.prix=p;
	    	this.caracteristiques=C;
	    	this.type=T;
	    }
	    
	    
	    
	    
	    
	 ////SETTERS ET GETTERS   
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getReference() {
		return reference;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public String getDescriptif() {
		return descriptif;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getCaracteristiques() {
		return caracteristiques;
	}
	public void setCaracteristiques(String caracteristiques) {
		this.caracteristiques = caracteristiques;
	}
	public TypeProduits getType() {
		return type;
	}
	public void setType(TypeProduits type) {
		this.type = type;
	}

	
	
	
	
	
	//AFFICHAGE
	@Override
	public String toString() {
		return "Nom produit: "+ nom + "\nType: "+ type +"\nReference:" + reference + "\nDescriptif:" + descriptif + ",\nCaracteristiques:"
				+caracteristiques + "\nPrix = " + prix +"\n";
	}
	public void afficherProduit()
	{
		System.out.println(this.toString());
	}
	
	

    
}

package projet_;

public class GestionStock {
	
	 public static int nbr_produits_infomatique;
	 public static int	nbr_produits_electronique;
	 public static int nbr_produits_mobile;
	 public  static int nbr_produits_electromenager;
	 public  static int nbr_produits_kits;
	 public  static int nbr_produits_total;
	 
	 
	 
	 //Pour le nombre d'achats
	 public static int produits_infomatique;
	 public static int produits_electronique;
	 public static int produits_mobile;
	 public  static int produits_electromenager;
	 public  static int produits_kits;
	 
	 
	 public GestionStock(){
		 nbr_produits_infomatique = 0;
		 nbr_produits_electronique = 0 ;
		 nbr_produits_kits = 0;
		 nbr_produits_mobile = 0;
		 nbr_produits_electromenager = 0;
	 }
	 GestionStock(int nbpi,int nbpe, int nbpk,int nbpem,int nbpm){
		 nbr_produits_infomatique = nbpi;
		 nbr_produits_electronique = nbpe ;
		 nbr_produits_kits = nbpk;
		 nbr_produits_mobile = nbpm;
		 nbr_produits_electromenager = nbpem;
	 }
	public static int getNbr_produits_infomatique() {
		return nbr_produits_infomatique;
	}
	public static void setNbr_produits_infomatique(int nbr_produits_infomatique) {
		GestionStock.nbr_produits_infomatique = nbr_produits_infomatique;
	}
	public static int getNbr_produits_electronique() {
		return nbr_produits_electronique;
	}
	public static void setNbr_produits_electronique(int nbr_produits_electronique) {
		GestionStock.nbr_produits_electronique = nbr_produits_electronique;
	}
	public static int getNbr_produits_mobile() {
		return nbr_produits_mobile;
	}
	public static void setNbr_produits_mobile(int nbr_produits_mobile) {
		GestionStock.nbr_produits_mobile = nbr_produits_mobile;
	}
	public static int getNbr_produits_electromenager() {
		return nbr_produits_electromenager;
	}
	public static void setNbr_produits_electromenager(int nbr_produits_electromenager) {
		GestionStock.nbr_produits_electromenager = nbr_produits_electromenager;
	}
	public static int getNbr_produits_kits() {
		return nbr_produits_kits;
	}
	public static void setNbr_produits_kits(int nbr_produits_kits) {
		GestionStock.nbr_produits_kits = nbr_produits_kits;
	}
	public static int getNbr_produits_total() {
		return nbr_produits_total;
	}
	public static void setNbr_produits_total(int nbr_produits_total) {
		GestionStock.nbr_produits_total = nbr_produits_total;
	}
	
	public String toString()
	{
		return "Produits stockés:"
			+"\nProduits d'informatique:"+nbr_produits_infomatique
			+"\nProduits electronique: "+nbr_produits_electronique
			+"\nProduits kits_solaires: "+nbr_produits_kits
			+"\nProduits mobile: "+nbr_produits_mobile
			+"\nProduits electromenager"+nbr_produits_electromenager;
	}
	public void afficherStock()
	{
		System.out.println(this.toString());
	}
	
	
	
	
	 
	 
}

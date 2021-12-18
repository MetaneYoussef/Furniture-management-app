package projet_;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.ParseException;

import java.util.Date;
public class Programme {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			ArrayList<Client> clients=new ArrayList<Client>();
			GestionClients listeClients= new GestionClients();
			Liste_Des_Produits produits = new Liste_Des_Produits();
			ArrayList<Produit> produit=new ArrayList<Produit>();
			GestionCommandes listeCommandes=new GestionCommandes();
			int choix=1;
			String caracteristique;
			
			// Pour le teste 
			String nom_produits_tmp;
			String description_produits_tmp;
			Double prix;
			TypeProduits type;
			String reference;
			//
			Date d1=new Date();
        	GestionStock s=new GestionStock(100,100,100,100,100); //intialistation du stock 
			System.out.println("current date:"+d1);
	
			
			
		while(choix != 0) {
				System.out.println("***************Menu**************\n"
					          +"\n1: Gestion des produits."
					          +"\n2: Gestion des clients."
					          +"\n3: Gestion des commandes."
					          +"\n4: Quitter."
					          +"\nVeuillez sasir votre choix:\t");
				
				
				switch(sc.nextInt())
				{ 
				
//*******************************************DEBUT GESTION DES PRODUITS*********************************************
					case 1: 
						
						    System.out.println("****************Bienvenu dans la gestion des produits***********");
						    choix = 7;
						    while(choix > 6) {
						   	 System.out.println(""
						   			  +"\n1: Creer une liste des produits"
							          +"\n2: Ajouter produit."
							          +"\n3: Supprimer produit."
							          +"\n4: Modifier produit."
							          +"\n5: Afficher la liste Produit par type de produit."
							          +"\n6: Quitter."
							          +"\nVeuillez sasir votre choix:\t");
						   	 		choix = sc.nextInt();
						   	 		System.out.print(choix);
						    }
						    switch(choix) {
						    	case 1 :
						    		System.out.print("\n \n ******* Creer une liste des produits ******** \n \n");
						    		choix=1;
						    		while(choix==1) {
						    			produits.ajouterProduit(new Produit());
						    			System.out.print("ajouter un autre produits ? Y(1)/N(2)");
						    			choix = sc.nextInt();
						    		}
						    	break;
						    	case 2:
						    		System.out.print("\n \n ******* Ajouter un produit ******** \n \n");
						    		produits.ajouterProduit(new Produit());
						    		s.afficherStock();
						    	break;	
						    	
						    	case 3:
						    		System.out.print("\n \n ******* Supprimer un produit ******** \n \n");
						    		System.out.print("Entrer la referance du produit : ");
						    		produits.supprimer(sc.next());
							    break;
							    	
						    	case 4:
						    		System.out.print("\n \n ******* Modifier un produit ******** \n \n");
						    		System.out.print("Entrer la reference du produit : ");
						    		reference = sc.next();
						    		
						    		if(produits.chercherProduit(reference)==null) {
						    			System.out.print("\nCe produit n'exite pas!\n");
						    			break;
						    		}
						    		System.out.print("Entrer le nom du produit : ");
						    		nom_produits_tmp= sc.next();
						    		System.out.print("Entrer la discription du produit : ");
						    		description_produits_tmp = sc.next();
						    		System.out.print("Entrer le prix du produit : ");
						    		prix=sc.nextDouble();
						    		System.out.print("Entrer le prix du produit : ");
						    		System.out.print("Entrer le prix des caracteristique : ");
						    		caracteristique=sc.next();
						    		System.out.println("Definir le type:"
							        		+"\n1- Mobile"
							        		+"\n2- Electronique"
							        		+"\n3- Electromenager"
							        		+"\n4- Informatiques"
							        		+"\n5- Kits_Solaires"
							        		+"\nVeuillez sasir votre choix:  "
							        		);
						    		
						    		type = choisir_type(sc.nextInt());	
						    		produits.modifier(reference,nom_produits_tmp,prix,description_produits_tmp,caracteristique,type);
							    break;
							    
						    	case 5:
						    		System.out.print("\n \n ******* affichage de la liste des produits par type ******** \n \n");
						    		System.out.println("Definir le type:"
							        		+"\n1- Mobile"
							        		+"\n2- Electronique"
							        		+"\n3- Electromenager"
							        		+"\n4- Informatiques"
							        		+"\n5- Kits_Solaires"
							        		+"\nVeuillez sasir votre choix:  "
							        		);
						    		
						    		produits.afficher_type(choisir_type(sc.nextInt()));
							    break;
							    
						    	case 6:
						    		System.out.print("\n \n ******* Quitter ******** \n \n");
							    break;
							    
						    }
						    				
				   break; 
//*******************************************FIN GESTION DES PRODUITS****************************************************
				  
				   
				   
//*******************************************GESTION DES CLIENTS*********************************************
				   
				   case 2: //DEBUT GESTION DES CLIENTS
					   
					   	System.out.println("Bienvenu dans la gestion des clients");
					   	choix=8;
				       while (choix > 7) {
							System.out.println(""
							          +"\n1: Creer une liste de clients."
							          +"\n2: Ajouter client."
							          +"\n3: Supprimer client."
							          +"\n4: Modifier client."
							          +"\n5: Afficher la liste Client."
							          +"\n6: Afficher letat de fidelistation des clients."
							          +"\n7: Quitter."
							          +"\nVeuillez sasir votre choix:\t");
							choix = sc.nextInt();							
				       
			    		
					    	switch(choix){ 
						    	
							    case 1: 
							    		System.out.println("\n**Creation dune liste de clients**");
							    		listeClients= new GestionClients();
						        break;
						        
						        case 2:
						        		
								        Client cl=new Client();
								        System.out.println("Veuillez saisir le nom :\t");
								        cl.setNom(sc.next());
								        System.out.println("Veillez saisir le prenom:\t");
								        cl.setPrenom(sc.next());
								        System.out.println("Veillez saisir ladresse:\t");
								        cl.setAdresse(sc.next().toUpperCase());
								        System.out.println("Definir votre mot de passe:\tPS: Retenez le s'il vous pla�t!!");
								        cl.setMotdepasse(sc.next());
								        listeClients.ajouterClient(cl);
						        break;
						        
						        case 3: 
						        		System.out.println("Suppression dun client\t");
						        		listeClients.supprimerClient(sc.nextInt());
						        break;
						       
						        case 4: 
						        		System.out.println("Entrer le numero du client e modifier, Son nom, Son prenom, ladresse et le mot de passe");
						        		listeClients.modifierClient(sc.nextInt(), sc.next(),sc.next() ,sc.next(),sc.next());
						        break;
						        
						        case 5: 
						        		System.out.println("Affichage de la liste client\t");
						        		listeClients.afficherClients();
						        break;
						        
						        case 6: 
						        	System.out.println("Affichage detat de fidelistation des clients:");					       
						        break;
						        
						        case 7: 
						        	System.out.println("Vous avez quitter le programme\t");
						        	choix=7;
						        break;
						       
						        default: 
						        	System.out.println("Veillez saisir un choix du menu:\t");
						        break;
						        
						    }
				       }
				        break;	
			
//*******************************************FIN GESTION DES CLIENTS****************************************************				        
				      
				        
				        
//*******************************************DEBUT GESTION DES COMMANDES************************************************
				        case 3: 
				        	System.out.println("Bienvenu dans la gestion des commandes");
				        	choix=12;
						     while(choix > 11) {   
								System.out.println(""
								          +"\n1: Creer une liste de commandes."
								          +"\n2: Ajouter une commande."
								          +"\n3: Supprimer une commande."
								          +"\n4: Modifier une commande."
								          +"\n5: Afficher la liste des commandes satisfaites."
								          +"\n6: Afficher la liste des commandes en instance(reservees)."
								          +"\n7: Afficher le produit le plus commercialise sur une periode donnee."
								          +"\n8: Afficher le produit le moins commercialise sur une periode donnee."
								          +"\n9: Achats dun produit donnee sur une periode donnee."
								          +"\n10: Achats dun produit donnee sur une periode donnee, par ville."
								          +"\n11: Quitter."
								          +"\nVeuillez sasir votre choix:\t");
								choix = sc.nextInt();

								switch(choix) {
								
								//CREATION DE LA LISTE DES COMMANDES
									case 1:     System.out.println("\n**Cr�ation d'une liste de commandes**");
												listeCommandes=new GestionCommandes();
									break;
						        
						        //AJOUT D'UNE COMMANDE 
						            case 2: 
						            	
						            	//Ajout d'une Commande
						            	listeCommandes.ajouterCommande(new Commande(),listeClients);
						            	//s.afficherStock();
						            break;
						        
						        //SUPPRESSION D'UNE COMMANDE
						           case 3: 
						        	   
						        	   System.out.println("Entrer le numero de la commande\t");
						               listeCommandes.supprimerCommande(sc.nextInt());
						           break;
						        
						        //MODIFICATION D'UNE COMMANDE 
						           case 4: 
						        	   
						        	   System.out.println("Entrer le numero de la commande, la liste des produits et la ville et le numero du client\t");
						        	   produits.ajouterProduit(new Produit());
						        	   listeCommandes.modifierCommande(sc.nextInt(), produits, sc.next(),sc.nextInt());
						        	   
						           break;
						        
						        //AFFICHAGE
						           case 5: 
						        	   System.out.println("Affichage de la liste des commandes\t");
						               listeCommandes.afficherCom();
						           break;
						        
						           case 6: System.out.println("Afficher la liste des commandes en instance(reservees):");
						       
						           break;
						          
						           case 7: 
						        	   System.out.println("Afficher le produit le plus commercialise sur une periode donnee");
						        	   try {
						   	            SimpleDateFormat dateFormat = new
						   	                SimpleDateFormat ("yyyy-MM-dd");
						   	            System.out.println("Entrer la 1ere date: yyyy-MM-dd");
						   	            Date date1 = dateFormat.parse(sc.next());
						   	            System.out.println("Entrer la 2eme date: yyyy-MM-dd");
						   	            Date date2 = dateFormat.parse(sc.next());
						   	            listeCommandes.afficherProduitsPlusCommercialise(date1, date2, listeCommandes);
						   	            } 
						   	         catch (ParseException ex) {
						   	        }
						               
						           break;
						           
						           case 8:
						        	   System.out.println("Afficher le produit le moins commercialise sur une periode donnee");
						        	   try {
							   	            SimpleDateFormat dateFormat = new
							   	                SimpleDateFormat ("yyyy-MM-dd");
							   	            System.out.println("Entrer la 1ere date: yyyy-MM-dd");
							   	            Date date3 = dateFormat.parse(sc.next());
							   	            System.out.println("Entrer la 2eme date: yyyy-MM-dd");
							   	            Date date4 = dateFormat.parse(sc.next());
							   	            listeCommandes.afficherProduitsMoinsCommercialise(date3, date4, listeCommandes);
							   	            } 
							   	         catch (ParseException ex) {
							   	        }
						        	  
							       break;
								
						           case 9:
							    	   System.out.println("Achats d'un produit donnee sur une periode donnee");
							    	   try {
							   	            SimpleDateFormat dateFormat = new
							   	                SimpleDateFormat ("yyyy-MM-dd");
							   	            System.out.println("Entrer la 1ere date: yyyy-MM-dd");
							   	            Date date5 = dateFormat.parse(sc.next());
							   	            System.out.println("Entrer la 2eme date: yyyy-MM-dd");
							   	            Date date6 = dateFormat.parse(sc.next());
							   	         System.out.println("Definir le type:"
									        		+"\n1- Mobile"
									        		+"\n2- Electronique"
									        		+"\n3- Electromenager"
									        		+"\n4- Informatiques"
									        		+"\n5- Kits_Solaires"
									        		+"\nVeuillez sasir votre choix:  "
									        		);
								    		
								    		type = choisir_type(sc.nextInt());	
							   	            listeCommandes.afficherAchat(type, date5, date6,listeCommandes);
							   	            } 
							   	         catch (ParseException ex) {
							   	        }
							       break;
							       
							       case 10:
							    	   System.out.println("Achats dun produit donnee sur une periode donnee, par ville");
							    	   try {
							   	            SimpleDateFormat dateFormat = new
							   	                SimpleDateFormat ("yyyy-MM-dd");
							   	            System.out.println("Entrer la 1ere date: yyyy-MM-dd");
							   	            Date date3 = dateFormat.parse(sc.next());
							   	            System.out.println("Entrer la 2eme date: yyyy-MM-dd");
							   	            Date date4 = dateFormat.parse(sc.next());
							   	            System.out.println("Entrer la ville:");
							   	            String ville=sc.next().toUpperCase();
							   	         System.out.println("Definir le type:"
									        		+"\n1- Mobile"
									        		+"\n2- Electronique"
									        		+"\n3- Electromenager"
									        		+"\n4- Informatiques"
									        		+"\n5- Kits_Solaires"
									        		+"\nVeuillez sasir votre choix:  "
									        		);
								    		
								    		type = choisir_type(sc.nextInt());	
							   	            listeCommandes.afficherProduitparville(date3, date4,type,ville,listeCommandes);
							   	            } 
							   	         catch (ParseException ex) {
							   	        }
							       break;
							           
							       case 11:
							    	   System.out.println("Vous avez quitter la gestion des commandes");
							    	   choix=11;
							       break;
								}
						     }
				        break; 
				        
		                case 4 : //DEBUT QUITTER
						        	
						        	System.out.println("\n\n**********FIN DU PROGRAMME********** \n\n");
						            choix=0;
						   
						break;		//FIN QUITTER
						
			
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
		private static Produit Produit(String next, String next2, double nextDouble, String next3) {
			// TODO Auto-generated method stub
			return null;
		}
		
}
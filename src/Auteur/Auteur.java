package Auteur;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m-besnard
 */
public class Auteur {
        private int anneeDeces;
	private int anneeNaissance;
	private String nom;
	private String prenom;

    public Auteur(String nom, String prenom, int anneeDeces, int anneeNaissance) {
        this.anneeDeces = anneeDeces;
        this.anneeNaissance = anneeNaissance;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public int getAnneeDeces() {
        return anneeDeces;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    // public static Auteur getInstance(String nom,  String prenom, int anneeNaissance, int anneeDeces){
     //      if(this.nom != null && this.prenom != null && this.anneeNaissance != null && this.anneeDeces != null){     
	//	 System.out.println("erreur");
	//	 return null;
	// } else {
    // System.out.println("Auteur ok ! "); 
     //	return new Auteur(nom, prenom, anneeNaissance, anneeDeces); 
    // }
    //}

    @Override
    public String toString() {
        return "Auteur{" + "anneeDeces=" + anneeDeces + ", anneeNaissance=" + anneeNaissance + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

        
    
}

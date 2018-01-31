package Livre;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m-besnard
 */
public class Livre {
    private int anneeSortie; 
    private int Auteur;
    private String genre; 
    private String titre;

    public Livre(int anneeSortie, int Auteur, String genre, String titre) {
        this.anneeSortie = anneeSortie;
        this.Auteur = Auteur;
        this.genre = genre;
        this.titre = titre;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public int getAuteur() {
        return Auteur;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitre() {
        return titre;
    }
    
    // public static Livre getInstance(int anneeSortie, int Auteur, String genre,  String titre){
    //    if(this.genre != null && this.titre != null && this.anneeSortie != null && this.Auteur != null){     
	//System.out.println("erreur");
//	return null;
	//} else {
     //   System.out.println("Auteur ok ! "); 
    //	return new Livre(anneeSortie, Auteur, genre, titre); 
    // }
   // }

    @Override
    public String toString() {
        return "Livre{" + "anneeSortie=" + anneeSortie + ", Auteur=" + Auteur + ", genre=" + genre + ", titre=" + titre + '}';
    }
    
    
}

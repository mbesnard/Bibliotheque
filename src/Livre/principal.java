package Livre;


import Livre.Livre;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m-besnard
 */
public class principal {
    
    public static void main(String[] args) {
		 String genre="";
		 String tire="";
		 String anneeSortie="";
		 String Auteur="" ;
		
		 
		ArrayList<Livre> lesLivres = new ArrayList<Livre>();
		
		try {
			String csvFile = "/home/m-besnard/Documents/SLAM5/livres.txt"; ; 
			String delimiter = ",";
			String line = null;
			StringTokenizer strToken = null;
			BufferedReader bufferReader;
			int lineID = 0;
			int fieldID = 0;
			
			//OUVRIR LE FICHIER CSV
			bufferReader = new BufferedReader(new FileReader(csvFile));
			
			//PARCOURIR LES LIGNES DU FICHIER CSV
			while ((line = bufferReader.readLine()) != null) {
				lineID++;
				
				//PARCOURIR LES CHAMPS SÉPARÉS PAR DELIMITER
				strToken = new StringTokenizer(line, delimiter);
				
				while (strToken.hasMoreTokens()) {
					fieldID++;
					
					System.out.println("Ligne " + lineID + " / champs " + fieldID + " : " + strToken.nextToken());
					
	            }

	            for (int i=0; i<lesLivres.size(); i++) {
	                System.out.println(lesLivres.get(i));
	            }
	            
			}
		}
		catch (IOException ex) {
			System.out.println("erreur");
		}
	
			
		}
}

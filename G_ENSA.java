/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grh;

import java.util.Scanner;

public class G_ENSA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Enseignant Ens1 = new Enseignant(1 , 1000 , "ahmad" , "alami");
        Enseignant Ens2 = new Enseignant(2 , 2000 , "sali" , "mohanad");
        Enseignant Ens3 = new Enseignant(3 , 4000 , "zahrae" , "moutawakil");
        Administratif Adm1 = new Administratif (5 , 5000 , "ali" , "azami");
        Administratif Adm2 = new Administratif (6 , 6000 , "latifa" , "wadid");
        Etudiant Etd1 = new Etudiant(8 , 8000 , "aziz" , "wahbi" , "bac" , 17);
        Etudiant Etd2 = new Etudiant(9 , 9000 , "mouhsine" , "anwari" , "1bac" , 19);
        
        Enseignant.Afficher_grp();
        Enseignant.AjouterGroupe();
        Enseignant.calculer_salaire();
        Etudiant.Ajouter_etudiant();
        Etudiant.AfficherEtudiants();
        
        
        
        


        
        
        
        
        
        
        
        
        
        
    }
   
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grh;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mounia
 */
public class RessourcesHumaines {
   String nomUniv ;
   int nbrEnseignant ;
   private  ArrayList<Enseignant> GRH;

    public RessourcesHumaines(String nomUniv, int nbrEnseignat) {
        this.nomUniv = nomUniv;
        this.nbrEnseignant = nbrEnseignat;
        this.GRH = new ArrayList<>();
    }

    public String getNomUniv() {
        return nomUniv;
    }

    public int getNbrEnseignat() {
        return nbrEnseignant;
    }

    public List<Enseignant> getGRH() {
        return GRH;
    }

    public void setNomUniv(String nomUniv) {
        this.nomUniv = nomUniv;
    }

    public void setNbrEnseignat(int nbrEnseignat) {
        this.nbrEnseignant = nbrEnseignat;
    }

    public void setGRH(ArrayList<Enseignant> GRH) {
        this.GRH = GRH;
    }

    
    public void AfficherEnseignants(){
      System.out.println("la liste des Enseignant : ");
      for(Enseignant e : GRH ){
          e.Afficher();
          System.out.println("--");
      }
    }
    
    public void Rechercher_Ens(int code ){
        for (Enseignant e : GRH )
            if(e.code == e.getCode()){
               return GRH.indexOf(e) ;  
        }else{
        return -1;   
          }
                   
   }
   

    
    
    
    
    
    
}
    
    
    


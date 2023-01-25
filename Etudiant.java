/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grh;

/**
 *
 * @author mounia
 */

   abstract class Etudiant extends Personnel{
    public String niveau ;
    public int moyenneAnnuel ;

    protected Etudiant(int code, int salaire, String nom, String prenom) {
        super(code, salaire, nom, prenom);
    }

    protected String getNiveau() {
        return niveau;
    }

    protected int getMoyenneAnnuel() {
        return moyenneAnnuel;
    }

    protected int getCode() {
        return code;
    }

    protected int getSalaire() {
        return salaire;
    }

    protected String getNom() {
        return nom;
    }

    protected String getPrenom() {
        return prenom;
    }

    protected void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    protected void setMoyenneAnnuel(int moyenneAnnuel) {
        this.moyenneAnnuel = moyenneAnnuel;
    }

    protected void setCode(int code) {
        this.code = code;
    }

    protected void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    protected void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    abstract void Afficher();
    


 
    
    
  
    
    
    
    
    
    
    
    
    
    
}

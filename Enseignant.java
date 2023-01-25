
package grh;

import java.util.HashMap;
import java.util.Map;
import static jdk.nashorn.internal.objects.NativeArray.map;
import static jdk.nashorn.internal.objects.NativeDebug.map;


public class Enseignant extends Personnel{ 
    
    int primesDeplac ;
    int sommeHeures ;
    String grade ;
    int volumeHoraire ;
    Map<String , Integer> groupeEnseignant = new HashMap(); 

    public Enseignant(int code, int salaire, String nom, String prenom) {
        super(code, salaire, nom, prenom);
        this.primesDeplac = primesDeplac ;
        this.sommeHeures = sommeHeures;
        this.grade = grade;
        this.volumeHoraire = volumeHoraire;
        this.groupeEnseignant = groupeEnseignant;      
    }

    public int getPrimesDeplac() {
        return primesDeplac;
    }

    public int getSommeHeures() {
        return sommeHeures;
    }

    public String getGrade() {
        return grade;
    }

    public int getVolumeHoraire() {
        return volumeHoraire;
    }

    public Map<String, Integer> getGroupeEnseignant() {
        return groupeEnseignant;
    }
    
    public void setPrimesDeplac(int primesDeplac) {
        this.primesDeplac = primesDeplac;
    }

    public void setSommeHeures(int sommeHeures) {
        this.sommeHeures = sommeHeures;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setVolumeHoraire(int volumeHoraire) {
        this.volumeHoraire = volumeHoraire;
    }

    public void setGroupeEnseignant(Map<String, Integer> groupeEnseignant) {
        this.groupeEnseignant = groupeEnseignant;
    }

    void Afficher(){
        System.out.println("les primes de deplacment est" + primesDeplac);
        System.out.println("le grade est" + grade );
        System.out.println("les sommes des heures est" + sommeHeures);
        System.out.println("le volume des horaire est" + volumeHoraire );
               
    }
    
    
    public void AjouterGroupe( Groupe g){
        groupeEnseignant.add(g);
    }
    
   
    
    public void Afficher_grp(){
             System.out.println("la liste des groupes : ");
             for (Map.Entry<String, Integer> entry : groupeEnseignant.entrySet()) {
	        System.out.println(entry.getKey() + " = " + entry.getValue()); 
	    }
	}
 
    public double calculer_Salaire(int salaire) {
             int nbHeuresTotal = getSommeHeures();
              return (nbHeuresTotal *  getSalaire()) + primesDeplac;
    }
 

    
    
    
    
    
    

      
    
    
   
}

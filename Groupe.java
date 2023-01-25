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
public class Groupe extends Etudiant{
    
    private ArrayList<Etudiant> students;
    public Groupe(int code, int salaire, String nom, String prenom) {
        super(code, salaire, nom, prenom);
        
        this.students = new  ArrayList<Etudiant>();
    }

    public List<Etudiant> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Etudiant> students) {
        this.students = students;
    }

    
    public void Ajouter_etudiant(Etudiant e){
       students.add(e);
    }

    @Override
    void Afficher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
             
    public void AfficherEtudiants(){
      System.out.println("la liste des etudiants : ");
      for(Etudiant E : students ){
          E.Afficher();
          System.out.println("--");
      }
    }
    
    
    
    
    
}

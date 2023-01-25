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
public class Directeur extends Personnel{
    int primesDeplacementDirect ;

    public Directeur(int code, int salaire, String nom, String prenom) {
        super(code, salaire, nom, prenom);
        this.primesDeplacementDirect = primesDeplacementDirect;
    }

    public void setPrimesDeplacementDirect(int primesDeplacementDirect) {
        this.primesDeplacementDirect = primesDeplacementDirect;
    }

    public int getPrimesDeplacementDirect() {
        return primesDeplacementDirect;
    }
    

    @Override
    void Afficher() {
         System.out.println("le directeur : ");
    System.out.println("le nom : " + nom + "prenom" + prenom + "salaire" + salaire + "code" + code + "primesDeplacementDirect" + primesDeplacementDirect) ;
    }
    
     public void calculer_Salaire(int salaire){};
    
}

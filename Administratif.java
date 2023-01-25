
package grh;


public class Administratif extends Personnel{
    
    public Administratif(int code, int salaire, String nom, String prenom) {
        super(code, salaire, nom, prenom);
    }

    public void  Afficher() {
    System.out.println("l'administratif : ");
    System.out.println("le nom : " + nom + "prenom" + prenom + "salaire" + salaire + "code" + code) ;
    }
    
}


package grh;

abstract class Personnel {
    protected int code , salaire ;
    String nom , prenom ;

    protected Personnel(int code, int salaire, String nom, String prenom) {
        this.code = code;
        this.salaire = salaire;
        this.nom = nom;
        this.prenom = prenom;
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
    
    abstract void Afficher();
    
    public void Calculer_Salaire(int salaire){}
    
    
    
    
    
}

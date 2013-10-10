package org.sondage.modele;

public class User {

    private String username ,password, nom, prenom, courriel, ville;

    public User(String username, String password, String nom, String prenom, String courriel, String ville) {
            this.username = username;
            this.password = password;
            this.nom = nom;
            this.prenom = prenom;
            this.courriel = courriel;
            this.ville = ville;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
        
    @Override
    public String toString() {
            // TODO Auto-generated method stub
            return ""+this.username+","+this.password+","+this.nom+","+this.prenom+","+this.courriel+","+this.ville;
    }
	
}

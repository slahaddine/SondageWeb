/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sondage.modele;

/**
 *
 * @author Usager
 */
public class Sondage {
    private String nomSondage;
    private int idSondage;
    
    

    public Sondage(String _nomSondage) {
        this.setNomSondage(_nomSondage); 
    }
    public String getNomSondage(){
        return nomSondage; 
    }
    public void setNomSondage(String _nomSondage){
        nomSondage=_nomSondage; 
    }

    public int getIdSondage() {
        return idSondage;
    }

    public void setIdSondage(int idSondage) {
        this.idSondage = idSondage;
    }
    
}

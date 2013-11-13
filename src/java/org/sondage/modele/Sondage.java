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
    private String nomSondage, description, otherName;
    private int idSondage;
    public Sondage(String _nomSondage, String _description, String _otherName) {
        this.setNomSondage(_nomSondage); 
        this.setDescription(_description);
        this.setOtherName(_otherName);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
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

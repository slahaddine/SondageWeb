/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sondage.modele;

/**
 *
 * @author Usager
 */
public class Reponse {
    String nomReponse, texteReponse;
    boolean choisie;
    int idQuestion, idReponse; 

    public Reponse(String nomReponse, String texteReponse, int idQuestion) {
        this.nomReponse = nomReponse;
        this.texteReponse = texteReponse;
        this.choisie = false;
        this.idQuestion = idQuestion;
    }
    public String getNomReponse() {
        return nomReponse;
    }

    public void setNomReponse(String nomReponse) {
        this.nomReponse = nomReponse;
    }

    public String getTexteReponse() {
        return texteReponse;
    }

    public int getIdReponse() {
        return idReponse;
    }

    public void setIdReponse(int idReponse) {
        this.idReponse = idReponse;
    }

    public void setTexteReponse(String texteReponse) {
        this.texteReponse = texteReponse;
    }

    public boolean isChoisie() {
        return choisie;
    }

    public void setChoisie(boolean choisie) {
        this.choisie = choisie;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }
    
    
}

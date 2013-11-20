/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sondage.modele;

/**
 *
 * @author Usager
 */
public class Choix {
    String nomChoix, textChoix;
    int idChoix, idQuestionnaire; 

    public Choix(String nomQuestion, String texteQuestion, int idQuestionnaire) {
        this.nomChoix = nomQuestion;
        this.textChoix = texteQuestion;
        this.idQuestionnaire = idQuestionnaire;
    }

    public String getNomChoix() {
        return nomChoix;
    }

    public void setNomChoix(String nomChoix) {
        this.nomChoix = nomChoix;
    }

    public String getTextChoix() {
        return textChoix;
    }

    public void setTextChoix(String textChoix) {
        this.textChoix = textChoix;
    }

    public int getIdChoix() {
        return idChoix;
    }

    public void setIdChoix(int idChoix) {
        this.idChoix = idChoix;
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(int idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

 
    
    @Override
    public String toString() {
        return "Question{" + "nomQuestion=" + nomChoix + ", texteQuestion=" + textChoix + ", idQuestion=" + idChoix + '}';
    }
    
}

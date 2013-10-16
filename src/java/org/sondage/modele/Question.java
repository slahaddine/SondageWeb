/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sondage.modele;

/**
 *
 * @author Usager
 */
public class Question {
    String nomQuestion, texteQuestion;
    int idQuestion, idQuestionnaire; 

    public Question(String nomQuestion, String texteQuestion, int idQuestionnaire) {
        this.nomQuestion = nomQuestion;
        this.texteQuestion = texteQuestion;
        this.idQuestionnaire = idQuestionnaire;
    }

    public String getNomQuestion() {
        return nomQuestion;
    }

    public void setNomQuestion(String nomQuestion) {
        this.nomQuestion = nomQuestion;
    }

    public String getTexteQuestion() {
        return texteQuestion;
    }

    public void setTexteQuestion(String texteQuestion) {
        this.texteQuestion = texteQuestion;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(int idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }
    
    @Override
    public String toString() {
        return "Question{" + "nomQuestion=" + nomQuestion + ", texteQuestion=" + texteQuestion + ", idQuestion=" + idQuestion + '}';
    }
    
}

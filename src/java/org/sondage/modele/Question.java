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
    int idQuestion; 

    public Question(String nomQuestion, String texteQuestion) {
        this.nomQuestion = nomQuestion;
        this.texteQuestion = texteQuestion;
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

    @Override
    public String toString() {
        return "Question{" + "nomQuestion=" + nomQuestion + ", texteQuestion=" + texteQuestion + ", idQuestion=" + idQuestion + '}';
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sondage.modele;

/**
 *
 * @author Usager
 */
public class Questionnaire {
    private Question[] questions; 
    private int nbQuestions, currentQuestion, idQuestionnaire; 
    private String nomSondage; 
    public Questionnaire(int nbQuestion, String _nomSondage) {
        questions = new Question[nbQuestion]; 
        currentQuestion = 0; 
        nomSondage = _nomSondage; 
    }
    public Question getQuestion(int i){
        if((i >= 0) && (i < nbQuestions))
            return questions[i];
        else 
            return null; 
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(int idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }
    
    public boolean setQuestion(Question questionToAdd){
        if((currentQuestion >= 0) && (currentQuestion < nbQuestions)){
            questions[currentQuestion] = questionToAdd; 
            currentQuestion++; 
            return true; 
        }
        return false; 
    } 

    public int getNbQuestions() {
        return nbQuestions;
    }

    public void setNbQuestions(int nbQuestions) {
        this.nbQuestions = nbQuestions;
    }

    public String getNomSondage() {
        return nomSondage;
    }

    public void setNomSondage(String nomSondage) {
        this.nomSondage = nomSondage;
    }
    
}

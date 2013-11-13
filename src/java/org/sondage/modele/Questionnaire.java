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
    private String theQuestion; 
    public Questionnaire(int nbQuestion, String _nomSondage, String _theQuestion) {
        questions = new Question[nbQuestion]; 
        currentQuestion = 0; 
        nomSondage = _nomSondage; 
        this.nbQuestions = nbQuestion; 
        theQuestion = _theQuestion; 
    }

    public String getTheQuestion() {
        return theQuestion;
    }

    public void setTheQuestion(String theQuestion) {
        this.theQuestion = theQuestion;
    }
    
    public Question getQuestion(int i){
        if((i >= 0) && (i < nbQuestions))
            return questions[i];
        else 
            return null; 
    }
    public boolean addQuestion(Question _question){
        if (currentQuestion <= nbQuestions){
            questions[currentQuestion] = _question;
            currentQuestion++;
            return true; 
        }else 
            return false;
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

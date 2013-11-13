/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.sondage.config;

/**
 *
 * @author Yanis
 */
public class Config {
    private static int idQuestions = 0;
    private static int idQuestionnaire = 0; 
    private static int idSondage = 0; 
    
    public static int getIdForQuestion(){ 
        idQuestions++; 
        return idQuestions;
    }
    public static int getIdForQuestionnaire(){
        idQuestionnaire++; 
        return idQuestionnaire; 
    }
    public static int getIdForSondage(){
        idSondage++; 
        return idSondage; 
    }
}

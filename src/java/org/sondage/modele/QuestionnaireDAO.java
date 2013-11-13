package org.sondage.modele;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class QuestionnaireDAO extends DAO<Questionnaire>{

    public QuestionnaireDAO(Connection cnx) {
        super(cnx);
    }
    
    @Override
    public boolean create(Questionnaire x) {
    String req = "INSERT INTO questionnaire (`nbQuestions` , `nomSondage`) "+
			     "VALUES ('"+x.getNbQuestions()+"','"+x.getNomSondage()+"')";

		//System.out.println("REQUETE "+req);

		Statement stm = null;
		try 
		{
			stm = cnx.createStatement(); 
			int n= stm.executeUpdate(req);
			if (n>0)
			{
				stm.close();
				return true;
			}
		}
		catch (SQLException exp)
		{
		}
		finally
		{
			if (stm!=null)
			try {
				stm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}

		return false;
    }


   @Override
	public boolean delete(Questionnaire x) {
		// TODO Auto-generated method stub
		Statement stm = null;
		try 
		{
			stm = cnx.createStatement(); 
			int n= stm.executeUpdate("DELETE FROM questionnaire WHERE idQuestionnaire='"+x.getIdQuestionnaire()+"'");
			if (n>0)
			{
				stm.close();
				return true;
			}
		}
		catch (SQLException exp)
		{
		}
		finally
		{
			if (stm!=null)
			try {
				stm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		return false;
	}

	@Override
	public Questionnaire read(String id) {
		// TODO Auto-generated method stub
                Statement stm = null;
                ResultSet r = null;
		try 
		{
			stm = cnx.createStatement(); 
			r = stm.executeQuery("SELECT * FROM questionnaire WHERE nomQuestionnaire = '"+id+"'");
			if (r.next())
			{
				Questionnaire questionnaire = new Questionnaire(Integer.parseInt(r.getString("nbQuestions")), r.getString("nomSondage"), "");// A faire      
				questionnaire.setIdQuestionnaire(Integer.parseInt(r.getString("idQuestionnaire")));
                                r.close();
				stm.close();
				return questionnaire;
			}
		}
		catch (SQLException exp)
		{
		}
		finally
		{
			if (stm!=null)
			try {
                                r.close();
				stm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		return null;
	}

	@Override
	public boolean update(Questionnaire x) {
		// TODO Auto-generated method stub
		Statement stm = null;
		try 
		{
			String req = "UPDATE questionnaire SET idQuestionnaire='"+x.getIdQuestionnaire()+"'"+
                                                                "nbQuestions='"+ x.getNbQuestions() +"'"+
                                                                  "nomSondage"+ x.getNomSondage();
			//System.out.println("REQUETE "+req);
			stm = cnx.createStatement(); 
			int n= stm.executeUpdate(req);
			if (n>0)
			{
				stm.close();
				return true;
			}
		}
		catch (SQLException exp)
		{
		}
		finally
		{
			if (stm!=null)
			try {
				stm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		return false;
	}
	@Override
	public List<Questionnaire> findAll() {
		// TODO Auto-generated method stub
		List<Questionnaire> liste = new LinkedList<Questionnaire>();
		try 
		{
			Statement stm = cnx.createStatement(); 
			ResultSet r = stm.executeQuery("SELECT * FROM questionnaire");
			while (r.next())
			{
				Questionnaire u = new Questionnaire(Integer.parseInt(r.getString("nbQuestions")),
						r.getString("nomSondage"), "");
                                u.setIdQuestionnaire(Integer.parseInt(r.getString("idQuestionnaire")));
				liste.add(u);
			}
			r.close();
			stm.close();
		}
		catch (SQLException exp)
		{
		}
		return liste;
	}

    @Override
    public Questionnaire read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
package org.sondage.modele;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class QuestionDAO extends DAO<Choix> {

	public QuestionDAO(Connection c)
	{
		super(c);
	}
        
	@Override
	public boolean create(Choix x) {
		// TODO Auto-generated method stub
	
		String req = "INSERT INTO question (`NOMQUESTION` , `TEXTEQUESTION` , `IDQUESTIONNAIRE`) "+
			     "VALUES ('";//+x.getNomQuestion()+"','"+x.getTexteQuestion()+"','"+x.getIdQuestionnaire()+"')";

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
	public boolean delete(Choix x) {
		// TODO Auto-generated method stub
		Statement stm = null;
		try 
		{
			stm = cnx.createStatement(); 
			int n= stm.executeUpdate("DELETE FROM question WHERE idquestion='");//+x.getIdQuestion()+"'");
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
	public Choix read(String id) {
		// TODO Auto-generated method stub
                Statement stm = null;
                ResultSet r = null;
		try 
		{
			stm = cnx.createStatement(); 
			r = stm.executeQuery("SELECT * FROM question WHERE nomquestion = '"+id+"'");
			if (r.next())
			{
				/*Choix q = new Choix(r.getString("nomquestion"),
						r.getString("textequestion"),
						Integer.parseInt(r.getString("idquestionnaire")));
				q.setIdQuestion(Integer.parseInt(r.getString("idquestion")));
                                r.close();
				stm.close();
				return q;*/
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
	public boolean update(Choix x) {
		// TODO Auto-generated method stub
		Statement stm = null;
		try 
		{
			String req = "UPDATE questionnaire SET NOMQUESTION = ";
                        /*+x.getNomQuestion()+"',"+
                                                        "TEXTEQUESTION = '"+x.getTexteQuestion()+"'," +
                                                        "IDQUESTIONNAIRE = '"+x.getIdQuestionnaire()+"'," +
							" WHERE IDQUESTION = '"+x.getIdQuestion()+"'";*/
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
	public List<Choix> findAll() {
		// TODO Auto-generated method stub
		List<Choix> liste = new LinkedList<Choix>();
		try 
		{
			Statement stm = cnx.createStatement(); 
			ResultSet r = stm.executeQuery("SELECT * FROM question");
			while (r.next())
			{
				/*Choix q = new Choix(r.getString("nomquestion"),
						r.getString("textequestion"),
						Integer.parseInt(r.getString("idquestionnaire")));
                                q.setIdQuestion(Integer.parseInt(r.getString("idquestion")));
				liste.add(q);*/
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
    public Choix read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

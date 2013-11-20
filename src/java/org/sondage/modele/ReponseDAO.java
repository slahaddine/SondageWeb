  /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sondage.modele;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author yanis
 */
public class ReponseDAO extends DAO<Reponse>{

    public ReponseDAO(Connection cnx) {
        super(cnx);
    }
    
    @Override
    public boolean create(Reponse x) {
    String req = "INSERT INTO reponse (`nomReponse` , `texteReponse`, `reponseChoisie`, `idQuestion`) "+
			     "VALUES ('"+x.getNomReponse()+"','"+x.getTexteReponse()+"','"+x.isChoisie()+"','"+x.getIdQuestion()+"')";

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
    public boolean delete(Reponse x) {
		// TODO Auto-generated method stub
		Statement stm = null;
		try 
		{
			stm = cnx.createStatement(); 
			int n= stm.executeUpdate("DELETE FROM reponse WHERE idReponse='"+x.getIdReponse()+"'");
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
	public Reponse read(String id) {
		// TODO Auto-generated method stub
                Statement stm = null;
                ResultSet r = null;
		try 
		{
			stm = cnx.createStatement(); 
			r = stm.executeQuery("SELECT * FROM reponse WHERE idQuestionnaire = '"+id+"'");
			if (r.next())
			{
				Reponse reponse = new Reponse(r.getString("nomReponse"),r.getString("texteReponse"),Integer.parseInt(r.getString("idQuestion")));
				reponse.setIdReponse(Integer.parseInt(r.getString("idReponse")));
                                r.close();
				stm.close();
				return reponse;
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
	public boolean update(Reponse x) {
		// TODO Auto-generated method stub
		Statement stm = null;
		try 
		{
			String req = "UPDATE reponse SET idReponse='"+x.getIdReponse()+"', "+
                                                                "nomReponse='"+ x.getNomReponse()+"',"+
                                                                  "texteReponse='"+ x.getTexteReponse()+"',"
                                                                + "reponseChoisie='"+ x.isChoisie() +"',"
                                                                + "idQuestion='"+x.getIdQuestion()+"'";
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
	public List<Reponse> findAll() {
		// TODO Auto-generated method stub
		List<Reponse> liste = new LinkedList<Reponse>();
		try 
		{
			Statement stm = cnx.createStatement(); 
			ResultSet r = stm.executeQuery("SELECT * FROM questionnaire");
			while (r.next())
			{
				Reponse reponse = new Reponse(r.getString("nomReponse"),r.getString("textReponse"), Integer.parseInt(r.getString("idQuestion")));
                                reponse.setIdReponse(Integer.parseInt(r.getString("idQuestionnaire")));
				liste.add(reponse);
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
    public Reponse read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

 package org.sondage.modele;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class UserDAO extends DAO<User> {

	public UserDAO(Connection c)
	{
		super(c);
	}
        
	@Override
	public boolean create(User x) {
		// TODO Auto-generated method stub
	
		String req = "INSERT INTO user (`USERNAME` , `PASSWORD` , `NOM` , `PRENOM` , `COURRIEL` , `VILLE`) "+
			     "VALUES ('"+x.getUsername()+"','"+x.getPassword()+"','"+x.getNom()+"','"+x.getPrenom()+"','"+x.getCourriel()+"','"+x.getVille()+"')";

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

        public boolean connexion(String username, String password){
            Statement stm = null;
            ResultSet result = null;
            try{
                stm = cnx.createStatement();
                result = stm.executeQuery("SELECT * FROM user WHERE username='"+username+"' AND password='"+password+"'");
                if(result.next()){
                    return true;
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return false;
        }
        
	@Override
	public boolean delete(User x) {
		// TODO Auto-generated method stub
		Statement stm = null;
		try 
		{
			stm = cnx.createStatement(); 
			int n= stm.executeUpdate("DELETE FROM user WHERE username='"+x.getUsername()+"'");
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
	public User read(String id) {
		// TODO Auto-generated method stub
                Statement stm = null;
                ResultSet r = null;
		try 
		{
			stm = cnx.createStatement(); 
			r = stm.executeQuery("SELECT * FROM user WHERE username = '"+id+"'");
			if (r.next())
			{
				User u = new User(r.getString("username"),
						r.getString("password"),
						r.getString("nom"),
						r.getString("prenom"),
                                                r.getString("courriel"),
                                                r.getString("ville"));
				r.close();
				stm.close();
				return u;
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
	public boolean update(User x) {
		// TODO Auto-generated method stub
		Statement stm = null;
		try 
		{
			String req = "UPDATE user SET USERNAME = '"+x.getUsername()+"',"+
                                                        "PASSWORD = '"+x.getPassword()+"'," +
                                                        "NOM = '"+x.getNom()+"'," +
                                                        "PRENOM = '"+x.getPrenom()+"'," +
							"COURRIEL = '"+x.getCourriel()+"'," +
							"VILLE = '"+x.getVille()+"'" +
							" WHERE USERNAME = '"+x.getUsername()+"'";
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
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> liste = new LinkedList<User>();
		try 
		{
			Statement stm = cnx.createStatement(); 
			ResultSet r = stm.executeQuery("SELECT * FROM user");
			while (r.next())
			{
				User u = new User(r.getString("username"),
						r.getString("password"),
						r.getString("nom"),
						r.getString("prenom"),
                                                r.getString("courriel"),
                                                r.getString("ville"));
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
    public User read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

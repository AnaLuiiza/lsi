package bd2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProjetoJDBC {

	private static Connection con = null;

	public static Connection conectar() throws ClassNotFoundException {
		String dbURL = "jdbc:postgresql://localhost:5432/bd2";
		String username = "postgres";
		String password = "";

		try {

			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Connected");
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return con;

	}
	

	public int Inserir(String sql) {
		try {  
			
	        Statement stm = (Statement) con.createStatement();  
	        int res = stm.executeUpdate(sql); 
	        con.close();
	        return res;
	    } catch (Exception e) { 
	    	System.out.println(e.getMessage());
	    	return 0;
	    }
	    }

	public ResultSet executaBusca(String sql) {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			con.close();
			return rs;
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		    return null;
		}
		
	}

	public ResultSet excluiPessoa(String sql) {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			con.close();
			return rs;
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		    return null;
		}
	}

	public void desconectar() {
		try {
			ProjetoJDBC.con.close();
		} catch (Exception e) {
			System.out.println("erro:" + e.getMessage());
		}
	}


}

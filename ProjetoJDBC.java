import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ProjetoJDBC 
{
	private static Connection con = null;

	public static Connection conectar() throws ClassNotFoundException {
		String dbURL = "jdbc:postgresql://localhost:5432/Escola";
		String username = "postgres";
		String password = "hennrick123";
	
		try {
	
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(dbURL, username, password);
	        System.out.println("Connected");
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return con;
	
	}
	
	
	public static void InserirAluno(String nome, String cpf, String email, int telefone, String data, int id_serie, String senha) {
	
		try{	
			// cria um preparedStatement
			PreparedStatement stmt = con.prepareStatement("insert into Alunos (nome,email,cpf,senha, dataNascimento, idSerie, telefone) values (?,?,?,?,?,?,?)");
			// preenche os valores
			stmt.setString(1, nome);
			stmt.setString(2, email);
			stmt.setString(3, cpf);
			stmt.setString(4, senha);
			stmt.setString(5, data);
			stmt.setLong(6, id_serie);
			stmt.setLong(7, telefone);
			// executa
			stmt.execute();
			stmt.close();
			System.out.println("Gravado!");
			con.close();
		} catch (SQLException e) {
			 e.printStackTrace();
		}
	
	    }
	
	public ResultSet executaBuscaAluno(String sql) {
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
	
	public ResultSet excluiAluno(String sql) {
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
	
	public static void InserirSerie(String turno, String turma,String nome) {
		
		try{	
			// cria um preparedStatement
			PreparedStatement stmt = con.prepareStatement("insert into Series (nome,turma,turno) values (?,?,?)");
			// preenche os valores
			stmt.setString(1, nome);
			stmt.setString(2, turma);
			stmt.setString(3, turno);
			
			// executa
			stmt.execute();
			stmt.close();
			System.out.println("Gravado!");
			con.close();
		} catch (SQLException e) {
			 e.printStackTrace();
		}
	
	    }
public static  ResultSet buscaIdSerie(String turno, String turma,String nome) {
		
		try{	
			// cria um preparedStatement
			PreparedStatement stmt = con.prepareStatement("SELECT idSerie FROM Series WHERE nome = ? and turma = ? and turno  = ?");
			// preenche os valores
			stmt.setString(1, nome);
			stmt.setString(2, turma);
			stmt.setString(3, turno);
			
			// executa
			ResultSet rs = stmt.executeQuery();
			stmt.close();
			System.out.println("sucesso");
			con.close();
			return rs;
		} catch (SQLException e) {
			 e.printStackTrace();
			 return null;	
		}

		
	    }
public static void InserirProfessor(String nome, String cpf, String email, int telefone, String data, String senha) {
	
	try{	
		// cria um preparedStatement
		PreparedStatement stmt = con.prepareStatement("insert into Professores (nome,cpf,email,telefone,dataNascimento,senha) values (?,?,?,?,?,?)");
		// preenche os valores
		stmt.setString(1, nome);
		stmt.setString(2, cpf);
		stmt.setString(3, email);
		stmt.setInt(4, telefone);
		stmt.setString(5, data);
		stmt.setString(6,senha);
		
		// executa
		stmt.execute();
		stmt.close();
		System.out.println("Gravado!");
		con.close();
	} catch (SQLException e) {
		 e.printStackTrace();
	}

    }
public static void InserirDisciplina(String nome, int id_serie, int id_professor) {
	
	try{	
		// cria um preparedStatement
		PreparedStatement stmt = con.prepareStatement("insert into Disciplinas (nome,idProfessor,idSerie) values (?,?,?)");
		// preenche os valores
		stmt.setString(1, nome);
		stmt.setInt(2, id_professor);
		stmt.setInt(3, id_serie);
		
		
		// executa
		stmt.execute();
		stmt.close();
		System.out.println("Gravado!");
		con.close();
	} catch (SQLException e) {
		 e.printStackTrace();
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
	
	
	

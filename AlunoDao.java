package bd2;

import java.sql.ResultSet;

public class AlunoDao {
	
public void inserir() throws ClassNotFoundException {
		
		ProjetoJDBC pessoa = new ProjetoJDBC();
		ProjetoJDBC.conectar();
		String sql = "INSERT into alunos (matricula)" 
		             + "values (34900)";
		int res = pessoa.Inserir(sql);
		
		if(res>0){
			System.out.println("deu certo");
		}else{
			System.out.println("algo deu errado");
		}

	    }

		public void testBusca() throws ClassNotFoundException{
	    	
		    ProjetoJDBC pessoa = new ProjetoJDBC();
			ProjetoJDBC.conectar();
			String sql = "Select(matricula)from alunos ";
			ResultSet rs = pessoa.executaBusca(sql);
			 try{
				 while(rs.next()){
					String matricula = rs.getString("matricula");
				    System.out.println("Matricula : "+ matricula);
				    System.out.println("------------------------------");
				 }
			 }
			catch(Exception e){
				e.printStackTrace();
			}
			 
			

		}

}

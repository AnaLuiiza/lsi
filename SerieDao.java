package bd2;

import java.sql.ResultSet;

public class SerieDao {

        public void inserir() throws ClassNotFoundException {
		
		ProjetoJDBC pessoa = new ProjetoJDBC();
		ProjetoJDBC.conectar();
		String sql = "INSERT into pessoag (nome,telefone)" 
		             + "values (null,34900)";
		int res = pessoa.Inserir(sql);
		
		if(res>0){
			System.out.println("deu certo");
		}else{
			System.out.println("algo deu errado");
		}

	    }

		public void TestBusca() throws ClassNotFoundException{
	    	
		    ProjetoJDBC pessoa = new ProjetoJDBC();
			ProjetoJDBC.conectar();
			String sql = "Select pessoas.nome, telefone.telefone from "
	                      +"pessoas inner join telefone on"
	                      +"(pessoas.id_p=telefone.id_t)";
			ResultSet rs = pessoa.executaBusca(sql);
			 try{
				 while(rs.next()){
					String nome = rs.getString("nome");
					String telefone = rs.getString("telefone");
				    System.out.println("Nome : "+ nome + "\nTelefone : "+ telefone);
				    System.out.println("------------------------------");
				 }
			 }
			catch(Exception e){
				e.printStackTrace();
			}
			 
			

		}
	}


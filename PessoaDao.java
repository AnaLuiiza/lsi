package bd2;

import java.sql.ResultSet;

public class PessoaDao {
	
	public void inserir() throws ClassNotFoundException {
	
	ProjetoJDBC pessoa = new ProjetoJDBC();
	ProjetoJDBC.conectar();
	String sql = "INSERT into pessoas (nome,telefone)" 
	             + "values (null,34900)";
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
		String sql = "Select * from pessoas";
		ResultSet rs = pessoa.executaBusca(sql);
		 
		 
		

	}
}

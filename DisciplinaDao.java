package bd2;

public class DisciplinaDao {
	
public void inserir() throws ClassNotFoundException {
		
		ProjetoJDBC pessoa = new ProjetoJDBC();
		ProjetoJDBC.conectar();
		String sql = "INSERT into disciplinas (nome,idDisciplina)" 
		             + "values (null,5)";
		int res = pessoa.Inserir(sql);
		
		if(res>0){
			System.out.println("deu certo");
		}else{
			System.out.println("algo deu errado");
		}
			 
			

		}

}

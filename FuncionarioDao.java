package bd2;

import java.sql.ResultSet;

public class FuncionarioDao {
	
	
		public void TestBusca() throws ClassNotFoundException{
	    	
		    ProjetoJDBC pessoa = new ProjetoJDBC();
			ProjetoJDBC.conectar();
			String sql = "Select * from funcionarios";
			ResultSet rs = pessoa.executaBusca(sql);
			 try{
				 while(rs.next()){
					String idfuncionario = rs.getString("nome");
				    System.out.println("IdFuncionario : "+ idfuncionario );
				    System.out.println("------------------------------");
				 }
			 }
			catch(Exception e){
				e.printStackTrace();
			}
			 
			

		}

}

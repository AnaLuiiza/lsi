import java.sql.Date;

public class Funcionario extends Pessoa
{	int idFuncionario;

	public Funcionario(String nome, String cpf, String email, String senha, int telefone, String data) {
	super(nome, cpf, email, senha, telefone, data);

}

	public int getIdFuncionario() {
	return idFuncionario;
	}
	
	public void setIdFuncionario() {
	this.idFuncionario = idFuncionario;
	}
public void inserirP() throws ClassNotFoundException {
		
		ProjetoJDBC conexao = new ProjetoJDBC();
		ProjetoJDBC.conectar();
		ProjetoJDBC.InserirProfessor(nome, cpf, email, telefone, data, senha);
	
	
}
}

package bd2;

import java.sql.Date;

public class Funcionario extends Pessoa
{	int idFuncionario;

	public int getIdFuncionario() {
	return idFuncionario;
}

public void setIdFuncionario(int idFuncionario) {
	this.idFuncionario = idFuncionario;
}

	public Funcionario(String nome, int id_Pessoa, int cpf, int telefone, Date data, String senha, String email) {
		super(nome, id_Pessoa, cpf, telefone, data, senha, email);
		// TODO Auto-generated constructor stub
	}
	
	

}

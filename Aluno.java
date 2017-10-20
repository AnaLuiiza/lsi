package bd2;

import java.sql.Date;

public class Aluno extends Pessoa {
	
	int id_serie;
	int matricula;
	
	public Aluno(String nome, int id_Pessoa, int cpf, int telefone, Date data, String senha, String email) {
		super(nome, id_Pessoa, cpf, telefone, data, senha, email);

	}

	public int getId_serie() {
		return id_serie;
	}

	public void setId_serie(int id_serie) {
		this.id_serie = id_serie;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void visualizarNotas() {
	}

}

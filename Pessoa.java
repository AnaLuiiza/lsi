package bd2;

import java.sql.Date;

public class Pessoa {

	int id_Pessoa;
	String nome;
	Date dataDeNascimento;
	int telefone;
	String senha;
	String email;
	
	public Pessoa(String nome,int id_Pessoa,int cpf, int telefone, Date data, String senha, String email){
		
		this.id_Pessoa = id_Pessoa;
        this.dataDeNascimento = data;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
	}

	public int getId_Pessoa() {
		return id_Pessoa;
	}

	public void setId_Pessoa(int id_Pessoa) {
		this.id_Pessoa = id_Pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

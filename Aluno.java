import java.sql.Date;
import java.sql.ResultSet;

public class Aluno extends Pessoa {
	
	int id_serie;
	int matricula;
	String serie;
	String turma;
	String turno;
	
	

	public Aluno(String nome, String cpf, String email, String senha, int telefone, String data,int id_serie, String serie, String turma, String turno) {
		super(nome, cpf, email, senha, telefone, data);
		this.turma = turma;
		this.turno = turno;
		this.id_serie = id_serie;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	public ResultSet getIdSerie () throws ClassNotFoundException
	
	{	ProjetoJDBC conexao = new ProjetoJDBC();
		ProjetoJDBC.conectar();
		return ProjetoJDBC.buscaIdSerie(nome, turma, turno);
			
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

	
	

	public int getId_serie() {
		return id_serie;
	}

	
	
	
public void inserir() throws ClassNotFoundException {
		
		ProjetoJDBC conexao = new ProjetoJDBC();
		ProjetoJDBC.conectar();
		ProjetoJDBC.InserirAluno(nome, cpf, email, telefone, data, id_serie, senha);
		
	}

	
	
	
	



}



public class Disciplina 
{	String nome;
	int id_serie;
	int id_disciplina;
	int id_professor;

public int getId_professor() {
		return id_professor;
	}
	public void setId_professor(int id_professor) {
		this.id_professor = id_professor;
	}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setId_serie(int id_serie) {
	this.id_serie = id_serie;
}
public int getId_serie() {
	return id_serie;
}

public int getId_disciplina() {
	return id_disciplina;
}
public void setId_disciplina(int id_disciplina) {
	this.id_disciplina = id_disciplina;
}
public void inserir() throws ClassNotFoundException {
	
	ProjetoJDBC conexao = new ProjetoJDBC();
	ProjetoJDBC.conectar();
	ProjetoJDBC.InserirDisciplina(nome,id_serie,id_professor);
}
}

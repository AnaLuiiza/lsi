
public class Serie
{
	String turno;
	int id_serie;
	String turma;
	String nome;
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public int getId_serie() {
		return id_serie;
	}
	public void setId_serie(int id_serie) {
		this.id_serie = id_serie;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
public void inserir() throws ClassNotFoundException {
		
		ProjetoJDBC conexao = new ProjetoJDBC();
		ProjetoJDBC.conectar();
		ProjetoJDBC.InserirSerie(nome,turma, turno);
		
		

	 
	
	
	}
}


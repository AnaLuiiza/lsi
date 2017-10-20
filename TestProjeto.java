package bd2;

import org.junit.Test;

public class TestProjeto {

	    @Test
	    public void testPessoa() throws ClassNotFoundException{
	    	
	    	PessoaDao pessoa = new PessoaDao();
			pessoa.inserir();
			pessoa.testBusca();

		}
	    @Test
	    public void testAluno() throws ClassNotFoundException{
	    	AlunoDao aluno = new AlunoDao();
	    	aluno.inserir();
	    	aluno.testBusca();
	    	
	    }
	    @Test
	    public void testDisciplina() throws ClassNotFoundException{
	    	DisciplinaDao disciplina = new DisciplinaDao();
	    	disciplina.inserir();
	    
	    }

}

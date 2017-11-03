import static org.junit.Assert.*;

import org.junit.Test;

public class AlunoTest {

	@Test
	public void test() throws ClassNotFoundException {
		Aluno aluno = new Aluno("Ana Luiza", "12345678912", "analuiiza@gmail.com", "11111111",0, "11/11/1997",1, "9", "A", "manha");
		
		aluno.inserir();
		
		
	}

}

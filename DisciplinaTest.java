import static org.junit.Assert.*;

import org.junit.Test;

public class DisciplinaTest {

	@Test
	public void test() throws ClassNotFoundException {
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("Matematica");
		disciplina.setId_serie(1);
		disciplina.setId_professor(1);
		disciplina.inserir();
	}

}

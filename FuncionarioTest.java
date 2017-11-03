import static org.junit.Assert.*;

import org.junit.Test;

public class FuncionarioTest {

	@Test
	public void test() throws ClassNotFoundException {
		Funcionario funcionario = new Funcionario("Bruno", "11111111122", "bruno@gmail.com", "11111222", 11111111, "12/12/1998");
		funcionario.inserirP();
	}

}

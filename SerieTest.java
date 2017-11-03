import static org.junit.Assert.*;

import org.junit.Test;

public class SerieTest {

	@Test
	public void testSerie() throws ClassNotFoundException 
	{	Serie serie  = new Serie();
		serie.setNome("9");
		serie.setTurma("A");
		serie.setTurno("manha");
		serie.inserir();
	}

}

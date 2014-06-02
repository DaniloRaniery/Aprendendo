import static org.junit.Assert.*;

import org.junit.Test;


public class TesteInicial {

	
	@Test
	public void testApp(){
		Aps a1 = new Aps();
		Aps a2 = new Aps("João", "7131238", 20);
		
		assertTrue (a1.getNome().equals("Aluno"));
		assertTrue (a1.getMatricula().equals("0123456"));
		assertTrue (a1.getIdade()==0);
		
		assertTrue (a2.getNome().equals("João"));
		assertTrue (a2.getMatricula().equals("7131238"));
		assertTrue (a2.getIdade()==20);
		
		assertFalse (a2.getNome().equals("Aluno"));
		
		a1.setNome("Emiliano");
		a1.setIdade(22);
		a1.setMatricula("8111104");
		
		assertTrue (a1.getNome().equals("Emiliano"));
		assertTrue (a1.getMatricula().equals("8111104"));
		assertTrue (a1.getIdade()==22);
		assertFalse("Gilson".equals(a1.getNome()));		
		assertFalse("Gilson".equals(a2.getNome()));
		
		a1.setNome("Gilson");
		a1.setIdade(26);
		a1.setMatricula("8111107");
		
		assertTrue (a1.getNome().equals("Gilson"));
		assertTrue (a1.getMatricula().equals("8111107"));
		assertTrue (a1.getIdade()==26);
		
	}


}

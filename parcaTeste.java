import java.util.List;


public class ParcaTest {
	
		
	public void test() {
		Grafo grafo = 
				new GrafoComListaDeAdjacencias("Faustão", "Neymar", "Thiaguinho", 
						"Gabriel Medina", "Tirulipa", "Whindersson");
			
		Vertice faustao = grafo.getVertice("Faustão");
		Vertice neymar = grafo.getVertice("Neymar");
		Vertice thiaguinho = grafo.getVertice("Thiaguinho");
		Vertice gabriel = grafo.getVertice("Gabriel Medina");
		Vertice tirulipa = grafo.getVertice("Tirulipa");
		Vertice whindersson = grafo.getVertice("Whindersson");
	
		grafo.addAresta(faustao, neymar, 0);
		grafo.addAresta(thiaguinho, neymar, 0);
		grafo.addAresta(neymar, thiaguinho, 0);
		grafo.addAresta(neymar, gabriel, 0);
		grafo.addAresta(tirulipa, faustao, 0);
		grafo.addAresta(tirulipa, neymar, 0);
		grafo.addAresta(tirulipa, whindersson, 0);
		grafo.addAresta(whindersson, gabriel, 0);		
		grafo.addAresta(gabriel, whindersson, 0);
			
		List<Vertice> vertices = grafo.getVertices();
			
		assertTrue(vertices.contains(faustao));
		assertTrue(vertices.contains(neymar));
		assertTrue(vertices.contains(thiaguinho));
		assertTrue(vertices.contains(gabriel));
		assertTrue(vertices.contains(tirulipa));
		assertTrue(vertices.contains(whindersson));
		assertEquals(6, vertices.size());
			
		//Faustão
		assertTrue(grafo.segue(faustao, neymar));
		assertFalse(grafo.segue(faustao, thiaguinho));		
		assertFalse(grafo.segue(faustao, gabriel));		
		assertFalse(grafo.segue(faustao, tirulipa));
		assertFalse(grafo.segue(faustao, whindersson));
			
		//Neymar
		assertFalse(grafo.segue(neymar, faustao));	
		assertTrue(grafo.segue(neymar, thiaguinho));
		assertTrue(grafo.segue(neymar, gabriel));
		assertFalse(grafo.segue(neymar, tirulipa));
		assertFalse(grafo.segue(neymar, whindersson));
			
		//Thiaguinho
		assertFalse(grafo.segue(thiaguinho, faustao));		
		assertTrue(grafo.segue(thiaguinho, neymar));
		assertFalse(grafo.segue(thiaguinho, gabriel));		
		assertFalse(grafo.segue(thiaguinho, tirulipa));		
		assertFalse(grafo.segue(thiaguinho, whindersson));		
			
		//Gabriel
		assertFalse(grafo.segue(gabriel, faustao));	
		assertFalse(grafo.segue(gabriel, neymar));		
		assertFalse(grafo.segue(gabriel, thiaguinho));		
		assertFalse(grafo.segue(gabriel, tirulipa));
		assertTrue(grafo.segue(gabriel, whindersson));
			
		//Tirulipa
		assertTrue(grafo.segue(tirulipa, faustao));	
		assertTrue(grafo.segue(tirulipa, neymar));	
		assertFalse(grafo.segue(tirulipa, thiaguinho));
		assertFalse(grafo.segue(tirulipa, gabriel));		
		assertTrue(grafo.segue(tirulipa, whindersson));	
			
		//Whindersson
		assertFalse(grafo.segue(whindersson, faustao));	
		assertFalse(grafo.segue(whindersson, neymar));	
		assertFalse(grafo.segue(whindersson, thiaguinho));
		assertTrue(grafo.segue(whindersson, gabriel));		
		assertFalse(grafo.segue(whindersson, tirulipa));	
			
	}
	
	private void assertEquals(int i, int size) {
			// TODO Auto-generated method stub
			
	}
	
	private void assertTrue(boolean segue) {
			// TODO Auto-generated method stub
			
	}
	
	private void assertFalse(boolean segue) {
			// TODO Auto-generated method stub
			
	}	
		
}
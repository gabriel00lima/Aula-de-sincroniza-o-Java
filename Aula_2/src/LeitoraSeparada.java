
public class LeitoraSeparada extends Thread {
	public void run () {
		while (MemoriaCompartilhadaSeparada.getNumero()< 10000) {
			System.out.println(MemoriaCompartilhadaSeparada.getNumero());
			
		}
	}

}

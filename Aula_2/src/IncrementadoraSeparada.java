
public class IncrementadoraSeparada extends Thread {
	public void run () {
		while (MemoriaCompartilhadaSeparada.getNumero()< 10000) {
			MemoriaCompartilhadaSeparada.incrementar();
		}
	}

}

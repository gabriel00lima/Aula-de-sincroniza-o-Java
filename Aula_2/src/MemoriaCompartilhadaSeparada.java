
public class MemoriaCompartilhadaSeparada {
	private static int numero = 0;
	
	public static synchronized void incrementar() {
		numero++;
	}
public static synchronized int getNumero() {
	return numero;
}
}

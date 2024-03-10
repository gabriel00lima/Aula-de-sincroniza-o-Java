
public class MemoriaCompartilhada {
private static int numero = 0;

public static synchronized void incrementar(int id) {
	numero++;
	System.out.println("Thread "+ id  + " numero" + numero);
	}
	public static synchronized int getNumero() {
		return numero;
	}
}


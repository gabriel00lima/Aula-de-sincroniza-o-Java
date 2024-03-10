
public class Incrementadora  extends Thread{
	private int id = 0;

	public Incrementadora(int id) {
		super();
		this.id = id;
	} 
	public void run() {
		while (MemoriaCompartilhada.getNumero()<1000) {
		MemoriaCompartilhada.incrementar(id);
		
	}		
	}
}

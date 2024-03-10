
public class Paralela extends Thread{
	private int id = 0;
	public Paralela(int id) {
		this.id = id;
	}
	public void run() {
		for(int i = 0 ; i<5;i++) {
		System.out.println("Hello World !");
		System.out.println("Mensagem número: "+i);
		System.out.println("Thead número: "+id);
		System.out.println("================");
	}
	}
}

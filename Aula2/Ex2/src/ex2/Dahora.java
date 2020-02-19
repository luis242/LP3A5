package ex2;

public class Dahora implements Runnable{

	int a;
	String text;
	int mili;
	
	public Dahora(String text, int mili) {
		this.text = text;
		this.mili = mili;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println(text + a);
				a += 1;
				Thread.sleep(mili);
			}
		} catch (InterruptedException a){
			System.out.println("\n" + Thread.currentThread().getName() + " interrompida.");
			System.out.println("INTERROMPIDO flag: " + Thread.currentThread().isInterrupted());
		}
		System.out.println("Thread " + Thread.currentThread().getName() + " está ACABADA!");
	}
	
}

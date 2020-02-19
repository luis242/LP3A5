package ex1;

public class App {
	
	public static void main(String[] args) {
		Runnable obj1 = new Dahora("Salve! Número: ", 200);
		Thread t1 = new Thread(obj1);
		t1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException a){
			
		}
		
		t1.interrupt();
		System.out.println("\nThread " + Thread.currentThread().getName() + " está ACABADA!");
	}
}

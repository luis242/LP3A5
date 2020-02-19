package ex2;

public class App {
	
	public static void main(String[] args) {
		Runnable obj1 = new Dahora(".mp3 ", 200);
		Runnable obj2 = new Dahora(".txt ", 500);
		Runnable obj3 = new Dahora(".png ", 700);
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(5000);
			t1.interrupt();
			Thread.sleep(5000);
			t2.interrupt();
			Thread.sleep(5000);
			t3.interrupt();
		} catch (InterruptedException a){}
		System.out.println("\nThread " + Thread.currentThread().getName() + " está ACABADA!");
	}
}

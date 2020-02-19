package ex3;

public class App {
	
	public static void main(String[] args) {
		Runnable obj1 = new Dahora();
		Thread t1 = new Thread(obj1);
		t1.start();
	}
}
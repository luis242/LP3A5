package ex1;

public class App {
	
	public static void main(String[] args) {
		Runnable obj1 = new RaizCubica();
		Runnable obj2 = new RaizQuadrada();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Object obje = new Object();
		synchronized(obje) {
			t1.start();
			t2.start();
		}
	}
	
}
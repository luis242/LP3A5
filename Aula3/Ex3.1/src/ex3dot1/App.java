package ex3dot1;

public class App {
	
	public static void main(String [] args) {
		SharedObject o = new SharedObject();
		String[] names = {"MC Maha1", "DJ WS1", "MC Gorilla2", "Palinha2"};
		Thread[] threadzada = { new Thread(new Consumer(o)), new Thread (new Consumer(o)),
								new Thread(new Producer(o)), new Thread(new Producer(o))};
		for(int i = 0; i < threadzada.length; i++) {
			threadzada[i].setName(names[i]);
			threadzada[i].start();
		}
		
		try {
			for(Thread t: threadzada) {
				t.join(1500);//
				if(t.isAlive()) { t.interrupt(); }
			}
		} catch (InterruptedException ignored) {}
		System.out.println("Main DONE");
	}

}

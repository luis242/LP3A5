package ex3;

import java.util.ArrayList;

public class Dahora implements Runnable{

	ArrayList<Double> raiz = new ArrayList<Double>();
	
	@Override
	public void run() {
		this.Raiz2();
		this.Raiz3();
	}
	
	private void Raiz2() {
		raiz.clear();
		for(int a = 1; a < 100; a ++) {
			if(a % 2 != 0) {
				raiz.add(Math.sqrt(a));	
			}
		}
		this.Chama();
	}
	
	private void Raiz3() {
		raiz.clear();
		for(int b = 2; b <= 1000; b ++) {
			if(b % 2 == 0) {
				raiz.add(Math.cbrt(b));
			}
		}
		this.Chama();
	}
	
	public void Chama() {
		for(int c = 0; c < raiz.size(); c++) {
			System.out.println("Raiz:" + raiz.get(c));
			try {
				Thread.sleep(50);
			} catch (InterruptedException gnored){}

		}
	}
}

package ex1;

import java.util.ArrayList;

public class RaizQuadrada implements Runnable {
	
	@Override
	public void run() {
		this.Raiz2();
	}
	
	private synchronized void Raiz2() {
		ArrayList<Double> resp = new ArrayList<Double>();
		resp.clear();
		for(int a = 1; a < 100; a ++) {
			if(a % 2 != 0) {
				resp.add(Math.sqrt(a));	
			}
		}
		Sharingan.setArrayList(resp);
		Sharingan.printChama();
	}

}
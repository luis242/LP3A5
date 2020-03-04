package ex1;

import java.util.ArrayList;

public class RaizCubica implements Runnable {
	
	@Override
	public void run() {
		this.Raiz3();
	}
	
	private synchronized void Raiz3() {
		ArrayList<Double> resp = new ArrayList<Double>();
		resp.clear();
		for(int b = 2; b <= 1000; b ++) {
			if(b % 2 == 0) {
				resp.add(Math.cbrt(b));
			}
		}
		Sharingan.setArrayList(resp);
		Sharingan.printChama();
	}

}

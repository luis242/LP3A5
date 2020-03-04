package ex1;

import java.util.ArrayList;

public class Sharingan {
	
	private static ArrayList<Double> resp = new ArrayList<Double>();
	
	private synchronized static ArrayList<Double> getArrayList() {
		return resp;
	}
	
	public synchronized static void setArrayList(ArrayList<Double> result) {
		resp = result;
	}
	
	
	public synchronized static void printChama() {
		ArrayList<Double> resp = getArrayList();
		for(int c = 0; c < resp.size(); c++) {
			System.out.println("Raiz:" + resp.get(c));
			try {
				Thread.sleep(50);
			} catch (InterruptedException gnored){}
		}
	}
	
}
package weights;

import ui.WarmUpSetUI;

public class RoundWeightUp {
	
	private static double in = 1.25;
	private static Double[] rates = {.2, .5, .7, .8, .9, 1.0};
	
	
	public static void main (String[] args) {
		
		new WarmUpSetUI();
		
	
		
	}
	
	public static String getSets(double weight) {
		String str = "";
		for (Double d : rates) {
			str += roundWeightUp(weight * d, in) + ", ";
		}
		
		return str;
	}
	
	
	public static String roundWeightUp(double w, double in) {
		double weight = fix(w);
		
		//concatenate
		
		String str = Double.toString(weight);
		
		while (!str.endsWith("0.0") && !str.endsWith("2.5") &&!str.endsWith("5.0") && !str.endsWith("7.5")) {
			weight += .01;
			str = Double.toString(fix(weight));
		}
		return str;
		

		
	}
	
	public static double fix(double w) {
		double weight = w;
		int temp = (int) (weight * 100);
		weight = temp;
		weight = weight / 100;
		
		return weight;
	}
}


public class MagicCalculator extends Calculator {
	
	public static double root(double num) {
		return Math.sqrt(num);
	}
	
	public static double sine(double num) {
		return Math.sin(num);
	}
	
	public static double cosine(double num) {
		return Math.cosh(num);
	}
	
	public static double tangent(double num) {
		return Math.tan(num);
	}
	
	public static int factor(int num) {
		int product = 1;
		int x = num;
		for (int i = num; i > 0; i--) {
			product *= x;
			x -= 1;
		}
		return product;
	}
}

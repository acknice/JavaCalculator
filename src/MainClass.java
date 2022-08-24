
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
			//testing calculator operations
			int addTest = Calculator.add(51, 36);
			System.out.println(addTest);
			
			int subTest = Calculator.subtract(836, 124);
			System.out.println(subTest);
			
			int multTest = Calculator.multiply(10, 8);
			System.out.println(multTest);
			
			int divTest = Calculator.divide(360, 6);
			System.out.println(divTest);
			
			int sqTest = Calculator.square(9);
			System.out.println(sqTest);
			
			
			//testing magic operations
			int magicAddTest = MagicCalculator.add(10054, 611);
			System.out.println(magicAddTest);
			
			int magicMultTest = MagicCalculator.multiply(75, 2080);
			System.out.println(magicMultTest);
			
			double rootTest = MagicCalculator.root(64);
			System.out.println(rootTest);
			
			double sinTest = MagicCalculator.sine(27);
			System.out.println(sinTest);
			
			double cosTest = MagicCalculator.cosine(27);
			System.out.println(cosTest);
			
			double tanTest = MagicCalculator.tangent(27);
			System.out.println(tanTest);
			
			double factorTest = MagicCalculator.factor(7);
			System.out.println(factorTest);
			
			
	}

}


public class MyCalculatorCons {
static int num1, num2;

public MyCalculatorCons (int x, int y) {
	num1 = x;
	num2 = y;
}

	public static int addnums(){
		int result = num1 + num2;
		return result;
	}
	
	public static int subnums() {
		int result = num1 - num2;
		return result;
	}
	
	public static int mulnums() {
		int result = num1 * num2;
		return result;
	}
	
	public static int divnums() {
		int result = num1 / num2;
		return result;
	}
	 public void printSummary() {
		 	System.out.println("Sum of values " + addnums());
			System.out.println("Sub of values " + subnums());
			System.out.println("Mul of values " + mulnums());
			System.out.println("Div of values " + divnums());
	 }
}


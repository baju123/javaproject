
public class MyCalculator {
	int num1 = 10;
	int num2 = 50;
	
	public void addnums() {
		int result = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + "is = "+ result );
	}
	
	public void subnums() {
		int result = num2 - num1;
		System.out.println("Sub of " + num2 + " and " + num1 + "is = "+  result );
	}
	
	public void mulnums() {
		int result = num1 * num2;
		System.out.println("Mul of " + num1 + " and " + num2 + "is = "  +result );
	}
	
	public void divnums() {
		int result = num1 / num2;
		System.out.println("Div of " + num1 + " and "  + num2 +"is = "  + result );
	}
}

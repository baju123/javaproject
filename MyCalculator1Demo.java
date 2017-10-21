
public class MyCalculator1Demo {
	public static void main(String[] args) {
		MyCalculator1 cal = new MyCalculator1();
		int sum = cal.addnums(50,10);
		int sub = cal.subnums(50,10);
		int mul = cal.mulnums(50,10);
		int div = cal.divnums(50,10);
		
		System.out.println("Sum of values " + sum);
		System.out.println("Sum of values " + sub);
		System.out.println("Sum of values " + mul);
		System.out.println("Sum of values " + div);
	}

}

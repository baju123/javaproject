
import java.util.Scanner;

public class NameCity {
	static String A1 = "Hi ";
	static String A2 = "Welcome to";
	static String A3 = " BCAS Campus @ ";
	static String A4 = "CSD Department";
	private static Scanner a;
	private static Scanner b;
	private static Scanner c;
	
	public static void main(String[] args) {
		a = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = a.nextLine();
		
		b = new Scanner(System.in);
		System.out.println("Whats your city?");
		String city = b.nextLine();
		
		c = new Scanner(System.in);
		System.out.println("Whats your department?");
		String department = c.nextLine();
		
		int index = name.indexOf(" ");
		
		
		System.out.println(A1+name.subSequence(0, index));
		System.out.println(A2.concat(A3)+city);
		System.out.println(A4);
		
	}

}
import java.util.Scanner;

public class marks {
	public static void main(String[] args) {
		int n, total = 0, percentage;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of Subjects: ");
		n = scan.nextInt();
		int marks[] = new int[n];
		System.out.println("Enter marks: ");
		for ( int i = 0; i<n; i++) {
			marks[i] = scan.nextInt();
			total = total + marks[i];
			}
		percentage = total/n ;
		System.out.println("Sum of marks: "+ total);
		System.out.println("Percentage: "+ percentage);
	}
}

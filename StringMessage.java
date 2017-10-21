

public class StringMessage {
	static String A1 = "Hi ";
		static String A2 = "Welcome to";
		static String A3 = " BCAS Campus @ ";
		static String A4 = "CSD Depsrtment";
		
		public static void main(String[] args) {
			Scanner a = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = a.nextLine();
			
			Scanner b = new Scanner(System.in);
			System.out.println("Whats your city?");
			String city = b.nextLine();
			
			Scanner c = new Scanner(System.in);
			System.out.println("Whats your department?");
			String department = c.nextLine();
			
			int index = name.indexOf(" ");
			
			
			System.out.println(A1+name.subSequence(0, index));
			System.out.println(A2.concat(A3)+city);
			System.out.println(A4.concat(A4));
			
		}

	}



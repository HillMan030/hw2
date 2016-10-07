import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		double integer,number,total;
		integer =keyboard.nextDouble();
		System.out.println("Enter a float point number:");
		number =keyboard.nextDouble();
		System.out.println("Enter your name");
		
		String name =keyboard.next();
		total = number * integer;
		System.out.printf("Hi "+name+ ", the multiplication of");
		System.out.printf(integer+" and "+number+" is ");
		System.out.printf("$%.2e",total);
		
		
		
		
		
		
	}

}

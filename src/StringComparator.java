	import java.util.Scanner;

	public class StringComparator {

		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Enter a string: ");
			String name1 =keyboard.next();
			System.out.println("Enter a string: ");
			String name2 =keyboard.next();
		
			
			if( name2==name1)
			{
				System.out.println("The two strings are the same.");
			}
			else
			{
				System.out.println("The two strings are not the same.");
			}
					

		}

	}



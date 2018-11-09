import java.util.Scanner;

public class Jawn 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
			System.out.print("Enter your name here: ");	
			String name = user.nextLine();
			System.out.print("Enter your Favorite color here: ");	
			String color = user.nextLine();
			System.out.print("Enter your Favorite food here: ");	
			String food = user.nextLine();
			System.out.print("Enter your Favorite subject here: ");	
			String sub = user.nextLine();
		System.out.println("\n" + name + ": ");
		System.out.print("\n\tColor: " + color);
		System.out.print("\n\tFood: " + food);
		System.out.print("\n\tSubject: " + sub);
		
		
	}

}

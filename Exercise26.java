import java.util.Scanner;

public class Exercise26 
{
 	public static void main(String[] args)
	{ 

		int sum =0; 

		Scanner input = new Scanner(System.in);   

		System.out.println("Please enter an integer between 0 and 1000: "); 
 		int enteredInt = input.nextInt();  

		if (enteredInt >= 0 && enteredInt <= 1000) 

		{ 
			while(enteredInt >0 ) 

			{ 

				sum += enteredInt % 10; 

				enteredInt = enteredInt / 10; 

			} 

			System.out.println("The sum of the digits is: " + sum); 

		} else 

		{ 

			System.out.println("Not an integer in the correct range"); 

			System.exit(0); 

		} 

	}
}
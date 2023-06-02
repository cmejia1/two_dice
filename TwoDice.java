// chapter 5 exercise 

public class TwoDice
{
	public static void main(String[] args) 
	{
		// variables and constants
		String outcome; 
		Die die1 = new Die();
		Die die2 = new Die();

		// processing phase
		if(die1.getDieValue() > die2.getDieValue())
		{
			outcome = "The player wins the game!";
		} // end of first if statement
		else 
		{
			if(die1.getDieValue() < die2.getDieValue())
			{
				outcome = "The computer has won.";
			} // end of nested if statement
			else 
			{
				outcome = "We have a tie game!";
			} // end of nested else statement
		} // end of first else statement

		// output phase
		System.out.println("The players die roll was a : " + die1.getDieValue());
		System.out.println("The computers die roll was a : " + die2.getDieValue());
		System.out.println(outcome);
	}
}
import java.util.Scanner;
/***
 * 
 * @author Leo Li
 * Crack the Code Main Class
 *
 */
public class CrackMeMain 
{

	public static void main(String[] args) 
	{
		//Instantiating CrackMe Object and a Scanner object
		CrackMe crackMe = new CrackMe();
		Scanner in = new Scanner (System.in);
		
		//Creating a boolean variable which is false if password has not been guessed and true if it has
		boolean cont = false;
		
		//Variable to store remaining guesses, starting from 10
		int guessRemain = 10;
		
		//System.out.println(crackMe.toString());
		
		//Guess 1
		if (cont) 
		{
		}
		else
		{
			System.out.print("You have " + guessRemain + " guesses remaining. Enter a three-digit guess: ");
			if(in.hasNextInt()) //Validating that user has entered an integer
			{
				int intGuess = in.nextInt(); //Taking input as an integer
				if(intGuess >= 100 && intGuess <= 999)  //Validating that user entered 3 digit integer
				{
					String guess = "" + intGuess; //Converting guess to a String
					//Checking Each Digit
					if(crackMe.checkFirstDigit(guess)) //Checking first digit
					{
						if(crackMe.checkSecondDigit(guess)) //First Digit Correct, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //All Three digits correct
							{
								cont = true;
							}
							else // First and Second digit Correct
							{
								System.out.println(guess.charAt(0) + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else 
						{
							if(crackMe.checkThirdDigit(guess)) //First and Third Digit Correct
							{
								System.out.println(guess.charAt(0) + "_" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only First Digit Correct
							{
								System.out.println(guess.charAt(0) + "_ _");
								guessRemain -= 1;
							}
						}
					}
					else //First Digit Wrong
					{
						if(crackMe.checkSecondDigit(guess))//First Digit Wrong, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First Digit Wrong, Second and Third Digit Correct
							{
								System.out.println("_" + guess.charAt(1) + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only Second Digit correct
							{
								System.out.println("_" + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else //First Digit Wrong, Second Digit Wrong, Checking Third Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First and Second Digit Wrong, Third Digit Correct
							{
								System.out.println("_ _" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //All Three Digits Wrong
							{
								System.out.println("_ _ _");
								guessRemain -= 1;
							}
						}
					}
				}
					else //Invalid input due to non-three digit number
					{
						System.out.println("Error: Not a number between 100 and 999");
						guessRemain -=1;
					}
				}
			else //Invalid input due to non-integer input
			{
				System.out.println("Error: Not a number.");	
				guessRemain -= 1;
				in.nextLine();
			}	
		}	
		
		//Guess 2
		if (cont) 
		{
		}
		else
		{
			System.out.print("You have " + guessRemain + " guesses remaining. Enter a three-digit guess: ");
			if(in.hasNextInt()) //Validating that user has entered an integer
			{
				int intGuess = in.nextInt(); //Taking input as an integer
				if(intGuess >= 100 && intGuess <= 999)  //Validating that user entered 3 digit integer
				{
					String guess = "" + intGuess; //Converting guess to a String
					//Checking Each Digit
					if(crackMe.checkFirstDigit(guess)) //Checking first digit
					{
						if(crackMe.checkSecondDigit(guess)) //First Digit Correct, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //All Three digits correct
							{
								cont = true;
							}
							else // First and Second digit Correct
							{
								System.out.println(guess.charAt(0) + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else 
						{
							if(crackMe.checkThirdDigit(guess)) //First and Third Digit Correct
							{
								System.out.println(guess.charAt(0) + "_" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only First Digit Correct
							{
								System.out.println(guess.charAt(0) + "_ _");
								guessRemain -= 1;
							}
						}
					}
					else //First Digit Wrong
					{
						if(crackMe.checkSecondDigit(guess))//First Digit Wrong, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First Digit Wrong, Second and Third Digit Correct
							{
								System.out.println("_" + guess.charAt(1) + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only Second Digit correct
							{
								System.out.println("_" + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else //First Digit Wrong, Second Digit Wrong, Checking Third Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First and Second Digit Wrong, Third Digit Correct
							{
								System.out.println("_ _" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //All Three Digits Wrong
							{
								System.out.println("_ _ _");
								guessRemain -= 1;
							}
						}
					}
				}
					else //Invalid input due to non-three digit number
					{
						System.out.println("Error: Not a number between 100 and 999");
						guessRemain -=1;
					}
				}
			else //Invalid input due to non-integer input
			{
				System.out.println("Error: Not a number.");	
				guessRemain -= 1;
				in.nextLine();
			}	
		}	
		
		//Guess 3 
		if (cont) 
		{
		}
		else
		{
			System.out.print("You have " + guessRemain + " guesses remaining. Enter a three-digit guess: ");
			if(in.hasNextInt()) //Validating that user has entered an integer
			{
				int intGuess = in.nextInt(); //Taking input as an integer
				if(intGuess >= 100 && intGuess <= 999)  //Validating that user entered 3 digit integer
				{
					String guess = "" + intGuess; //Converting guess to a String
					//Checking Each Digit
					if(crackMe.checkFirstDigit(guess)) //Checking first digit
					{
						if(crackMe.checkSecondDigit(guess)) //First Digit Correct, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //All Three digits correct
							{
								cont = true;
							}
							else // First and Second digit Correct
							{
								System.out.println(guess.charAt(0) + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else 
						{
							if(crackMe.checkThirdDigit(guess)) //First and Third Digit Correct
							{
								System.out.println(guess.charAt(0) + "_" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only First Digit Correct
							{
								System.out.println(guess.charAt(0) + "_ _");
								guessRemain -= 1;
							}
						}
					}
					else //First Digit Wrong
					{
						if(crackMe.checkSecondDigit(guess))//First Digit Wrong, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First Digit Wrong, Second and Third Digit Correct
							{
								System.out.println("_" + guess.charAt(1) + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only Second Digit correct
							{
								System.out.println("_" + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else //First Digit Wrong, Second Digit Wrong, Checking Third Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First and Second Digit Wrong, Third Digit Correct
							{
								System.out.println("_ _" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //All Three Digits Wrong
							{
								System.out.println("_ _ _");
								guessRemain -= 1;
							}
						}
					}
				}
					else //Invalid input due to non-three digit number
					{
						System.out.println("Error: Not a number between 100 and 999");
						guessRemain -=1;
					}
				}
			else //Invalid input due to non-integer input
			{
				System.out.println("Error: Not a number.");	
				guessRemain -= 1;
				in.nextLine();
			}	
		}	
		
		//Guess 4
		if (cont) 
		{
		}
		else
		{
			System.out.print("You have " + guessRemain + " guesses remaining. Enter a three-digit guess: ");
			if(in.hasNextInt()) //Validating that user has entered an integer
			{
				int intGuess = in.nextInt(); //Taking input as an integer
				if(intGuess >= 100 && intGuess <= 999)  //Validating that user entered 3 digit integer
				{
					String guess = "" + intGuess; //Converting guess to a String
					//Checking Each Digit
					if(crackMe.checkFirstDigit(guess)) //Checking first digit
					{
						if(crackMe.checkSecondDigit(guess)) //First Digit Correct, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //All Three digits correct
							{
								cont = true;
							}
							else // First and Second digit Correct
							{
								System.out.println(guess.charAt(0) + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else 
						{
							if(crackMe.checkThirdDigit(guess)) //First and Third Digit Correct
							{
								System.out.println(guess.charAt(0) + "_" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only First Digit Correct
							{
								System.out.println(guess.charAt(0) + "_ _");
								guessRemain -= 1;
							}
						}
					}
					else //First Digit Wrong
					{
						if(crackMe.checkSecondDigit(guess))//First Digit Wrong, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First Digit Wrong, Second and Third Digit Correct
							{
								System.out.println("_" + guess.charAt(1) + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only Second Digit correct
							{
								System.out.println("_" + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else //First Digit Wrong, Second Digit Wrong, Checking Third Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First and Second Digit Wrong, Third Digit Correct
							{
								System.out.println("_ _" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //All Three Digits Wrong
							{
								System.out.println("_ _ _");
								guessRemain -= 1;
							}
						}
					}
				}
					else //Invalid input due to non-three digit number
					{
						System.out.println("Error: Not a number between 100 and 999");
						guessRemain -=1;
					}
				}
			else //Invalid input due to non-integer input
			{
				System.out.println("Error: Not a number.");	
				guessRemain -= 1;
				in.nextLine();
			}	
		}	
		
		//Guess 5
		if (cont) 
		{
		}
		else
		{
			System.out.print("You have " + guessRemain + " guesses remaining. Enter a three-digit guess: ");
			if(in.hasNextInt()) //Validating that user has entered an integer
			{
				int intGuess = in.nextInt(); //Taking input as an integer
				if(intGuess >= 100 && intGuess <= 999)  //Validating that user entered 3 digit integer
				{
					String guess = "" + intGuess; //Converting guess to a String
					//Checking Each Digit
					if(crackMe.checkFirstDigit(guess)) //Checking first digit
					{
						if(crackMe.checkSecondDigit(guess)) //First Digit Correct, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //All Three digits correct
							{
								cont = true;
							}
							else // First and Second digit Correct
							{
								System.out.println(guess.charAt(0) + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else 
						{
							if(crackMe.checkThirdDigit(guess)) //First and Third Digit Correct
							{
								System.out.println(guess.charAt(0) + "_" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only First Digit Correct
							{
								System.out.println(guess.charAt(0) + "_ _");
								guessRemain -= 1;
							}
						}
					}
					else //First Digit Wrong
					{
						if(crackMe.checkSecondDigit(guess))//First Digit Wrong, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First Digit Wrong, Second and Third Digit Correct
							{
								System.out.println("_" + guess.charAt(1) + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only Second Digit correct
							{
								System.out.println("_" + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else //First Digit Wrong, Second Digit Wrong, Checking Third Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First and Second Digit Wrong, Third Digit Correct
							{
								System.out.println("_ _" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //All Three Digits Wrong
							{
								System.out.println("_ _ _");
								guessRemain -= 1;
							}
						}
					}
				}
					else //Invalid input due to non-three digit number
					{
						System.out.println("Error: Not a number between 100 and 999");
						guessRemain -=1;
					}
				}
			else //Invalid input due to non-integer input
			{
				System.out.println("Error: Not a number.");	
				guessRemain -= 1;
				in.nextLine();
			}	
		}	
		
		//Guess 6 
		if (cont) 
		{
		}
		else
		{
			System.out.print("You have " + guessRemain + " guesses remaining. Enter a three-digit guess: ");
			if(in.hasNextInt()) //Validating that user has entered an integer
			{
				int intGuess = in.nextInt(); //Taking input as an integer
				if(intGuess >= 100 && intGuess <= 999)  //Validating that user entered 3 digit integer
				{
					String guess = "" + intGuess; //Converting guess to a String
					//Checking Each Digit
					if(crackMe.checkFirstDigit(guess)) //Checking first digit
					{
						if(crackMe.checkSecondDigit(guess)) //First Digit Correct, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //All Three digits correct
							{
								cont = true;
							}
							else // First and Second digit Correct
							{
								System.out.println(guess.charAt(0) + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else 
						{
							if(crackMe.checkThirdDigit(guess)) //First and Third Digit Correct
							{
								System.out.println(guess.charAt(0) + "_" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only First Digit Correct
							{
								System.out.println(guess.charAt(0) + "_ _");
								guessRemain -= 1;
							}
						}
					}
					else //First Digit Wrong
					{
						if(crackMe.checkSecondDigit(guess))//First Digit Wrong, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First Digit Wrong, Second and Third Digit Correct
							{
								System.out.println("_" + guess.charAt(1) + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only Second Digit correct
							{
								System.out.println("_" + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else //First Digit Wrong, Second Digit Wrong, Checking Third Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First and Second Digit Wrong, Third Digit Correct
							{
								System.out.println("_ _" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //All Three Digits Wrong
							{
								System.out.println("_ _ _");
								guessRemain -= 1;
							}
						}
					}
				}
					else //Invalid input due to non-three digit number
					{
						System.out.println("Error: Not a number between 100 and 999");
						guessRemain -=1;
					}
				}
			else //Invalid input due to non-integer input
			{
				System.out.println("Error: Not a number.");	
				guessRemain -= 1;
				in.nextLine();
			}	
		}	
		
		//Guess 7 
		if (cont) 
		{
		}
		else
		{
			System.out.print("You have " + guessRemain + " guesses remaining. Enter a three-digit guess: ");
			if(in.hasNextInt()) //Validating that user has entered an integer
			{
				int intGuess = in.nextInt(); //Taking input as an integer
				if(intGuess >= 100 && intGuess <= 999)  //Validating that user entered 3 digit integer
				{
					String guess = "" + intGuess; //Converting guess to a String
					//Checking Each Digit
					if(crackMe.checkFirstDigit(guess)) //Checking first digit
					{
						if(crackMe.checkSecondDigit(guess)) //First Digit Correct, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //All Three digits correct
							{
								cont = true;
							}
							else // First and Second digit Correct
							{
								System.out.println(guess.charAt(0) + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else 
						{
							if(crackMe.checkThirdDigit(guess)) //First and Third Digit Correct
							{
								System.out.println(guess.charAt(0) + "_" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only First Digit Correct
							{
								System.out.println(guess.charAt(0) + "_ _");
								guessRemain -= 1;
							}
						}
					}
					else //First Digit Wrong
					{
						if(crackMe.checkSecondDigit(guess))//First Digit Wrong, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First Digit Wrong, Second and Third Digit Correct
							{
								System.out.println("_" + guess.charAt(1) + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only Second Digit correct
							{
								System.out.println("_" + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else //First Digit Wrong, Second Digit Wrong, Checking Third Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First and Second Digit Wrong, Third Digit Correct
							{
								System.out.println("_ _" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //All Three Digits Wrong
							{
								System.out.println("_ _ _");
								guessRemain -= 1;
							}
						}
					}
				}
					else //Invalid input due to non-three digit number
					{
						System.out.println("Error: Not a number between 100 and 999");
						guessRemain -=1;
					}
				}
			else //Invalid input due to non-integer input
			{
				System.out.println("Error: Not a number.");	
				guessRemain -= 1;
				in.nextLine();
			}	
		}	
		
		//Guess 8
		if (cont) 
		{
		}
		else
		{
			System.out.print("You have " + guessRemain + " guesses remaining. Enter a three-digit guess: ");
			if(in.hasNextInt()) //Validating that user has entered an integer
			{
				int intGuess = in.nextInt(); //Taking input as an integer
				if(intGuess >= 100 && intGuess <= 999)  //Validating that user entered 3 digit integer
				{
					String guess = "" + intGuess; //Converting guess to a String
					//Checking Each Digit
					if(crackMe.checkFirstDigit(guess)) //Checking first digit
					{
						if(crackMe.checkSecondDigit(guess)) //First Digit Correct, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //All Three digits correct
							{
								cont = true;
							}
							else // First and Second digit Correct
							{
								System.out.println(guess.charAt(0) + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else 
						{
							if(crackMe.checkThirdDigit(guess)) //First and Third Digit Correct
							{
								System.out.println(guess.charAt(0) + "_" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only First Digit Correct
							{
								System.out.println(guess.charAt(0) + "_ _");
								guessRemain -= 1;
							}
						}
					}
					else //First Digit Wrong
					{
						if(crackMe.checkSecondDigit(guess))//First Digit Wrong, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First Digit Wrong, Second and Third Digit Correct
							{
								System.out.println("_" + guess.charAt(1) + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only Second Digit correct
							{
								System.out.println("_" + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else //First Digit Wrong, Second Digit Wrong, Checking Third Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First and Second Digit Wrong, Third Digit Correct
							{
								System.out.println("_ _" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //All Three Digits Wrong
							{
								System.out.println("_ _ _");
								guessRemain -= 1;
							}
						}
					}
				}
					else //Invalid input due to non-three digit number
					{
						System.out.println("Error: Not a number between 100 and 999");
						guessRemain -=1;
					}
				}
			else //Invalid input due to non-integer input
			{
				System.out.println("Error: Not a number.");	
				guessRemain -= 1;
				in.nextLine();
			}	
		}	
		
		//Guess 9
		if (cont) 
		{
		}
		else
		{
			System.out.print("You have " + guessRemain + " guesses remaining. Enter a three-digit guess: ");
			if(in.hasNextInt()) //Validating that user has entered an integer
			{
				int intGuess = in.nextInt(); //Taking input as an integer
				if(intGuess >= 100 && intGuess <= 999)  //Validating that user entered 3 digit integer
				{
					String guess = "" + intGuess; //Converting guess to a String
					//Checking Each Digit
					if(crackMe.checkFirstDigit(guess)) //Checking first digit
					{
						if(crackMe.checkSecondDigit(guess)) //First Digit Correct, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //All Three digits correct
							{
								cont = true;
							}
							else // First and Second digit Correct
							{
								System.out.println(guess.charAt(0) + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else 
						{
							if(crackMe.checkThirdDigit(guess)) //First and Third Digit Correct
							{
								System.out.println(guess.charAt(0) + "_" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only First Digit Correct
							{
								System.out.println(guess.charAt(0) + "_ _");
								guessRemain -= 1;
							}
						}
					}
					else //First Digit Wrong
					{
						if(crackMe.checkSecondDigit(guess))//First Digit Wrong, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First Digit Wrong, Second and Third Digit Correct
							{
								System.out.println("_" + guess.charAt(1) + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only Second Digit correct
							{
								System.out.println("_" + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else //First Digit Wrong, Second Digit Wrong, Checking Third Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First and Second Digit Wrong, Third Digit Correct
							{
								System.out.println("_ _" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //All Three Digits Wrong
							{
								System.out.println("_ _ _");
								guessRemain -= 1;
							}
						}
					}
				}
					else //Invalid input due to non-three digit number
					{
						System.out.println("Error: Not a number between 100 and 999");
						guessRemain -=1;
					}
				}
			else //Invalid input due to non-integer input
			{
				System.out.println("Error: Not a number.");	
				guessRemain -= 1;
				in.nextLine();
			}	
		}	
		
		//Guess 10
		if (cont) 
		{
		}
		else
		{
			System.out.print("You have " + guessRemain + " guesses remaining. Enter a three-digit guess: ");
			if(in.hasNextInt()) //Validating that user has entered an integer
			{
				int intGuess = in.nextInt(); //Taking input as an integer
				if(intGuess >= 100 && intGuess <= 999)  //Validating that user entered 3 digit integer
				{
					String guess = "" + intGuess; //Converting guess to a String
					//Checking Each Digit
					if(crackMe.checkFirstDigit(guess)) //Checking first digit
					{
						if(crackMe.checkSecondDigit(guess)) //First Digit Correct, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //All Three digits correct
							{
								cont = true;
							}
							else // First and Second digit Correct
							{
								System.out.println(guess.charAt(0) + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else 
						{
							if(crackMe.checkThirdDigit(guess)) //First and Third Digit Correct
							{
								System.out.println(guess.charAt(0) + "_" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only First Digit Correct
							{
								System.out.println(guess.charAt(0) + "_ _");
								guessRemain -= 1;
							}
						}
					}
					else //First Digit Wrong
					{
						if(crackMe.checkSecondDigit(guess))//First Digit Wrong, Checking Second Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First Digit Wrong, Second and Third Digit Correct
							{
								System.out.println("_" + guess.charAt(1) + guess.charAt(2));
								guessRemain -= 1;
							}
							else //Only Second Digit correct
							{
								System.out.println("_" + guess.charAt(1) + "_");
								guessRemain -= 1;
							}
						}
						else //First Digit Wrong, Second Digit Wrong, Checking Third Digit
						{
							if(crackMe.checkThirdDigit(guess)) //First and Second Digit Wrong, Third Digit Correct
							{
								System.out.println("_ _" + guess.charAt(2));
								guessRemain -= 1;
							}
							else //All Three Digits Wrong
							{
								System.out.println("_ _ _");
								guessRemain -= 1;
							}
						}
					}
				}
					else //Invalid input due to non-three digit number
					{
						System.out.println("Error: Not a number between 100 and 999");
						guessRemain -=1;
					}
				}
			else //Invalid input due to non-integer input
			{
				System.out.println("Error: Not a number.");	
				guessRemain -= 1;
				in.nextLine();
			}	
		}	
		
		if(cont) //Message displaying they won the game
		{
			System.out.println("You won. The code was " + crackMe.toString());
		}
		else //Message displaying they used up their 10 guesses and lost the game
		{
			System.out.println("You have used up all your guesses. You Lose.");
		}		
	}	
}	


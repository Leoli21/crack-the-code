/***
 * 
 * @author Leo Li
 * Crack the Code Class
 *
 */
public class CrackMe 
{
	private String randomNum;
	
	public CrackMe()
	{
		String randomNumber = "" + (int)(Math.random()*900 + 100);
		randomNum = randomNumber;
	}
	
	public boolean checkFirstDigit(String guess)
	{
		if(guess.charAt(0) == randomNum.charAt(0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean checkSecondDigit(String guess)
	{
		if(guess.charAt(1) == randomNum.charAt(1))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean checkThirdDigit(String guess)
	{
		if(guess.charAt(2) == randomNum.charAt(2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		return "Pin: " + randomNum;
	}
}

import java.util.Random;

public class Die
{
	private int value;
	public Die(){
	}
	
	public int roll()
	{
		Random rand = new Random();
		int num = rand.nextInt(6) + 1;
		value = num;
		return num;
	}
	
	public int getValue()
	{
		return value;
	}
}
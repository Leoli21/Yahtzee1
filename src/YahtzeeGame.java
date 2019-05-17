
public class YahtzeeGame {

	public static void main(String[] args)
	{
		Die die1 = new Die();
		
		for(int i = 0; i < 10; i++)
			System.out.println("roll(): " + die1.roll());
			
		System.out.println("getValue(): " + die1.getValue());
	

	}

}

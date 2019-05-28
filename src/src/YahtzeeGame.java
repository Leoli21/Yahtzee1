
public class YahtzeeGame {

	public static void main(String[] args)
	{
		Die die1 = new Die();
		
		for(int i = 0; i < 10; i++)
			System.out.println("roll(): " + die1.roll());
			
		
		System.out.println("getValue(): " + die1.getValue());
	
		Yahtzee yahtzee = new Yahtzee();
		yahtzee.rollAllDice();
		System.out.println(yahtzee.showDice());
		System.out.println("Get value of die number 3 is " + yahtzee.getADie(3));
		System.out.println(yahtzee.rollADice(3));
		System.out.println(yahtzee.showDice());
		System.out.println("After re-roll the die number 3: " + yahtzee.getADie(3));

	}

}

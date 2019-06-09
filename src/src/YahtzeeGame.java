
public class YahtzeeGame {

	public static void main(String[] args)
	{
		//Die die1 = new Die();
		
		//for(int i = 0; i < 10; i++)
		//	System.out.println("roll(): " + die1.roll());
			
		
		//System.out.println("getValue(): " + die1.getValue());
	
		Yahtzee yahtzee = new Yahtzee();
		//System.out.println(yahtzee.showDice());
		//System.out.println("Get value of die number 3 is " + yahtzee.getADie(3));
		//yahtzee.rollADice(3);
		//yahtzee.rollAllDice();
		//System.out.println(yahtzee.showDice());
		//System.out.println("After re-roll the die number 3: " + yahtzee.getADie(3));
		
		System.out.println(yahtzee.showDice());
		System.out.println(" Ones: " + yahtzee.getScoreOnes());
		System.out.println(" Twos: " + yahtzee.getScoreTwos());
		System.out.println(" Threes: " + yahtzee.getScoreThrees());
		System.out.println(" Fours: " + yahtzee.getScoreFours());
		System.out.println(" Fives: " + yahtzee.getScoreFives());
		System.out.println(" Sixes: " + yahtzee.getScoreSixes());

		
		

	}

}

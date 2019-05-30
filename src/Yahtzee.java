
public class Yahtzee 
{
	private Die[] dice;
	private int [] count;
	
	public Yahtzee()
	{
		dice = new Die[5];
		
		for (int i = 0; i < 5; i++)
			dice[i] = new Die();
	}
	
	public void rollAllDice()
	{
		for(int i = 0; i < 5; i++)
			dice[i].roll();
	}
	
	public void rollADice(int dieNumber)
	{
		dice[dieNumber].roll();
	}
	public int getADie(int dieNumber)
	{
		return dice[dieNumber].getValue();
	}
	public String showDice()
	{
		return "+------+---+---+---+---+---+" + "\n" + "| Dice | 1 | 2 | 3 | 4 | 5 |" + "\n" + "+------+---+---+---+---+---+" + "\n" + "| Face | " + dice[0].getValue() + " | " +  dice[1].getValue() + " | " + dice[2].getValue() + " | " + dice[3].getValue() + " | " + dice[4].getValue() + " | " + "\n" + "+------+---+---+---+---+---+";	
	}
	private int countUp (int value) 
	{
		if (value == 1)
			count[0] += 1;
		else if (value == 2)
			count[1] += 1;
		else if (value == 3)
			count[2] += 1;
		else if (value == 4)
			count[3] += 1;
		else if (value == 5)
			count[4] += 1;
		return value;
		
	}
	
}

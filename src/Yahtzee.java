
public class Yahtzee 
{
	private Die[] dice;
	
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
	
	public void RollADice(int dieNumber)
	{
		dice[dieNumber].roll();
	}
	public int getADie(int dieNumber)
	{
		return dice[dieNumber].getValue();
	}
	public String showDice()
	{
		return "+------+---+---+---+---+---+" + "\n" + "| Dice | 1 | 2 | 3 | 4 | 5 |" + "\n" + "+------+---+---+---+---+---+" + "\n" + "| Face |" + getADie(1) + "|" + getADie(2) + "|" + getADie(3) + "|" + getADie(4) + "|" + getADie(5) + "|" + "\n" + "+------+---+---+---+---+---+";	
	}
	
}

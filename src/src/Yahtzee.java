
public class Yahtzee 
{
	private Die[] dice;
	private int [] count;
	
	public Yahtzee()
	{
		dice = new Die[5];
		
		for (int i = 0; i < 5; i++)
		{
			dice[i] = new Die();
		}

		count = new int[6];
		rollAllDice();
		updateCount();
		printcount();
	}
	

	private void printcount()
	{
		for (int i = 0; i < count.length; i++) 
		{
			System.out.println("Number of " + (i + 1) + "s rolled: " + count[i]);
		}		
	}


	public void rollAllDice()
	{
		for(int i = 0; i < 5; i++)
		{
			dice[i].roll();
		}
	}
	
	public void rollADice(int dieNumber)
	{
		dice[dieNumber-1].roll();

	}
	
	public int getADie(int dieNumber)
	{
		return dice[dieNumber-1].getValue();
	}
	
	public String showDice()
	{
		return "+------+---+---+---+---+---+" + "\n" + "| Dice | 1 | 2 | 3 | 4 | 5 |" + "\n" + "+------+---+---+---+---+---+" + "\n" + "| Face | " + dice[0].getValue() + " | " +  dice[1].getValue() + " | " + dice[2].getValue() + " | " + dice[3].getValue() + " | " + dice[4].getValue() + " | " + "\n" + "+------+---+---+---+---+---+";	
	}
	
	
	private void countUp(int value) 
	{							
				
		if (value == 1)
		{
			count[0] += 1;						
		}
		else if (value == 2)
		{
			count[1]+= 1;						
		}
		else if (value == 3)
		{
			count[2] += 1;					
		}
		else if (value == 4)
		{
			count[3]+= 1;			
		}
		else if (value == 5)
		{
			count[4]+= 1;		
		}
		else if (value == 6)
		{
			count[5] +=1;
		}
	}
	
	private void updateCount()
	{
		//for each dice get the value and update 
		for (int i=1; i<6; i++)
		{
			int value = getADie(i);
			countUp(value);
		}
	
	}
	
	//The Upper Section Scoring
	public int getScoreOnes()
	{
		return count[0] * 1;
	}
	public int getScoreTwos()
	{
		return count[1] * 2;
	}
	public int getScoreThrees()
	{
		return count[2] * 3;
	}
	public int getScoreFours()
	{
		return count[3] * 4;
	}
	public int getScoreFives()
	{
		return count[4] * 5;
	}
	public int getScoreSixes()
	{
		return count[5] * 6;
	}
	
	//The Lower Section Scoring
	
	public int getScoreThreeOfAKind()
	{
		int returnValue = 0;
		for (int i = 0; i < 6; i ++) 
		{
			if(count[i] >= 3)
			{
				  returnValue += getScoreOnes() + getScoreTwos() + getScoreThrees() + getScoreFours() + getScoreFives() + getScoreSixes();
 			}		
			
		}
		return returnValue;
	}
	public int getScoreFourOfAKind()
	{
		int returnValue = 0;
		for (int i = 0; i < 6; i++)
		{
			if(count[i] >= 4)
			{
				returnValue += getScoreOnes() + getScoreTwos() + getScoreThrees() + getScoreFours() + getScoreFives() + getScoreSixes();
			}
		}
		return returnValue;
	}
	
	public int getScoreFullHouse()
	{
		int returnValue = 0;
		for (int i = 0; i < 6; i++)
		{
			if(count[i] == 3 || count[i] == 2)
			{
				for (int j = 0; j < 6; j++)
				{
					if (count [j] == 2 || count[j] == 3)
					{
						returnValue += 25;
					}
				}
			}
		}
		return returnValue;
	}
	public int getScoreSmallStraight()
	{
		for (int i = 0; i < 6; i++)
		{
			
		}
	}
	public int getScoreLargeStraight()
	{
		
	}
	public int getScoreChance()
	{
		return getScoreOnes() + getScoreTwos() + getScoreThrees() + getScoreFours() + getScoreFives() + getScoreSixes();
 	}
	public int getScoreYahtzee()
	{
		int returnValue = 0;
		for (int i = 0; i < 6; i++)
		{
			if(count[i] == 5)
			{
				returnValue += 50;
			}
		}
		return returnValue;
	}
}
	
	


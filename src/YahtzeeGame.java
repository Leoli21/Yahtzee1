import java.util.Scanner;

public class YahtzeeGame {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Yahtzee yahtzee = new Yahtzee();
		//Current Score Card
		System.out.println(yahtzee.getScoreCard());
		
		//Enter die number(s) that user want to keep
		System.out.println("Enter die number(s) to keep (separated by a space): ");
		String dieKeep = input.nextLine();
		for (int i = 0; i <dieKeep.length(); i++)
		{
			//Contain 1 first, and maybe 2, 3, 4, 5
			if (dieKeep.contains("1"))
			{
				if(dieKeep.contains("2"))
				{
					if(dieKeep.contains("3"))
					{
						if (dieKeep.contains("4"))
						{
							if (dieKeep.contains("5"))
							{
								break;
							}
							else
							{
								yahtzee.rollADice(5);
							}
						}
						else
						{
							yahtzee.rollADice(4);
							yahtzee.rollADice(5);
						}
					}
					else
					{
						yahtzee.rollADice(3);
						yahtzee.rollADice(4);
						yahtzee.rollADice(5);
					}
				}
				else
				{
					yahtzee.rollADice(2);
					yahtzee.rollADice(3);
					yahtzee.rollADice(4);
					yahtzee.rollADice(5);
				}
			}
			//Does not contain 1, but does contain 2, 3, 4, or 5
			else if(dieKeep.contains("2"))
			{
				yahtzee.rollADice(1);
				if(dieKeep.contains("3"))
				{
					if(dieKeep.contains("4"))
					{
						if(dieKeep.contains("5"))
						{
							break;
						}
						else
						{
							yahtzee.rollADice(5);
						}
					}
					else
					{
						yahtzee.rollADice(4);
						yahtzee.rollADice(5);
					}
				}
				else
				{
					yahtzee.rollADice(3);
					yahtzee.rollADice(4);
					yahtzee.rollADice(5);
				}
				yahtzee.rollADice(3);
				yahtzee.rollADice(4);
				yahtzee.rollADice(5);
			}
			
			//Does not contain 1 or 2, but does contain 3 or 4 or 5
			else if(dieKeep.contains("3"))
			{
				yahtzee.rollADice(1);
				yahtzee.rollADice(2);
				if(dieKeep.contains("4"))
				{
					if(dieKeep.contains("5"))
					{
						break;
					}
					else
					{
						yahtzee.rollADice(5);
					}
				}
				else
				{
					yahtzee.rollADice(4);
					yahtzee.rollADice(5);
				}
				yahtzee.rollADice(4);
				yahtzee.rollADice(5);
			}
			
			//Does not contain 1,2, or 3, but does contain 4 or 5
			else if(dieKeep.contains("4"))
			{
				yahtzee.rollADice(1);
				yahtzee.rollADice(2);
				yahtzee.rollADice(3);
				if(dieKeep.contains("5"))
				{
					break;
				}
				else
				{
					yahtzee.rollADice(5);
				}
				yahtzee.rollADice(5);
			}
			
			//Does not contain 1,2,3 and 4, but does contain 5
			else if(dieKeep.contains("5"))
			{
				yahtzee.rollADice(1);
				yahtzee.rollADice(2);
				yahtzee.rollADice(3);
				yahtzee.rollADice(4);
			}
		}

		System.out.println(yahtzee.getScoreCard());
		
		//Can reroll one more time
		System.out.println("You can re-roll one more time. Do you want to roll all dice one more time or end your turn?");;
		System.out.println("If you want to end your turn simply enter: 1 2 3 4 5, and if you want to reroll, simply press Enter without entering a number.");
		dieKeep = input.nextLine();
		if(dieKeep.equals("1 2 3 4 5"))
		{
			System.out.println(yahtzee.getScoreCard());
		}
		else if (dieKeep.equals("")) 
		{
			Yahtzee rerollYahtzee = new Yahtzee();
			rerollYahtzee.rollAllDice();
			System.out.println(rerollYahtzee.getScoreCard());
		}
		
		
	}	

}

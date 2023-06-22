package pokemonSim;

import java.util.*;

public class Dice {

	
	int holder;
	public Dice() {
		// TODO Auto-generated constructor stub
	}

	public Dice(int num) {
		this.holder=num;
	}
	
	public boolean checkAcc(int die)
	{
		int roll10 = Randomizer.generateInt(10,100);
		//If the roll is more then the random num then the attack will miss 
		if(roll10>die)
		{
			System.out.println("The attack missed");
			return false;
		}
		//If the roll is less then the random num then the attack will hit 
		if(roll10<=die)
		{
			//System.out.println("Hit!!");
			return true;
		}
		return false;
	}
	
	//The min just tests to see if the code works
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The main is used to test if the code works
		Dice myDie = new Dice();
		int Random = Randomizer.generateInt(10,100);
		System.out.println("You're Accuracy is " + Random);
		for (int i=0;i<25;i++) {
		myDie.checkAcc(Random);
		}
	}

}

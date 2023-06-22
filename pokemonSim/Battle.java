package pokemonSim;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Battle {
	Scanner input= new Scanner(System.in);
	private static CompAi computer = new CompAi();
	private PokeBall poke= new PokeBall();
	private List <Pokemon> playerList= new ArrayList <Pokemon>();
	private String choice;
	public static Pokemon pokemon1 = new Pokemon();
	public static Pokemon pokemon2 = new Pokemon();
	public static Pokemon pokemon3 = new Pokemon();
	
	public Battle() {
		//start();
	}
public void start()
{
	System.out.print("Hello Trainer, Welcome to The Pokemon Battle Simulator!!!" + "\n" + "Before We start what is your Name? ");
	String name = input.nextLine();
	yourName(name);
}

public void yourName(String name)
{
	System.out.print( name + " was it?"+ "\n");
	System.out.print("\t" + "Y or N? ");
	choice = input.nextLine();
	
	if(choice.equals ("Y")|| choice.equals ("y")|| choice.equals("yes")||choice.equals("Yes"))
	{
		System.out.println(name+ "!"+" That's a great Name!");
		selectYourPokemon();
	}
	else
	{
		System.out.print("Well then what is your name? ");	
		 name = input.nextLine();
		yourName(name);
	}
}
	private void selectYourPokemon() 
	{
	try {
		Thread.sleep(1000);
		System.out.println("Now that we got that out of the way, you'll be able to pick a 3 Pokemon of your very own!!!");
		Thread.sleep(1000);
		System.out.println("Here's the list of Pokemon we have in stock!!!");
	}
		 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
		
		pokemonStock();
	}
	
	public void pokemonStock()
	{
		try {

		System.out.println();
		Thread.sleep(1000);
		for (int i=0;i<poke.pokemonList.size();i++) {
			Thread.sleep(100);
		System.out.print(i+1 + ") ");
		System.out.println(poke.pokemonList.get(i));
		}
		}
		 catch (InterruptedException e) {
				
			}
	
		System.out.print("To choose which 3 Pokemon you want, Enter the numbers next to their names:");
		boolean done = false;
		int i=0;
		while(!done)
		{
		try {
			
			for(i=0;i<3;i++) 
			{
			String pick=input.next();
			int choice = Integer.parseInt(pick);
			playerList.add(i,poke.pokemonList.get(choice-1));
			playerList.set(i, poke.pokemonList.get(choice-1));
			System.out.println(2-i + " more to go.");
			}
			done=true;
			}
			catch(Exception e){
				System.out.println("You didn't pick A correct number!! Try pick 3 different Pokemon again!");
				i=0;
				playerList.clear();
			}
		}
		
		
		
		System.out.println("You chose: ");
		System.out.println(playerList);
		System.out.print("Correct? Y/N ");
		
		 choice = input.next();
		
		if(choice.equals ("Y")|| choice.equals ("y")|| choice.equals("yes")||choice.equals("Yes"))
		{
			System.out.println("Great You're ready to battle, but before you do that look over your Pokemon's Moves!");
			showMoves();
		}
		else if(choice.equals ("N")|| choice.equals ("n")|| choice.equals("no")||choice.equals("No"))
		{
			playerList.clear();
			System.out.println("Then we'll go down the list for you again!");	
			pokemonStock();
		}
	}
	private void showMoves() {
		
		 pokemon1 = playerList.get(0);
		 pokemon2 = playerList.get(1);
		 pokemon3 = playerList.get(2);
		
		 
		 try {
			 
		Thread.sleep(1000);	 
		System.out.println("["+pokemon1.getName()+ "]");
		
		Thread.sleep(2000);
		for(int i=0;i<4;i++) {
			
			System.out.println(pokemon1.attackArr[i]);
		}
		
		Thread.sleep(1000);
		System.out.println("["+pokemon2.getName()+ "]");
		
		Thread.sleep(2000);
		for(int i=0;i<4;i++) {
			
			System.out.println(pokemon2.attackArr[i]);
		}
		
		System.out.println("["+pokemon3.getName()+ "]");
		
		Thread.sleep(2000);
		for(int i=0;i<4;i++) {
			
			System.out.println(pokemon3.attackArr[i]);
		}
		
		}
		 
		 catch(Exception e)
		 {}
		 
		System.out.print("Are you done looking it over the moves? Y/N? ");
		
		choice = input.next();
		
		if(choice.equals ("Y")|| choice.equals ("y")|| choice.equals("yes")||choice.equals("Yes"))
		{
			System.out.println("Get ready to battle the Computer!!!");
			System.out.println("The computer sends out " + CompAi.pokemon1.getName()+"!!!");
			
			CompAi.isPkm1=true;
			CompAi.isPkm2=false;
			CompAi.isPkm3=false;
			LetsBattle(pokemon1);
			
		}
		else if(choice.equals ("N")|| choice.equals ("n")|| choice.equals("no")||choice.equals("No"))
		{	
			System.out.println("Here's the list again");
			showMoves();
		}
	}
	
	@SuppressWarnings("static-access")
	private void LetsBattle(Pokemon poke)
	{
		int rand = Randomizer.generateInt(0,3);
		boolean yourSpeed = false;
		boolean pokeAcc = false;
		poke.fainted=false;
		
		 compMonCheck(computer);	
		 enemySpdCheck(yourSpeed, pokeAcc,computer,poke,rand);
		
		
		
		
//		boolean isbattle=true;
		trainerMenu(computer, poke, pokeAcc);
		
		
		
		 if (computer.pokemon1.getHp()<=0)
		 {
//			 computer.isPkm1=false;
//			 computer.isPkm2=true;
//			 computer.isPkm3=false;
			 if(computer.pokemon1.fainted==true)
			 {
				 //this is so the if statement above isn't called each time (for some reason it would go thru even though fainted=true)
			 }
			 
			 else if (computer.pokemon1.fainted==false) {
			 computer.aiList.remove(pokemon1);
			 computer.isPkm1=false;
			 computer.isPkm2=true;
			 System.out.println(computer.pokemon1.getName() + " has fainted!!!");
			 computer.pokemon1.fainted=true;
			 System.out.println("The computer sends out "+ computer.pokemon2.getName() +"!!");
			 }
		 }
		 
		  if (computer.pokemon2.getHp()<=0)
		 {
//			  computer.isPkm1=false;
//			  computer.isPkm2=false;
//			  computer.isPkm3=true;
			 if(computer.pokemon2.fainted=true)
			 {
				 //this is so the if statement isn't called each time
			 }
			 if (computer.pokemon2.fainted=false){
			 System.out.println(computer.pokemon2.getName() + " has fainted!!!");
			 computer.pokemon2.fainted=true;
			 computer.isPkm1=false;
			 computer.isPkm2=false;
			 computer.isPkm3=true;
			 computer.aiList.remove(pokemon2);
			 System.out.println("The computer sends out "+ computer.pokemon3.getName() +"!!");
			 }
		 }
		 
		  if (computer.pokemon3.getHp()<=0)
		 {
//			  computer.isPkm3=false;
//			  computer.isPkm1=false;
//			  computer.isPkm2=false;
			  computer.aiList.remove(pokemon3);
			 if(computer.pokemon3.fainted=true)
			 {
				 //this is so the if statement isn't called each time
			 }
			  if (computer.pokemon3.fainted=false){
			 System.out.println(computer.pokemon3.getName() + " has fainted!!!");
			 computer.pokemon1.fainted=true;
			 computer.isPkm3=false;
			 computer.isPkm1=false;
			 computer.isPkm2=false;
			 System.out.println("The computer has no more Pokemon, YOU WIN!!");
			 }
		 }
		
		
		if(computer.isPkm1==true) {
			rand = Randomizer.generateInt(0,3);
			
			System.out.println("The computer's "+ computer.pokemon1.getName() + " uses " + computer.pokemon1.attackArr[rand].getAtkName());
			
			computer.pokemon1
			.effect(poke, computer.pokemon1.attackArr[rand]);
			computer.pokemon1.attack(poke, computer.pokemon1.attackArr[rand].getNewDmg());
			System.out.println("You took " + computer.pokemon1.attackArr[rand].getNewDmg());
			System.out.println("Your Pokemon Has " + poke.getHp() + "HP remaining!!");
		}
		
		
		else if(computer.isPkm2==true)
		{
			 	rand = Randomizer.generateInt(0,3);
			 	System.out.println("The computer's "+ computer.pokemon2.getName() + " uses " + computer.pokemon2.attackArr[rand].getAtkName());
				
			 	computer.pokemon2.effect(poke, computer.pokemon2.attackArr[rand]);
			 	computer.pokemon2.attack(poke, computer.pokemon2.attackArr[rand].getNewDmg());
				System.out.println("You took " + computer.pokemon2.attackArr[rand].getNewDmg());
				System.out.println("Your Pokemon Has " + poke.getHp() + "HP remaining!!");
				System.out.println();
				pokeAcc=false;
		}
			
		
		else if(computer.isPkm3==true)
		 	{
			 	rand = Randomizer.generateInt(0,3);
			 	System.out.println("The computer's "+ computer.pokemon3.getName() + " uses " + computer.pokemon3.attackArr[rand].getAtkName());
				CompAi.pokemon3.attackArr[rand].checkTheAcc();
				
				if(pokeAcc==true)
				{
				computer.pokemon3.effect(poke, computer.pokemon3.attackArr[rand]);
				computer.pokemon3.attack(poke, computer.pokemon3.attackArr[rand].getNewDmg());
				System.out.println("You took " + computer.pokemon3.attackArr[rand].getNewDmg());
				System.out.println("Your Pokemon Has " + poke.getHp() + "HP remaining!!");
				pokeAcc=false;
				}
				else 
				{
					//The dice class will display that the attack missed
				}
			}
		 
		 if(poke.getHp()<=0)
		 {
			 System.out.println("Your " + poke.getName() + " has fainted!!!");
			 poke.fainted=true;
		 
		 
		 if(poke.fainted==true)
		 {
			 System.out.println("What pokemon will you pick Next?");
			 
			if(pokemon1.fainted==false)
			{
				System.out.print(pokemon1.getName() + "\t");
			}
			
			 if(pokemon2.fainted==false)
			{
				System.out.print(pokemon2.getName()+ "\t");
			}
			
			 if(pokemon3.fainted==false)
			{
				System.out.print(pokemon3.getName()+ "\t");	
			}
			
			choice=input.next();
			
			if (choice.equals(pokemon2.getName()))
			{
				LetsBattle(pokemon2);
			}
			
			else if (choice.equals(pokemon3.getName()))
			{
				LetsBattle(pokemon3);
			}
			
			else if (choice.equals(pokemon1.getName()))
			{
				LetsBattle(pokemon1);
			}
		 }
		}
		}
	
	

public void compMonCheck(CompAi computer)
{
	if (computer.pokemon1.getHp()<=0)
		 {
			 computer.isPkm1=false;
			 if (computer.pokemon1.fainted==false) 
			 {
				computer.pokemon1.fainted=true;
			 	computer.isPkm1=false;
			 	computer.isPkm2=true;
			 	computer.aiList.remove(pokemon1);
			 }
		 }
		 
		  if (computer.pokemon2.getHp()<=0)
		 {

			  computer.isPkm2=false;

			
			 if (computer.pokemon2.fainted=false){
			 computer.pokemon2.fainted=true;
			 computer.isPkm1=false;
			 computer.isPkm2=false;
			 computer.isPkm3=true;
			 computer.aiList.remove(pokemon2);
			 }
		 }
		 
		  if (computer.pokemon3.getHp()<=0)
		 {

			  computer.isPkm2=false;
			  
			  
			  if (computer.pokemon3.fainted=false){
			 System.out.println(computer.pokemon3.getName() + " has fainted!!!");
			 computer.pokemon1.fainted=true;
			 computer.isPkm3=false;
			 computer.isPkm1=false;
			 computer.isPkm2=false;
			 computer.aiList.remove(pokemon3);
			 System.out.println("The computer has no more Pokemon, YOU WIN!!");
			 }
		 }

		 
		if(computer.isPkm1==true) 
		{
			System.out.println(computer.pokemon1.getName() + "\t"+ computer.pokemon1.getHp());
		}
		
		else if(computer.isPkm2==true) 
		{
			System.out.println(computer.pokemon2.getName() + "\t"+ computer.pokemon2.getHp());
		}
		else if (computer.isPkm3==true) 
		{
			System.out.println(computer.pokemon3.getName() + "\t"+ computer.pokemon3.getHp());
		}
}

	private void enemySpdCheck(boolean yourSpeed, boolean pokeAcc,CompAi computer, Pokemon poke, int rand)
	{
		System.out.println("You send out " + poke.getName() + "!!!");
		System.out.println(poke.getName() + "\t"+ poke.getHp());
		System.out.println("Let's compare who's faster");
		
		if(computer.isPkm1=true) 
		{
		yourSpeed=poke.compareSpd(computer.pokemon1);
		
		if(yourSpeed=true) 
		{
		System.out.println("You're faster then the computer");
		}
		else if (yourSpeed=false) 
		{
			System.out.println("The computer is faster then you");
			System.out.println("The computer's "+ computer.pokemon1.getName() + " uses " + computer.pokemon1.attackArr[rand].getAtkName());
			pokeAcc=computer.pokemon1.attackArr[rand].checkTheAcc();
			
			if(pokeAcc=true)
			{
			computer.pokemon1.attack(poke, computer.pokemon1.attackArr[rand].getNewDmg());
			System.out.println("You took " + computer.pokemon1.attackArr[rand].getNewDmg());
			System.out.println("Your Pokemon Has " + poke.getHp() + "HP remaining!!");
			pokeAcc=false;
			}
			else 
			{
				//The dice class will display that the attack missed
			}
		}
		}
		else if(computer.isPkm2==true)
		{
			poke.compareSpd(computer.pokemon2);
			if(yourSpeed=true) 
			{
			System.out.println("You're faster then the computer");
			}
			else if (yourSpeed==false) 
			{
				System.out.println("The computer is faster then you");
				System.out.println("The computer's "+ computer.pokemon2.getName() + " uses " + computer.pokemon1.attackArr[rand].getAtkName());
				pokeAcc= computer.pokemon2.attackArr[rand].checkTheAcc();
				if(pokeAcc==true) 
				{
				computer.pokemon2.attack(poke, computer.pokemon2.attackArr[rand].getNewDmg());
				System.out.println("You took " + computer.pokemon2.attackArr[rand].getNewDmg());
				System.out.println("Your Pokemon Has " + poke.getHp() + "HP remaining!!");
				pokeAcc=false;
				}
				
				else 
				{
					//The dice class will display that the attack missed
				}
			}
			
		}
		else if(computer.isPkm3==true)
		{
			poke.compareSpd(computer.pokemon3);
			
			if(yourSpeed=true) 
			{
			System.out.println("You're faster then the computer");
			}
			
			else if (yourSpeed=false) 
			{
				System.out.println("The computer is faster then you");
				System.out.println("The computer's "+ computer.pokemon3.getName() + " uses " + computer.pokemon1.attackArr[rand].getAtkName());
				pokeAcc=computer.pokemon3.attackArr[rand].checkTheAcc();
				if(pokeAcc=true)
				{
				computer.pokemon3.attack(poke, computer.pokemon3.attackArr[rand].getNewDmg());
				System.out.println("You took " + computer.pokemon3.attackArr[rand].getNewDmg());
				System.out.println("Your Pokemon Has " + poke.getHp() + "HP remaining!!");
				pokeAcc=false;
				}
				
				else 
				{
					//The dice class will display that the attack missed
				}
			}
		}
	}

	 public void trainerMenu(CompAi computer, Pokemon poke, boolean pokeAcc)
	{
		while(!computer.aiList.isEmpty()) 
		{
			compMonCheck(computer);	
		 	enemySpdCheck(yourSpeed, pokeAcc,computer,poke,rand);
			System.out.println("Your Pokemon: " + poke.getName() + "\t"+ poke.getHp() + "HP" + "\t" 
			);
		System.out.println("What will you do??" + "\t" +"1) Attack?" + " or" + "\t" + "2) Switch Pokemon?" + " (You can also use A(Attack) or S(Switch))");
		choice = input.next();
		
		
		if (choice.equals("1")||choice.equals("A")||choice.equals("a"))
		{
			System.out.println("What attack will you use??");
			System.out.println("1 "+poke.attackArr[0]);
			System.out.println("2 "+poke.attackArr[1]);
			System.out.println("3 "+poke.attackArr[2]);
			System.out.println("4 "+poke.attackArr[3]);
			
			
			choice = input.next();
			if(choice.equals("1"))
			{
				pokeAcc=poke.attackArr[0].checkTheAcc();
				if(pokeAcc=true)
				{
					if(computer.isPkm1==true) 
					{
						poke.effect(computer.pokemon1, poke.attackArr[0]);
						poke.attack(computer.pokemon1, poke.attackArr[0].getNewDmg());
						System.out.println("The computer took " + poke.attackArr[0].getNewDmg());
						System.out.println("They Have " + computer.pokemon1.getHp() + "HP remaining!!");
						pokeAcc=false;
					}
					
					 if(computer.isPkm2==true) {
						poke.effect(computer.pokemon2, poke.attackArr[0]);
						poke.attack(computer.pokemon2, poke.attackArr[0].getNewDmg());
						System.out.println("The computer took " + poke.attackArr[0].getNewDmg());
						System.out.println("They Have " + computer.pokemon2.getHp() + "HP remaining!!");
						pokeAcc=false;
					}
					 if(computer.isPkm3==true) {
						poke.effect(computer.pokemon3, poke.attackArr[0]);
						poke.attack(computer.pokemon3, poke.attackArr[0].getNewDmg());
						System.out.println("The computer took " + poke.attackArr[0].getNewDmg());
						System.out.println("They Have " + computer.pokemon3.getHp() + "HP remaining!!");
						pokeAcc=false;
					}
				}
				
				else
				{
					
				}
			}
			else if (choice.equals("2"))
			{
				pokeAcc=poke.attackArr[1].checkTheAcc();
				if(pokeAcc=true)
				{
					if(computer.isPkm1==true) 
					{
						poke.effect(computer.pokemon1, poke.attackArr[1]);
						poke.attack(computer.pokemon1, poke.attackArr[1].getNewDmg());
						System.out.println("The computer took " + poke.attackArr[1].getNewDmg());
						System.out.println("They Have " + computer.pokemon1.getHp() + "HP remaining!!");
						pokeAcc=false;
					}
					
					 if(computer.isPkm2==true) {
						poke.effect(computer.pokemon2, poke.attackArr[1]);
						poke.attack(computer.pokemon2, poke.attackArr[1].getNewDmg());
						System.out.println("The computer took " + poke.attackArr[1].getNewDmg());
						System.out.println("They Have " + computer.pokemon2.getHp() + "HP remaining!!");
						pokeAcc=false;
					}
					 if(computer.isPkm3==true) {
						poke.effect(computer.pokemon3, poke.attackArr[1]);
						poke.attack(computer.pokemon3, poke.attackArr[1].getNewDmg());
						System.out.println("The computer took " + poke.attackArr[1].getNewDmg());
						System.out.println("They Have " + computer.pokemon3.getHp() + "HP remaining!!");
						pokeAcc=false;
					}
					
			}
				else
				{
					
				}
			}
			else if (choice.equals("3"))
			{
				pokeAcc=poke.attackArr[2].checkTheAcc();
				if(pokeAcc=true)
				{
					if(computer.isPkm1==true) 
					{
						poke.effect(computer.pokemon1, poke.attackArr[2]);
						poke.attack(computer.pokemon1, poke.attackArr[2].getNewDmg());
						System.out.println("The computer took " + poke.attackArr[2].getNewDmg());
						System.out.println("They Have " + computer.pokemon1.getHp() + "HP remaining!!");
						pokeAcc=false;
					}
					
					 if(computer.isPkm2==true) {
						poke.effect(computer.pokemon2, poke.attackArr[2]);
						poke.attack(computer.pokemon2, poke.attackArr[2].getNewDmg());
						System.out.println("The computer took " + poke.attackArr[2].getNewDmg());
						System.out.println("They Have " + computer.pokemon2.getHp() + "HP remaining!!");
						pokeAcc=false;
					}
					 if(computer.isPkm3==true) {
						poke.effect(computer.pokemon3, poke.attackArr[2]);
						poke.attack(computer.pokemon3, poke.attackArr[2].getNewDmg());
						System.out.println("The computer took " + poke.attackArr[2].getNewDmg());
						System.out.println("They Have " + computer.pokemon3.getHp() + "HP remaining!!");
						pokeAcc=false;
					}
			}
				
				else
				{
					
				}
		}	
			
			else if(choice.equals("4"))
			{
				pokeAcc=poke.attackArr[3].checkTheAcc();
				if(pokeAcc=true)
				{
					if(computer.isPkm1==true) 
					{
						poke.effect(computer.pokemon1, poke.attackArr[3]);
						poke.attack(computer.pokemon1, poke.attackArr[3].getNewDmg());
						System.out.println("The computer took " + poke.attackArr[3].getNewDmg());
						System.out.println("They Have " + computer.pokemon1.getHp() + "HP remaining!!");
						pokeAcc=false;
					}
					
					 if(computer.isPkm2==true) {
						poke.effect(computer.pokemon2, poke.attackArr[3]);
						poke.attack(computer.pokemon2, poke.attackArr[3].getNewDmg());
						System.out.println("The computer took " + poke.attackArr[3].getNewDmg());
						System.out.println("They Have " + computer.pokemon2.getHp() + "HP remaining!!");
						pokeAcc=false;
					}
					 if(computer.isPkm3==true) {
						poke.effect(computer.pokemon3, poke.attackArr[3]);
						poke.attack(computer.pokemon3, poke.attackArr[3].getNewDmg());
						System.out.println("The computer took " + poke.attackArr[3].getNewDmg());
						System.out.println("They Have " + computer.pokemon3.getHp() + "HP remaining!!");
						pokeAcc=false;
					}
				}
				
				else
				{
					
				}
			}
		}
				
		
//			System.out.println("Remaining Health on the computer's Pokemon:" + computer.pokemon1.getHp());
//			System.out.println();
		
		else if(choice.equals("2")||choice.equals("S")||choice.equals("s"))
		{
			System.out.println("Who do you want to switch in?  (Type in their names)");
			
			if(poke == pokemon1)
			{
				if(pokemon2.fainted==true && pokemon3.fainted==true)
				{
					System.out.print("You can't switch to any pokeomn!");
				}
				 else if(pokemon2.fainted=true)
					{
					 System.out.println(pokemon3.getName());
					 choice = input.next();
					}
				 
				 else if(pokemon3.fainted==true)
					{
						System.out.println(pokemon2.getName());
						choice = input.next();
					}
				 else {
			System.out.println(pokemon2.getName()+"\t" + pokemon3.getName());
				choice = input.next();
				 }
			}
			
			else if(poke==pokemon2) 
			{
				if(pokemon1.fainted==true && pokemon3.fainted==true)
				{
					System.out.print("You can't switch to any pokeomn!");
				}
				 else if(pokemon1.fainted=true)
					{
					 System.out.println(pokemon3.getName());
					 choice = input.next();
					}
				 
				 else if(pokemon3.fainted=true)
					{
						System.out.println(pokemon1.getName());
						choice = input.next();
					}
				 else {
			System.out.println(pokemon2.getName()+"\t" + pokemon3.getName());
				choice = input.next();
				 }
				
			}
				
		
			
			else if (poke==pokemon3)
			{	
				 if(pokemon2.fainted==true && pokemon1.fainted==true)
				{
					System.out.print("You can't switch to any pokeomn!");
				}
				 else if(pokemon1.fainted==true)
					{
					 System.out.println(pokemon2.getName());
					 choice = input.next();
					}
				 
				 else if(pokemon2.fainted==true)
					{
						System.out.println(pokemon1.getName());
						choice = input.next();
					}
				 else {
			System.out.println(pokemon1.getName()+"\t" + pokemon2.getName());
				choice = input.next();
				 }
			}
			
			if (choice.equals(pokemon2.getName()))
			{
				LetsBattle(pokemon2);
			}
			
			else if(choice.equals(pokemon3.getName()))
			{
				LetsBattle(pokemon3);
			}
			
		}
	  }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Battle battle = new Battle();
		//boolean isBattle= false;
		
		battle.start();
		
	}

}
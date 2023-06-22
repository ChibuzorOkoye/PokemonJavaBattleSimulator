package pokemonSim;

import java.util.ArrayList;
import java.util.List;

public class CompAi {
	
private PokeBall list = new PokeBall();
public static List <Pokemon> aiList= new ArrayList<Pokemon>();
public static Pokemon pokemon1 = new Pokemon();
public static Pokemon pokemon2 = new Pokemon();
public static Pokemon pokemon3 = new Pokemon();
public static boolean isPkm1 = false;
public static boolean isPkm2 = false;
public static boolean isPkm3 = false;
	public CompAi() {
		selectPokemon();
	}

	public void selectPokemon()
	{		int roll = 0;
	int dice = Randomizer.generateInt(0,list.pokemonList.size()-1);
		for (int i=0;i<3;i++)
		{
		   dice = Randomizer.generateInt(0,list.pokemonList.size()-1);
			
			if(roll==dice) {
			    dice = Randomizer.generateInt(0,list.pokemonList.size()-1);
				aiList.add(i,list.pokemonList.get(dice));
			}
			aiList.add(i,list.pokemonList.get(dice));
		    roll = dice;
		}
		pokemon1 = aiList.get(0);
		pokemon2 = aiList.get(1);
		pokemon3 = aiList.get(2);
		
	}
	
	
	public void checkType(Pokemon poke)
	{
		String mon = String.valueOf(poke.PokeType.getType());
		String botPkm1 = String.valueOf(pokemon1.PokeType.getType());
		String botPkm2 = String.valueOf(pokemon2.PokeType.getType());
		String botPkm3 = String.valueOf(pokemon3.PokeType.getType());
		
		Type myCheck= new Type(mon);
		Type bot1= new Type(botPkm1);
		Type bot2= new Type(botPkm2);
		Type bot3= new Type(botPkm3);
		
		
		if(isPkm1==true && isPkm2 == false && isPkm3 == false)
		{
			int num = myCheck.compareTypes(bot1.objType);
			System.out.println(num);
		}
		else if(isPkm2==true && isPkm1==false && isPkm3 == false)
		{
			int num = myCheck.compareTypes(bot2.objType);
			System.out.println(num);
		}
		else if(isPkm3==true && isPkm1==false && isPkm2 == false)
		{
			int num = myCheck.compareTypes(bot3.objType);
			System.out.println(num);
		}
		
//		System.out.println();
		//int num = check.compareTypes(poke.getType());
	}
	
	
//	public void atkPlr(Pokemon mon)
//	{
//		
//	}
	
	public static void main(String[] args) 
	{
		isPkm3=true;
		// TODO Auto-generated method stub
		CompAi myAi= new CompAi();
		
		System.out.println(myAi.aiList);
//		System.out.println(myAi.pokemon1.PokeType.getType());
		Pokemon water = new Pokemon ("Water",150,100,75,60,95,87, "Water");
		myAi.checkType(water);
		
	}

}

package pokemonSim;

import java.util.ArrayList;
import java.util.List;

public class PokeBall {

 List <Pokemon> pokemonList= new ArrayList<Pokemon>();
	public PokeBall() {
		// TODO Auto-generated constructor stub
		  
		addtoList();
	}
//adds the pokemon into a list when an instance is created
	public void addtoList() 
	{
		  Pokemon Charizard = new Pokemon("Charizard",200,120,200,160,180,90, "Fire");
		  Charizard.attackArr[0]= new Attacks("FlameThrower","Fire",90,100);
		  Charizard.attackArr[1]= new Attacks("Flare Bltiz","Fire",120,85);
		  Charizard.attackArr[2]= new Attacks("Slash","Normal",70,100);
		  Charizard.attackArr[3]= new Attacks("Fly","Flying",65,100);
		  
		  Pokemon Venisaur = new Pokemon ("Venisaur",200,110,200,159,175,60, "Grass");
		  Venisaur.attackArr[0]= new Attacks("Frenzy Plant","Grass",120,80);
		  Venisaur.attackArr[1]= new Attacks("Razor Leaf","Grass",60,100);
		  Venisaur.attackArr[2]= new Attacks("Vine Whip","Grass",50,100);
		  Venisaur.attackArr[3]= new Attacks("Stomp","Normal",60,100);
		  
		  Pokemon Blastoise = new Pokemon ("Blastoise",200,100,250,190,210,55, "Water");
		  Blastoise.attackArr[0]= new Attacks("Surf","Water",70,100);
		  Blastoise.attackArr[1]= new Attacks("Hydro Pump","Water",100,90);
		  Blastoise.attackArr[2]= new Attacks("Water Pulse","Water",80,100);
		  Blastoise.attackArr[3]= new Attacks("Take Down","Normal",75,85);
		  
		  Pokemon Beedrill = new Pokemon ("Beedrill",150,85,90,115,110,75, "Bug");
		  Beedrill.attackArr[0]= new Attacks("X-Scissor","Bug",70,100);
		  Beedrill.attackArr[1]= new Attacks("Poison Jab","Poison",80,100);
		  Beedrill.attackArr[2]= new Attacks("Sludge Bomb","Poison",75,100);
		  Beedrill.attackArr[3]= new Attacks("Slash","Normal",70,100);
		  
		  Pokemon Pidgeot = new Pokemon ("Pidgeot",170,100,95,98,1105,95, "Flying");
		  Pidgeot.attackArr[0]= new Attacks("Fly","Flying",65,100);
		  Pidgeot.attackArr[1]= new Attacks("Aerial Ace","Flying",80,100);
		  Pidgeot.attackArr[2]= new Attacks("Wing Attack","Flying",60,100);
		  Pidgeot.attackArr[3]= new Attacks("Peck","Flying",50,100);
		  
		  Pokemon Pikachu = new Pokemon ("Pikachu",125,100,85,190,210,55, "Electric");
		  Pikachu.attackArr[0]= new Attacks("Thunderbolt","Electric",85,100);
		  Pikachu.attackArr[1]= new Attacks("Thunder","Electric",120,70);
		  Pikachu.attackArr[2]= new Attacks("Quick Attack","Normal",45,100);
		  Pikachu.attackArr[3]= new Attacks("Spark","Electric",50,100);
		  
		  Pokemon Sandslash = new Pokemon ("Sandslash",160,100,185,105,180,75, "Ground");
		  Sandslash.attackArr[0]= new Attacks("Earthquake","Ground",100,100);
		  Sandslash.attackArr[1]= new Attacks("Slash","Normal",70,100);
		  Sandslash.attackArr[2]= new Attacks("Quick Attack","Normal",45,100);
		  Sandslash.attackArr[3]= new Attacks("Dig","Ground",60,100);
		  
		  
		  Pokemon Nidoking = new Pokemon ("Nidoking",180,108,175,150,190,65, "Poison");
		  Nidoking.attackArr[0]= new Attacks("Earthquake","Ground",100,100);
		  Nidoking.attackArr[1]= new Attacks("Slash","Normal",70,100);
		  Nidoking.attackArr[2]= new Attacks("Poison Jab","Poison",80,100);
		  Nidoking.attackArr[3]= new Attacks("Sludge Bomb","Poison",75,100);
		  
		  Pokemon Nidoqueen = new Pokemon ("Nidoqueen",170,106,175,145,185,60, "Poison");
		  Nidoqueen.attackArr[0]= new Attacks("Earthquake","Ground",100,100);
		  Nidoqueen.attackArr[1]= new Attacks("Slash","Normal",70,100);
		  Nidoqueen.attackArr[2]= new Attacks("Poison Jab","Normal",80,100);
		  Nidoqueen.attackArr[3]= new Attacks("Body Slam","Normal",70,100);
		  
		  Pokemon Archanine = new Pokemon ("Archanine",185,110,135,155,165,80, "Fire");
		  Archanine.attackArr[0]= new Attacks("FlameThrower","Fire",90,100);
		  Archanine.attackArr[1]= new Attacks("Bite","Dark",70,100);
		  Archanine.attackArr[2]= new Attacks("Headbutt","Normal",65,100);
		  Archanine.attackArr[3]= new Attacks("Body Slam","Normal",70,100);
		  
		  Pokemon Poliwrath = new Pokemon ("Poliwrath",175,115,175,145,185,80, "Water");
		  Poliwrath.attackArr[0]= new Attacks("Brick Break","Fighting",70,100);
		  Poliwrath.attackArr[1]= new Attacks("Dynamic Punch","Fighting",120,50);
		  Poliwrath.attackArr[2]= new Attacks("Surf","Water",70,100);
		  Poliwrath.attackArr[3]= new Attacks("Hydro Pump","Water",100,90);
		  
		  Pokemon Alakazam = new Pokemon ("Alakazam",170,100,80,185,85,90, "Psychic");
		  Alakazam.attackArr[0]= new Attacks("Psychic","Psychic",90,100);
		  Alakazam.attackArr[1]= new Attacks("Confusion","Psychic",60,100);
		  Alakazam.attackArr[2]= new Attacks("Psybeam","Psychic",70,100);
		  Alakazam.attackArr[3]= new Attacks("ShadowBall","Ghost",75,100);
		  
		  Pokemon Machamp = new Pokemon ("Machamp",185,125,110,105,115,70, "Fighting");
		  Machamp.attackArr[0]= new Attacks("Seismic Toss","Fighting",100,60);
		  Machamp.attackArr[1]= new Attacks("Brick Break","Fighting",70,100);
		  Machamp.attackArr[2]= new Attacks("Vital throw","Fighting",80,100);
		  Machamp.attackArr[3]= new Attacks("Dynamic Punch","Fighting",120,50);
		  
		  Pokemon Golem = new Pokemon ("Golem",200,95,200,85,185,40, "Rock");
		  Golem.attackArr[0]= new Attacks("Stone Edge","Rock",110,95);
		  Golem.attackArr[1]= new Attacks("Earthquake","Ground",100,100);
		  Golem.attackArr[2]= new Attacks("Rock Throw","Rock",70,80);
		  Golem.attackArr[3]= new Attacks("Body Slam","Normal",70,100);
		  
		  Pokemon Rapidash = new Pokemon ("Rapidash",170,120,80,140,85,90, "Fire");
		  Rapidash.attackArr[0]= new Attacks("FlameThrower","Fire",90,100);
		  Rapidash.attackArr[1]= new Attacks("Flare Blitz","Fire",120,85);
		  Rapidash.attackArr[2]= new Attacks("Stomp","Normal",60,100);
		  Rapidash.attackArr[3]= new Attacks("HeadButt","Normal",65,100);
		  
		  Pokemon Magneton = new Pokemon ("Magneton",180,100,160,125,165,50, "Electric");
		  Magneton.attackArr[0]= new Attacks("Thunderbolt","Electric",85,100);
		  Magneton.attackArr[1]= new Attacks("Spark","Electric",50,100);
		  Magneton.attackArr[2]= new Attacks("Flash Cannon","Steel",80,100);
		  Magneton.attackArr[3]= new Attacks("Magnet Bomb","Steel",60,100);
		  
		  Pokemon Gengar = new Pokemon ("Gengar",190,100,100,175,170,70, "Poison");
		  Gengar.attackArr[0]= new Attacks("Poison Jab","Poison",80,100);
		  Gengar.attackArr[1]= new Attacks("Confusion","Psychic",60,100);
		  Gengar.attackArr[2]= new Attacks("Sludge Bomb","Poison",75,100);
		  Gengar.attackArr[3]= new Attacks("ShadowBall","Ghost",100,75);
		  
		  Pokemon Hypno = new Pokemon ("Hypno",170,90,80,180,80,85, "Psychic");
		  Hypno.attackArr[0]= new Attacks("Psychic","Psychic",90,100);
		  Hypno.attackArr[1]= new Attacks("Confusion","Psychic",60,100);
		  Hypno.attackArr[2]= new Attacks("Psybeam","Psychic",70,100);
		  Hypno.attackArr[3]= new Attacks("ShadowBall","Ghost",100,75);
		  
		  Pokemon Gyarados = new Pokemon ("Gyarados",200,120,100,135,115,85, "Water");
		  Gyarados.attackArr[0]= new Attacks("Surf","Water",70,100);
		  Gyarados.attackArr[1]= new Attacks("Hydro Pump","Water",100,90);
		  Gyarados.attackArr[2]= new Attacks("Water Pulse","Water",80,100);
		  Gyarados.attackArr[3]= new Attacks("Hyper Beam","Normal",100,100);
		  
		  Pokemon Snorlax = new Pokemon ("Snorlax",200,90,180,85,185,30, "Normal");
		  Snorlax.attackArr[0]= new Attacks("Earthquake","Ground",100,100);
		  Snorlax.attackArr[1]= new Attacks("Slash","Normal",70,100);
		  Snorlax.attackArr[2]= new Attacks("Body Slam","Normal",70,100);
		  Snorlax.attackArr[3]= new Attacks("Hyper Beam","Normal",100,100);
		  
		  Pokemon Hitmonlee = new Pokemon ("Hitmonlee",150,100,75,60,95,87, "Fighting");
		  Hitmonlee.attackArr[0]= new Attacks("Blaze Kick","Fire",60,100);
		  Hitmonlee.attackArr[1]= new Attacks("Brick Break","Fighting",70,100);
		  Hitmonlee.attackArr[2]= new Attacks("High Jump Kick","Fighting",100,70);
		  Hitmonlee.attackArr[3]= new Attacks("Dynamic Punch","Fighting",120,50);
		  
		  Pokemon Hitmonchan = new Pokemon ("Hitmonchan",150,95,85,60,95,77, "Fighting");
		  Hitmonchan.attackArr[0]= new Attacks("Mach Punch","Fighting",60,100);
		  Hitmonchan.attackArr[1]= new Attacks("Brick Break","Fighting",70,100);
		  Hitmonchan.attackArr[2]= new Attacks("Vital throw","Fighting",80,100);
		  Hitmonchan.attackArr[3]= new Attacks("Dynamic Punch","Fighting",120,50);
		
		pokemonList.add(0,Charizard);
		pokemonList.add(1,Venisaur);
		pokemonList.add(2,Blastoise);
		pokemonList.add(3,Beedrill);
		pokemonList.add(4,Pidgeot);
		pokemonList.add(5,Pikachu);
		pokemonList.add(6,Sandslash);
		pokemonList.add(7,Nidoking);
		pokemonList.add(8,Nidoqueen);
		pokemonList.add(9,Archanine);
		pokemonList.add(10,Poliwrath);
		pokemonList.add(11,Alakazam);
		pokemonList.add(12,Machamp);
		pokemonList.add(13,Golem);
		pokemonList.add(14,Rapidash);
		pokemonList.add(15,Magneton);
		pokemonList.add(16,Gengar);
		pokemonList.add(17,Hypno);
		pokemonList.add(18,Gyarados);
		pokemonList.add(19,Snorlax);
		pokemonList.add(20,Hitmonlee);
		pokemonList.add(21,Hitmonchan);
	}
	
	
	public static void main(String[] args) {
		PokeBall Pokeballs= new PokeBall();
	System.out.println(Pokeballs.pokemonList);
	}

}

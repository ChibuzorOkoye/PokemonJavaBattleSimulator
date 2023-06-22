package pokemonSim;

public class Pokemon {
	@Override
	public String toString() {
		return Name +" [" +"Type " + "("+ PokeType.getType() + ")"+" HP: " + HP + " Atk: " + ATTACK + " Def: " + DEFENSE 
				+ " Sp.Atk: " + SPATTACK + " Sp.Def: " + SPDEFENSE + " Speed: " + SPEED + "]"+ "\n";
	}
	// The variables of The Pokemon class
	private String Name;
	private  int HP = 0;
	private  int ATTACK = 0;
	private  int DEFENSE = 0;
	private  int SPATTACK = 0;
	private  int SPDEFENSE = 0;
	private  int SPEED = 0;
	public  Type PokeType = new Type();
	public  Attacks attackArr[] = new Attacks[4];
	public boolean fainted;
	//private Attacks attacktypes= new Attacks();
	
	
	
	public String getName() {
		return Name;
		
	}
	/**
	 * @return the hp
	 */
	
	public  void setHp(int hp) {
		this.HP= hp;
		if (this.HP<=0)
		{
			this.HP=0;
		}
	}
	public  int getHp() {
		return HP;
	}

	/**
	 * @return the attack
	 */
	public  int getAttack() {
		return ATTACK;
	}

	/**
	 * @return the defense
	 */
	public  int getDefense() {
		return DEFENSE;
	}

	/**
	 * @return the spattack
	 */
	public  int getSpattack() {
		return SPATTACK;
	}

	/**
	 * @return the spdefense
	 */
	public  int getSpdefense() {
		return SPDEFENSE;
	}

	/**
	 * @return the speed
	 */
	public  int getSpeed() {
		return SPEED;
	}
	
	
	public boolean compareSpd(Pokemon mon)
	{
		int spd= getSpeed();
		int comspd = mon.getSpeed();
		if (spd>=comspd)
		{
			return true;
		}
		else
		return false;
	}
	
	public void attack(Pokemon pokemon, int dmg)
	{
		pokemon.setHp(pokemon.getHp()-dmg);
	}
	
	
//	public int setgetDmg()Eff(int atkgetDmg())
//	{
//		int getDmg()effect;
//		getDmg()effect=(ATTACK/DEFENSE)*atkgetDmg();
//		return getDmg()effect;
//	}
	
	public void effect(Pokemon poke, Attacks atk)
	{	
		int dmg;
		int effect=atk.Attacktype.compareTypes(poke.PokeType.objType);
		
		if(effect==3)
		{
			dmg=atk.superEffective(atk.getDmg());
			atk.setNewDmg(dmg);
			//System.out.println(atk.getNewDmg());
		}
		else if(effect==2)
		{
			dmg=atk.notEffective(atk.getDmg());
			atk.setNewDmg(dmg);
		}
		else
		{
			//nothing happens and the attack does Normal getDmg()
			atk.setDmg(atk.getDmg());
		}
	}
	
	public Pokemon() {
		// TODO Auto-generated constructor stub
	}
	// the constructor sets the values of each Pokemon when an instance is created with variables
	public Pokemon(String name, int hp, int atk, int def, int spatk, int spdef, int speed, String pokeType) {
		this.Name=name;
		this.HP = hp;
		this.ATTACK = atk;
		this.DEFENSE = def;
		this.SPATTACK = spatk;
		this.SPDEFENSE = spdef;
		this.SPEED = speed;
		this.PokeType= new Type(pokeType);
		// TODO Auto-generated constructor stub
	}
	
	public  static void main(String[] args) {
		// TODO Auto-generated method stub

		//The main is used to test if the code works
		Pokemon Charizard = new Pokemon ("Charizard",250,120,200,160,180,90, "Fire");
		Charizard.attackArr[0]= new Attacks("FlameThrower","Fire",90,100);
		  Charizard.attackArr[1]= new Attacks("Flare Bltiz","Fire",120,85);
		  Charizard.attackArr[2]= new Attacks("Slash","Normal",70,100);
//		System.out.println(Charizard);
		Pokemon Venisaur = new Pokemon ("Venisaur",300,120,200,159,175,60, "Grass");
//		System.out.println(Venisaur);
		Pokemon Blastoise = new Pokemon ("Blastoise",200,100,250,190,210,55, "Water");
//		System.out.println(Blastoise);
		Pokemon Alakazam = new Pokemon ();
		Alakazam.attackArr[0]= new Attacks("Psychic","Psychic",100,80);
		Alakazam.attackArr[1]= new Attacks("Confusion","Psychic",90,60);
		Alakazam.attackArr[2]= new Attacks("Psybeam","Psychic",100,70);
		Alakazam.attackArr[3]= new Attacks("ShadowBall","Ghost",100,75);
//		for (int i=0;i<4;i++)
//		{
//			System.out.println(Alakazam.attackArr[i]);
//			Alakazam.attackArr[i].checkTheAcc();
//		}
		System.out.println(Venisaur.getHp());
		Charizard.effect(Venisaur,Charizard.attackArr[0]);
		Charizard.attack(Venisaur, Charizard.attackArr[0].getNewDmg());
		System.out.println(Venisaur.getHp());
		
		Charizard.effect(Venisaur,Charizard.attackArr[0]);
		Charizard.attack(Venisaur,Charizard.attackArr[0].getNewDmg());
		System.out.println(Venisaur.getHp());
		
		
	}
	
}

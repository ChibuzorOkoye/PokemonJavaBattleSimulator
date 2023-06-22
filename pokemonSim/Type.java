package pokemonSim;

//the enum functions as Rock-Paper-Scissors
//each type has their own weaknesses and strengths
enum diffTypes
{
	Fire, 
	Water,
	Grass,
	Normal,
	Fighting,
	Rock,
	Ground,
	Electric,
	Dark,
	Poison,
	Ice,
	Dragon,
	Psychic,
	Bug,
	Flying,
	Steel,
	Ghost,
	Fairy
}

//creates an instance of the enum
public class Type {
	public diffTypes objType;
	
	public Type() {
		
		objType = null;
		// TODO Auto-generated constructor stub
	}
	//sets the value of a string to objtype
	public Type(String Poketype) {
		try {
		objType = objType.valueOf(Poketype);
		}
		catch(Exception e){
			System.out.println("Error this Pokemon doesn't have a correct Type!!!");
		}
	}
	
	public void setType(String type)
	{
		objType=objType.valueOf(type);
		
	}
	public diffTypes getType()
	{
		return objType;
		
	}
	//compares each value inside the enum using case and switch while adding the logic of the game
	public int compareTypes(diffTypes comType)
	{
		boolean istesting;
		if (objType == comType)
		{
			System.out.println("They're the same Type");
		}
		
		
		switch (objType)
		
		{
		
		case Fire:
			istesting= true;
			if (comType.equals(diffTypes.Bug)||comType.equals(diffTypes.Grass) ||comType.equals(diffTypes.Ice) ||comType.equals(diffTypes.Steel))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Ground) ||comType.equals(diffTypes.Rock)|| comType.equals(diffTypes.Water))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
		
		case Water:
			istesting= true;
			if (comType.equals(diffTypes.Fire)||comType.equals(diffTypes.Rock) ||comType.equals(diffTypes.Ground))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Electric) ||comType.equals(diffTypes.Grass))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
			
		case Grass:
			istesting= true;
			if (comType.equals(diffTypes.Water)||comType.equals(diffTypes.Ground) ||comType.equals(diffTypes.Rock))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Fire) ||comType.equals(diffTypes.Ice)|| comType.equals(diffTypes.Flying) || comType.equals(diffTypes.Poison) || comType.equals(diffTypes.Bug))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
			
		case Normal:
			istesting= true;
			if (comType.equals(diffTypes.Fighting))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else if (comType.equals(diffTypes.Ghost))
			{
				System.out.println("It has no Effect");
				return 0;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
			
		case Fighting:
			istesting= true;
			if (comType.equals(diffTypes.Rock)||comType.equals(diffTypes.Dark) ||comType.equals(diffTypes.Ice) ||comType.equals(diffTypes.Steel) || comType.equals(diffTypes.Normal))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Psychic) ||comType.equals(diffTypes.Flying))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
			
		case Rock:
			istesting= true;
			if (comType.equals(diffTypes.Bug)||comType.equals(diffTypes.Fire) ||comType.equals(diffTypes.Ice) ||comType.equals(diffTypes.Flying))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Ground) ||comType.equals(diffTypes.Grass)|| comType.equals(diffTypes.Water) || comType.equals(diffTypes.Fighting) || comType.equals(diffTypes.Steel))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
			
		case Ground:
			istesting= true;
			if (comType.equals(diffTypes.Electric)||comType.equals(diffTypes.Rock) ||comType.equals(diffTypes.Fire) ||comType.equals(diffTypes.Steel)|| comType.equals(diffTypes.Poison))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Ground) ||comType.equals(diffTypes.Grass)|| comType.equals(diffTypes.Water) || comType.equals(diffTypes.Ice))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else if (comType.equals(diffTypes.Flying))
			{
				System.out.println("It has No Effect");
				return 0;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
			
		case Electric:
			istesting= true;
			if (comType.equals(diffTypes.Water)||comType.equals(diffTypes.Flying))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Ground))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
			
		case Dark:
			istesting= true;
			if (comType.equals(diffTypes.Psychic)||comType.equals(diffTypes.Ghost))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Fighting) ||comType.equals(diffTypes.Bug))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
			
		case Poison:
			istesting= true;
			if (comType.equals(diffTypes.Bug))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Ground) ||comType.equals(diffTypes.Psychic))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
			
		case Ice:
			istesting= true;
			if (comType.equals(diffTypes.Grass)||comType.equals(diffTypes.Flying) ||comType.equals(diffTypes.Dragon) ||comType.equals(diffTypes.Ground))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 2;
			}
			
			else if (comType.equals(diffTypes.Fighting) ||comType.equals(diffTypes.Rock)|| comType.equals(diffTypes.Fire) || comType.equals(diffTypes.Steel))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
			
			
		case Psychic:
			istesting= true;
			if (comType.equals(diffTypes.Fighting)||comType.equals(diffTypes.Poison))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Dark) ||comType.equals(diffTypes.Ghost)|| comType.equals(diffTypes.Bug))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
			
		case Dragon:
			istesting= true;
			if (comType.equals(diffTypes.Dragon))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Ice) ||comType.equals(diffTypes.Dragon))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
			
			
		case Bug:
			istesting= true;
			if (comType.equals(diffTypes.Psychic)||comType.equals(diffTypes.Grass) ||comType.equals(diffTypes.Dark))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Flying) ||comType.equals(diffTypes.Fire)|| comType.equals(diffTypes.Rock))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
			
		case Flying:
			istesting= true;
			if (comType.equals(diffTypes.Bug)||comType.equals(diffTypes.Grass) ||comType.equals(diffTypes.Fighting))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Electric) ||comType.equals(diffTypes.Rock)|| comType.equals(diffTypes.Ice))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
			
			
		case Steel:
			istesting= true;
			if (comType.equals(diffTypes.Rock)||comType.equals(diffTypes.Ice))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Fire) ||comType.equals(diffTypes.Ground)|| comType.equals(diffTypes.Fighting))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
			
			
		case Ghost:
			istesting= true;
			if (comType.equals(diffTypes.Psychic)||comType.equals(diffTypes.Ghost))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Ghost) ||comType.equals(diffTypes.Dark))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			
			else if (comType.equals(diffTypes.Normal))
			{
				System.out.println("It has no Effect");
				return 0;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;


			case Fairy:
			istesting= true;
			if (comType.equals(diffTypes.Fighting)||comType.equals(diffTypes.Dark) ||comType.equals(diffTypes.Dragon))
			{
				System.out.println("Its attacks are super Effective to this Type");
				return 3;
			}
			
			else if (comType.equals(diffTypes.Poison) ||comType.equals(diffTypes.Steel))
			{
				System.out.println("Its attacks are weakened by this Type");
				return 2;
			}
			else 
				System.out.println("Its attacks are normally affected");
			return 1;
		}
		
		if(istesting=false)
		System.out.println("There is no Type");
			return 0;
		
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The main is used to test if the code works
		String str2 = "Dark";
		String str = "Ghost";
		Type Mytype = new Type (str);
		Type Comp = new Type (str2);
		Mytype.compareTypes(Comp.objType);
		
		Type myType= new Type("None");
		Type my2= new Type("Fairy");
		System.out.println(Mytype.getType());
		System.out.println(my2.getType());
	}

}

package pokemonSim;

/**
 * @author Okoye
 *
 */
public class Attacks {
	//variables of the attack class
	private String atkName;
	public  Type Attacktype;
	private int accuracy;
	private int dmg;
	private int newdmg;
	private Dice check = new Dice();
	
	public Attacks() {
		// TODO Auto-generated constructor stub
	}

	public Attacks(String name, String attType, int dmg, int acc) {
	this.atkName =	name;
	this.Attacktype = new Type(attType);
	this.accuracy = acc;
	this.dmg = dmg;
	this.newdmg=this.dmg;
	
	}
	/**
	 * @return the atkName
	 */
	public String getAtkName() {
		return atkName;
	}

	/**
	 * @param atkName the atkName to set
	 */
	public void setAtkName(String atkName) {
		this.atkName = atkName;
	}
	public Type getAttacktype() {
		return Attacktype;
	}

	
	public void setAttacktype(String attacktype) {
		Attacktype = new Type(attacktype);
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	
	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
	
	public int getNewDmg() {
		return newdmg;
	}

	public void setNewDmg(int dmg) {
		this.newdmg = dmg;
	}
	// ups the dmg of an attack if the type is super effective
	public int superEffective(int newdmg)
	{
		System.out.println("It was Super Effective!!!");
		int buffdmg = (newdmg)*2;
		return buffdmg;
		
	}
	
	//lowers the dmg of an attack if the type is not as effective
	public int notEffective(int newdmg)
	{
		System.out.println("It was Not Very Effective...");
		int buffdmg = (newdmg)/2;
		return buffdmg;
		
	}
	
	public boolean checkTheAcc()
	{
		boolean hasHit;
		hasHit=check.checkAcc(getAccuracy());
		
		return hasHit;
	}
	
	@Override
	public String toString() {
		return atkName + " [Type: " + Attacktype.getType() + ", Damage:" + dmg + ", Accuracy: " + accuracy + 
				 "]";
	}
	
	public static void main(String[] args)
	{
		Attacks Fire = new Attacks ("Flare Blitz","Fire", 85, 90);
		System.out.println(Fire);
		int debuff= Fire.superEffective(Fire.getDmg());
		System.out.println(debuff);
	}
}

package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person{
	String firstName;
	String familyName;
	int xLoc, yLoc;
	private int Health, maxHealth;
	private int Strength;
	private int Gold;
	//Initializes the variables.

	public Person()
	{
		firstName = "";
		familyName = "";
		xLoc = 0;
		yLoc = 0;
	}
	public Person (String firstName, String familyName, int xLoc, int yLoc)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.Health = 20;
		this.maxHealth = 20;
		this.Strength =5;
		this.Gold = 0;
	}


	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}


	//Restore Health, and increase maxHealth. The gainMaxHealth method is also applied to the items;
	public String restoreHealth(int Amt){
		if ((Health + Amt) > maxHealth){
		Health = maxHealth;
		}
		else{
			Health = Health + Amt;
		}
		return ""+Health+"/"+maxHealth+"";
	}
	public String gainMaxHealth(int Amt){
		maxHealth = Amt + maxHealth;
		return ""+Health+"/"+maxHealth+"";
	}

	public String strengthIncrease(int Amt){
		Strength = Strength + Amt;

		return "Strength ="+Strength+"";
	}

	public void modifyStats(){

	}


}

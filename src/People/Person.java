package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	String firstName;
	String familyName;
	int xLoc, yLoc;
	private int Health, maxHealth;
	private int Strength;

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

	public static void consumeApple(Person x){
		Apple.eat(Person x);
	}

	public String strengthIncrease(int Amt){
		Strength = Strength + Amt;

		return "Strength ="+Strength+"";
	}

	public Person (String firstName, String familyName, int xLoc, int yLoc, int Health, int maxHealth, int Strength)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.Health = Health;
		this.maxHealth = maxHealth;
		this.Strength = Strength;
	}


}

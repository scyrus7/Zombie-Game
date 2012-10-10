/**
 * 
 */
package Zombie;

/**
 * @author Sam
 *
 */
abstract class Weapon 
{
	private int Range;
	private int Damage;
	private int Rate;
	
	private int Projectile;
	
	//Getters and setters
	public int getRange() {
		return Range;
	}
	public void setRange(int range) {
		Range = range;
	}
	public int getDamage() {
		return Damage;
	}
	public void setDamage(int damage) {
		Damage = damage;
	}
	public int getRate() {
		return Rate;
	}
	public void setRate(int rate) {
		Rate = rate;
	}
		
	public int getProjectile() {
		return Projectile;
	}
	public void setProjectile(int projectile) {
		Projectile = projectile;
	}
	
	public abstract String getInfo();
}

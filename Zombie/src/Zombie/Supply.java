/**
 * 
 */
package Zombie;

/**
 * @author Sam
 *
 *
 *We have supply like Jercky as food and water's bottle
 */
abstract class Supply 
{
	private int Jerky;
	private String Water;
	
	public int getJerky() {
		return Jerky;
	}
	public void setJerky(int jerky) {
		Jerky = jerky;
	}
	public String getWater() {
		return Water;
	}
	public void setWater(String water) {
		Water = water;
	}
	
	public abstract String getInfo();
}

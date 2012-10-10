/**
 * 
 */
package Zombie;

/**
 * @author Sam
 *
 */
public abstract class Day_Night_Cycle 
{
	private String Day;
	private String Night;
	
	//Getters and Setters Properties
	public String getDay() {
		return Day;
	}
	public void setDay(String day) {
		Day = day;
	}
	public String getNight() {
		return Night;
	}
	public void setNight(String night) {
		Night = night;
	}
	
	public abstract String getInfo();
}

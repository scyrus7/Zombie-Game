/**
 * 
 */
package Zombie;

/**
 * @author Sam
 *
 */
public abstract class Buildings 
{

	private String Residentional;
	private String Commercial;
	
	public String getResidentional() {
		return Residentional;
	}
	public void setResidentional(String residentional) {
		Residentional = residentional;
	}
	public String getCommercial() {
		return Commercial;
	}
	public void setCommercial(String commercial) {
		Commercial = commercial;
	}
	
	public abstract String getInfo();
	
}

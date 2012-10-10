/**
 * 
 */
package Zombie;

/**
 * @author Sam
 *
 */
abstract class Person 
{
	private String Race;
	private double Height;
	private String Gender;
	private String Strength;
	private String Name;
	private int Age;
	private int Speed;
	//Person Live states
	private int Living;
	private int Dead;
	private int Undead;
	
	//Person Title
	private int Militry;
	private int Civilian;
	private int Scientist;
	
	
	//Getter and Setter
	public String getRace() {
		return Race;
	}
	public void setRace(String race) {
		Race = race;
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		Height = height;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getStrength() {
		return Strength;
	}
	public void setStrength(String strength) {
		Strength = strength;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		Speed = speed;
	}
	
	public int getLiving() {
		return Living;
	}
	public void setLiving(int living) {
		Living = living;
	}
	public int getDead() {
		return Dead;
	}
	public void setDead(int dead) {
		Dead = dead;
	}
	public int getUndead() {
		return Undead;
	}
	public void setUndead(int undead) {
		Undead = undead;
	}
	public int getMilitry() {
		return Militry;
	}
	public void setMilitry(int militry) {
		Militry = militry;
	}
	public int getCivilian() {
		return Civilian;
	}
	public void setCivilian(int civilian) {
		Civilian = civilian;
	}
	public int getScientist() {
		return Scientist;
	}
	public void setScientist(int scientist) {
		Scientist = scientist;
	}
	
	
	public abstract String getInfo();
	

}

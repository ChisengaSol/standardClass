package intro;

/**
 * @version 1.0.0
 * @author tchis
 * @param pertsonName
 *
 */

public class Helloafrica {
	private String personName, personBirth, personSchool;
	
	Helloafrica(String name, String birth, String school){
		
		this.personName = name;
		this.personBirth = birth;
		this.personSchool = school;
	}
	
	public String getName() {
		return this.personName;
	}
	public String getBirth() {
		return this.personBirth;
	}
	public String getSchool() {
		return this.personSchool;
	}
	 
	public void setName(String name) {
		this.personName = name;
	}
	
	public void setBirth(String birth) {
		
	}
	public void setSchool(String school) {
		this.personSchool = school;
	}
	
	public String toString() {
		return "The name is: " + this.personName + 
				"\nThe D.O.B is: " + this.personBirth +
				"\nThe school is: " + this.personSchool;
	}
	public boolean equals(Object obj) {
		return this.personName.equals(((Helloafrica)obj).personName)
				&& this.personBirth.equals(((Helloafrica)obj).personBirth)
				&& this.personSchool.equals(((Helloafrica)obj).personSchool);
	}
	
	public static void main(String args[]) {
		Helloafrica person1 = new Helloafrica("Junior", "1400bc", "hillcrest");
		Helloafrica person2 = new Helloafrica("Junior", "1400bc", "hillcrest");
		Helloafrica person3 = new Helloafrica("senior", "1700ad", "pec");
		System.out.println(person1);
		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));
	}

}

package tr.org.linux.kamp.oorientedanimals;

public class Animals {
	
	//fields state durumlar
	private String name;
	private int age;
	private String gender;
	private String kind;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void eat() {
		System.out.println("Animal has eat.");
		
	}
	public void sleep() {
		System.out.println("Aniaml has sleept.");
		
	}
	public void hunt() {
		System.out.println("Animal has hunted");
	}
	

}

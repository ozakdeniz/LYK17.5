package tr.org.linux.kamp.oorientedperson;

public class Person {
	
	int age;
	String sexuality;
	String name;
	String id;
	
	public Person() {
		System.out.println("insan nesnesi yaratıldı.");
	}
	
	public Person(String id, String name, String sexuality, int age) {
		
		this.name = name;
		this.id = id;
		this.sexuality = sexuality;
		this.age = age;
		
	}
	
	public void sleep() {
		System.out.println(name + " insanı uyudu.");
	}
	
	public void speak() {
		System.out.println(name+ " insanı konuştu");
		
	}public void eat() {
		
		System.out.println(name+ " insanı yemek yedi.");
		
	}
}

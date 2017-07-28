package tr.org.linux.kamp.oorientedanimals;

public class AnimalApplication {
	
	public static void main(String[] args) {
		
		Animals animal1 = new Animals();
		
		animal1.setName("dasty");
		animal1.setKind("dog");
		animal1.setAge(3);
		animal1.setGender("female");
		
		Animals animal2 = new Animals();
		
		animal2.setName("shadow");
		animal2.setKind("cat");
		animal2.setAge(2);
		animal2.setGender("male");
		
		System.out.println(animal1.getName()+" animal is "+ animal1.getAge()+" years old ,its gender is "+
		animal1.getGender()+" and its kind is "+ animal1.getKind());
		
		System.out.println("\n"+ animal2.getName()+" animal is "+ animal2.getAge()+" years old ,its gender is "+
		animal2.getGender()+" and its kind is "+ animal2.getKind());
				
		
		
	}

}

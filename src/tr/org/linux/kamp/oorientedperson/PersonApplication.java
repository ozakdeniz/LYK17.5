package tr.org.linux.kamp.oorientedperson;

public class PersonApplication {
	
	public static void main(String[] args) {
		//sınıf üzerinde interface yarattı
		Person yagmur = new Person();
		Person ozgur = new Person("00002","Özgür","kadın",24);
		
		//nesnenin durumlarını atadık
		yagmur.name = "Yagmur";
		yagmur.age = 19;
		yagmur.id = "00001";
		yagmur.sexuality = "kadın";
		
		//nesnenin davranışlarını gördük.
		yagmur.eat();
		yagmur.sleep();
		ozgur.speak();
		
	}

}

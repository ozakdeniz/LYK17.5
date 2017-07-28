package tr.org.linux.kamp.oorientedbicycles;

public class BicycleApplication {
	
	
	public static void main(String[] args) {
	
		
			Bicycle myBike = new Bicycle(10, 2, "Turuncu");
			MountainBicycle myMountainBike =  new MountainBicycle(25, 3, "Siyah", 500);
			
			myBike.changeGear(1);
			myMountainBike.changeSpeed(35);
			myMountainBike.changeSpin(600);
			System.out.println(myBike.toString());
			System.out.println(myMountainBike.toString());
		}
	}

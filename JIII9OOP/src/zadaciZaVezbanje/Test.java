package zadaciZaVezbanje;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dogA = new Dog();
		dogA.setName("Bleki");
		dogA.setBreed("Mesanac");
		dogA.setHungry(false);
		
		Dog dogB = new Dog("Crni", "Vucjak", true);
		
		dogA.respond();
		dogA.feed();
		dogB.feed();
	}

}

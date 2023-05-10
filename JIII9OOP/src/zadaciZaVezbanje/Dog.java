package zadaciZaVezbanje;

public class Dog extends Animal {
	private boolean hungry;

	public Dog() {
		
	}
	
	public Dog(String name, String breed, boolean hungry) {
		this.name = name;
		this.breed = breed;
		this.hungry = hungry;
	}
	
	@Override
	public void respond() {
		System.out.println("Woof woof");
	}
	
	@Override
	public void namePet(String name) {
		super.setName(name);
	}
	
	@Override
	public void feed() {
		if(hungry) {
			this.setHungry(false);
			System.out.println(super.getName() + " is full and happy!");
		} else {
			System.out.println(super.getName() + " buries food for rainy days!");
		}
	}
	
	public boolean isHungry() {
		return hungry;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
	
	
}

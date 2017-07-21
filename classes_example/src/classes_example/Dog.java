package classes_example;

public class Dog extends Animal implements Is_dog {
	String breed;

	public Dog(String breed) {
		super(4);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String bark(String breed) {
		switch (breed) {
		case "chihuahua":
		case "Bolognese":
			return "yip";
		case "German Shepherd":
		case "Golden Retreiver":
			return "bark";
		case "Rottweiler":
		case "Doberman":
			return "growl";
		default:
			return "Dont Know";
		}

	}

	@Override
	public String bark(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

}

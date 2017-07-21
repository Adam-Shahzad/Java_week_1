package classes_example;

public class Robot_Dog extends Robot implements Is_dog {

	public Robot_Dog(int ID) {
		super(ID);
	}

	@Override
	public String bark(int ID) {
		if (ID > 0 && ID < 11) {
			return "bzz woof";
		} else if (10 < ID && ID < 21) {
			return "whirr woof";
		}
		if (ID == 420) {
			return "smoke weed every day";
		} else if (20 < ID && ID != 420) {
			return "*musical chimes* woof";
		}
		return null;
	}

	@Override
	public String bark(String type) {
		return null;
	}

}

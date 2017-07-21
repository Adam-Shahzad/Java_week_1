
public class car extends Vehicle {
	int no_doors;
	boolean MOT;

	public car(int no_wheels, int year, int milage, int _no_seats, int no_doors, boolean MOT, String ID, String type) {
		super(no_wheels, year, milage, ID, type);
		this.no_doors = no_doors;
		this.MOT = MOT;

	}

	public double MOT_Price() {
		if (MOT = true) {
			return 50;
		} else {
			return 0;
		}
	}

	public double doors_Price() {
		return no_doors * 5;
	}

	public String toString() {

		return ID+ " - " + type;
	}

	public double total() {
		double total = doors_Price() + MOT_Price() + tire_price() + milage_cat() + Year_price();
		return total;

	}

}

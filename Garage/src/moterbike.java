
public class moterbike extends Vehicle {
	boolean electric;
	boolean Bike_MOT;

	public moterbike(int no_wheels, int year, int milage, int _no_seats, boolean electric, boolean Bike_MOT,
			String ID, String type) {
		super(no_wheels, year, milage, ID,  type);
		this.electric = electric;
		this.Bike_MOT = Bike_MOT;

	}

	public double MOT_Price() {
		if (Bike_MOT = true) {
			return 25;
		} else {
			return 0;
		}
	}

	public double electric() {
		if (electric = true) {
			return -10;
		} else {
			return 10;
		}
	}

	public String toString() {

		return ID + " - " + type;
	}

	public double total() {
		double total = electric() + MOT_Price() + tire_price() + milage_cat() + Year_price();
		return total;
	}
}

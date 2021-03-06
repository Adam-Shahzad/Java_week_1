package paint;

public class Paint {
	double price;
	double volume;
	double effectivness;
	String name;
	double total_price;
	double left_over;

	public Paint(double price, double volume, double effectivness, String name, double total_price, double left_over) {
		super();
		this.price = price;
		this.volume = volume;
		this.effectivness = effectivness;
		this.name = name;
		this.total_price = total_price;
		this.left_over = left_over;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getEffectivness() {
		return effectivness;
	}

	public void setEffectivness(double effectivness) {
		this.effectivness = effectivness;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public double getLeft_over() {
		return left_over;
	}

	public void setLeft_over(double left_over) {
		this.left_over = left_over;
	}

}

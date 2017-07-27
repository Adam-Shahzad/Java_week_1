package pizza;

public class Pizza {
	private String sauce; // required
	private int size; // required
	private String topping1; // optional
	private String topping2; // optional
	private String chease; // optional

	private Pizza(BuilderPizza builder) {
		this.sauce = builder.sauce;
		this.size = builder.size;
		this.topping1 = builder.topping1;
		this.topping2 = builder.topping2;
		this.chease = builder.chease;
	}

	public String getSauce() {
		return sauce;
	}

	public int getSize() {
		return size;
	}

	public String getTopping1() {
		return topping1;
	}

	public String getTopping2() {
		return topping2;
	}

	public String getChease() {
		return chease;
	}

	public static class BuilderPizza {
		private String sauce;
		private int size;
		private String topping1;
		private String topping2;
		private String chease;

		public BuilderPizza(String sauce, int size) {
			this.sauce = sauce;
			this.size = size;
		}

		public Pizza build() {

			Pizza pizza = new Pizza(this);
			if (1 > pizza.getSize() || 4 < pizza.getSize()) {
				throw new IllegalStateException("Not valid size");
			}
			return new Pizza(this);

		}

		public BuilderPizza _topping1(String topping1) {
			this.topping1 = topping1;
			return this;
		}

		public BuilderPizza _topping2(String topping2) {
			this.topping2 = topping2;
			return this;
		}

		public BuilderPizza _chease(String chease) {
			this.chease = chease;
			return this;
		}

		@Override
		public String toString() {
			return "BuilderPizza [sauce=" + sauce + ", size=" + size + ", topping1=" + topping1 + ", topping2="
					+ topping2 + ", chease=" + chease + "]";
		}

	}
}
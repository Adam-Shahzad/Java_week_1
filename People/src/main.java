
public class main {
	public static void main(String[] args) {

		String[] Name = new String[3];
		Name[0] = "David";
		Name[1] = "Adam";
		Name[2] = "Bill";

		String[] Job = new String[3];
		Job[0] = "Unemployed";
		Job[1] = "Software Developer ";
		Job[2] = "CEO";

		int[] Age = new int[3];
		Age[0] = 22;
		Age[1] = 21;
		Age[2] = 45;

		People_class[] person = new People_class[3];
		int counter = 0;

		while (counter <= 2) {
			{

				person[counter] = new People_class();
				person[counter].job_title = Job[counter];
				person[counter].name = Name[counter];
				person[counter].age = Age[counter];
				System.out.print(person[counter].Display_msg() + "\n");
				counter = counter + 1;
			}

		}
	}
}

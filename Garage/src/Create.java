import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Create {

	public static void main(String[] args) {

		int counter = 0;
		car a = new car(4, 1990, 2000, 4, 3, false, "01", "car");
		car d = new car(5, 1991, 2001, 4, 3, false, "02", "car");
		moterbike b = new moterbike(4, 1990, 2000, 4, true, true,"03", "moterbike");
		van c = new van(4, 1990, 2000, 3000, true, "04", "van");
		

		ArrayList<Vehicle> Vehicle = new ArrayList(5);
		Vehicle.add(a);
		Vehicle.add(b);
		Vehicle.add(c);
		Vehicle.add(d);
		Scanner sc = new Scanner(System.in);
		String search = sc.next();
		

		for (Vehicle v : Vehicle) {
			if (v.Get_Id() != null && v.Get_Id().contains(search) |v.Get_type().contains(search)) {
				System.out.println(v.toString());
				System.out.println(v.total());
				System.out.println("Delete? Y/N");
				String search2 = sc.next();
				if (search2 == "Y") {
					Vehicle.remove(v.Get_Id());

				}

			}
		}
	}
}

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Runner r = new Runner();
		book b1 = new book(1, "Adam Shahzad", "Kill me now", 750, false, true, "self help");
		Magazine m1 = new Magazine(2, "David Donaghy", "Compare the Spark-it", 22, false, 420, "lifestyle");
		
		System.out.println("Enter in the ID");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		ArrayList<Litrature> c = new ArrayList();

		c.add(b1);
		c.add(m1);
		r.Get_item_from_id(id, c);
		r.change(id, c);
		r.Get_item_from_id(id, c);


	}

	public void Get_item_from_id(int id , ArrayList<Litrature> c) {
	
		for (int i = 0; i < c.size(); i++) {
			if (c.get(i).checkID(id) == true) {
				System.out.println(c.get(i));
			}
		}
	}

	public void change( int id, ArrayList<Litrature> c) {
		System.out.println("What attribute would you like to change?");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice){
		case 1:
			System.out.println("What would you like the ID to be");
			int input = sc.nextInt();
		for (int i = 0; i < c.size(); i++) {
			if (c.get(i).checkID(id) == true) {
				c.get(i).setId(input);
			}}
		case 2:
			System.out.println("What would you like the author to be");
			String input2 = sc.next();
		for (int i = 0; i < c.size(); i++) {
			if (c.get(i).checkID(id) == true) {
				c.get(i).setAuthor(input2);}}
		case 3:
			System.out.println("What would you like the Title to be");
			String input3 = sc.next();
		for (int i = 0; i < c.size(); i++) {
			if (c.get(i).checkID(id) == true) {
				c.get(i).setTitle(input3);}}
		case 4:
			System.out.println("What would you like the page number to be");
			int input4 = sc.nextInt();
		for (int i = 0; i < c.size(); i++) {
			if (c.get(i).checkID(id) == true) {
				c.get(i).setPg_number(input4);}}
		case 5:
			System.out.println("whoulf you like issue to be true or false (1 or anything else)");
			int input5 = sc.nextInt();
			boolean input6;
			if (input5 == 1){input6 = true;}
			else input6 = true;
		for (int i = 0; i < c.size(); i++) {
			if (c.get(i).checkID(id) == true) {
				c.get(i).setIs_issued(input6);}}
		
		}
		}
		
		
		
}

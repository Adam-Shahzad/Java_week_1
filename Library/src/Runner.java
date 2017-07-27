import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Runner r = new Runner();
		Person lib = new Person("pass", "pass", true);
		Borrower sarah = new Borrower("s", "s");
		Borrower nick = new Borrower("n", "n");

		ArrayList<Litrature> c = new ArrayList();
		ArrayList<Borrower> p = new ArrayList();

		p.add(sarah);
		
		r.update(c);
		
		while (1 == 1) {
			r.Get_choice(r, c, p);
			r.Save_details(c,r);
			r.update(c);

		}

	}

	public void Get_choice(Runner r, ArrayList<Litrature> c, ArrayList<Borrower> p) {
		System.out.println("Would you like to");
		System.out.println("(01) add an item");
		System.out.println("(02) delete an item");
		System.out.println("(03) search for an item by ID");
		System.out.println("(04) Search items by user");
		System.out.println("(05) check out a book");
		System.out.println("(06) return a book");
		System.out.println("(07) add/modify/delete a user");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			r.add_item(c);
			break;
		case 2:
			r.delete_item(c);
			break;
		case 3:
			r.Get_item_from_id(c,r);
			break;
		case 4:
			r.Get_item_from_username(c);
			break;
		case 5:
			r.check_out_item(c, p);
			break;
		case 6:
			r.check_in_item(c, p);
			break;
		case 7:
			System.out.println("would you like to add(a), delete(d), or modify(m)");
			String input = sc.next();
			switch (input) {
			case "a":
				r.add_people(p);
				break;
			case "d":
				r.delete_person(p);
				break;
			case "m":
				r.edit_password(p);
				break;
		}
		}
	}

	public void Get_item_from_id(ArrayList<Litrature> c, Runner r) {
		r.update(c);
		System.out.println("Enter in the ID");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		for (int i = 0; i < c.size(); i++) {
			if (c.get(i).checkID(id) == true) {
				System.out.println(c.get(i));
			}
		}
	}

	public void Get_item_from_username(ArrayList<Litrature> c) {

		System.out.println("Enter in the username");
		Scanner sc = new Scanner(System.in);
		String username = sc.next();

		for (int i = 0; i < c.size(); i++) {
			if (c.get(i).checkIssuedTo(username) == true) {
				System.out.println(c.get(i));
			}
		}
	}

	public void change(ArrayList<Litrature> c) {

		System.out.println("Enter in the ID");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		System.out.println("What attribute would you like to change?");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("What would you like the ID to be?");
			int input = sc.nextInt();
			for (int i = 0; i < c.size(); i++) {
				if (c.get(i).checkID(id) == true) {
					c.get(i).setId(input);
				}
			}
			break;
		case 2:
			System.out.println("What would you like the author to be?");
			String input2 = sc.next();
			for (int i = 0; i < c.size(); i++) {
				if (c.get(i).checkID(id) == true) {
					c.get(i).setAuthor(input2);
				}
			}
			break;
		case 3:
			System.out.println("What would you like the Title to be?");
			String input3 = sc.next();
			for (int i = 0; i < c.size(); i++) {
				if (c.get(i).checkID(id) == true) {
					c.get(i).setTitle(input3);
				}
			}
			break;
		case 4:
			System.out.println("What would you like the page number to be?");
			int input4 = sc.nextInt();
			for (int i = 0; i < c.size(); i++) {
				if (c.get(i).checkID(id) == true) {
					c.get(i).setPg_number(input4);
				}
			}
			break;
		case 5:
			System.out.println("would you like issue to be true or false (1 for true, anyother number for for false)");
			int input5 = sc.nextInt();
			boolean input6;
			if (input5 == 1) {
				input6 = true;
			} else
				input6 = true;
			for (int i = 0; i < c.size(); i++) {
				if (c.get(i).checkID(id) == true) {
					c.get(i).setIs_issued(input6);
				}

			}
			break;

		}

	}

	public void delete_item(ArrayList<Litrature> c) {

		System.out.println("Enter in the ID");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		for (int i = 0; i < c.size(); i++) {
			if (c.get(i).checkID(id) == true) {
				c.remove(i);
			}
		}

	}

	public void add_item(ArrayList<Litrature> c) {
		System.out.println("What would you like the ID to be?");
		Scanner sc = new Scanner(System.in);
		int ID = sc.nextInt();

		System.out.println("What would you like the author to be?");
		String author = sc.next();

		System.out.println("What would you like the title to be?");
		String title = sc.next();

		System.out.println("What would you like the page number to be?");
		int page_number = sc.nextInt();

		System.out.println("would you like issue to be true or false (1 for true, anyother number for for false)");
		int input5 = sc.nextInt();
		boolean issue;
		String issue_to;
		if (input5 == 1) {
			System.out.println("who booked it?");
			issue_to = sc.next();
			issue = true;

		} else
			issue = false;
		issue_to = "";

		System.out.println("book(b) or magazine(m)");
		String choice = sc.next();
		if (choice.equals("b")) {

			System.out.println("Hardcover? (1 or 0)");
			int hardcv = sc.nextInt();
			boolean hardcover;
			if (hardcv == 1) {
				hardcover = true;
			} else
				hardcover = false;
			System.out.println("What would you like the genre to be?");
			String catogory = sc.next();

			book newbook = new book(ID, author, title, page_number, issue, issue_to, choice, hardcover, catogory);
			c.add(newbook);
		} else {
			System.out.println("what is the issue number?");
			int issue_no = sc.nextInt();

			System.out.println("What would you like the catogory to be?");
			String catogory = sc.next();

			Magazine newbook = new Magazine(ID, author, title, page_number, issue, issue_to, choice, issue_no,
					catogory);
			c.add(newbook);
		}

	}

	public void check_out_item(ArrayList<Litrature> c, ArrayList<Borrower> p) {

		System.out.println("Enter in the ID");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		System.out.println("Enter in the username");
		String username = sc.next();

		for (int i = 0; i < c.size(); i++) {
			if (c.get(i).checkID(id) == true) {
				c.get(i).setIs_issued(true);
				c.get(i).setIssued_to(username);
			}
		}
		for (int i = 0; i < p.size(); i++) {
			if (p.get(i).checkUsername(username) == true) {
				System.out.println(
						username + " has " + p.get(i).getNo_books_borrowed(c, username) + " book(s) to be returned ");
			}
		}

	}

	public void check_in_item(ArrayList<Litrature> c, ArrayList<Borrower> p) {

		System.out.println("Enter in the ID");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		System.out.println("Enter in the username");
		String username = sc.next();

		for (int i = 0; i < c.size(); i++) {
			if (c.get(i).checkID(id) == true) {
				c.get(i).setIs_issued(false);
				c.get(i).setIssued_to("");
			}
		}
		for (int i = 0; i < p.size(); i++) {
			if (p.get(i).checkUsername(username) == true) {
				System.out.println(
						username + " has " + p.get(i).getNo_books_borrowed(c, username) + " book(s) to be returned ");
			}
		}
	}

	public void Save_details(ArrayList<Litrature> c, Runner r) {
		System.out.println("Save successful");
		try {
			PrintStream fileStream = new PrintStream(new File("savefile.txt"));
			for (int i = 0; i < c.size(); i++) {
				fileStream.println(c.get(i).toFile());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void update(ArrayList<Litrature> c) {
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("savefile.txt"));
			c.clear();
			String line = reader.readLine();

			
			while (line != null) {

				String[] result = line.split(",");

				int ID = Integer.parseInt(result[1]);
				String author = (result[2]);
				String title = (result[3]);
				int pg_number = Integer.parseInt(result[4]);
				boolean is_issued = Boolean.parseBoolean(result[5]);
				String issued_to = (result[6]);

				if (result[7].equals("b")) {
					boolean hard = Boolean.parseBoolean(result[8]);
					String genre = result[9];
					book b1 = new book(ID, author, title, pg_number, is_issued, issued_to, result[7], hard, genre);
					c.add(b1);
				} else if (result[7].equals("m"))
					
				{
					int issue_no = Integer.parseInt(result[8]);
					String catogory = (result[9]);
					Magazine b1 = new Magazine(ID, author, title, pg_number, is_issued, issued_to, result[7], issue_no,
							catogory);
					c.add(b1);
				}
				line = reader.readLine();
			}
			

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void add_people(ArrayList<Borrower> p){
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the user name?");
		String username = sc.next();

		System.out.println("What is the password?");
		String password = sc.next();
		
		Borrower b = new Borrower(username, password);
		p.add(b);
	}
	
	public void edit_password(ArrayList<Borrower> p){
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the user name?");
		String username = sc.next();

		System.out.println("What is the new password?");
		String password = sc.next();
		
		for (int i = 0; i < p.size(); i++) {
			if (p.get(i).checkUsername(username) == true) {
				p.get(i).setPassword(password);
	}
}
}

	public void delete_person(ArrayList<Borrower> p){
		System.out.println("Enter in the ID");
		Scanner sc = new Scanner(System.in);
		String username = sc.next();

		for (int i = 0; i < p.size(); i++) {
			if (p.get(i).checkUsername(username) == true) {
				p.remove(i);
			}
		}

	}
}

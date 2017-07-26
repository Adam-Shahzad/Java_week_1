import java.util.ArrayList;

public class Borrower extends Person {
	int No_books_borrowed;
	
	public Borrower(String username, String password) {
		super(username, password, false);
		this.No_books_borrowed = 0;
	}

	public int getNo_books_borrowed(ArrayList<Litrature> c, String username) {
		int num = 0;
		for (int i = 0; i < c.size(); i++) {
			if (c.get(i).checkIssuedTo(username) == true) {
				num++;
			}
		}
		return num;
	}

	public void setNo_books_borrowed(int no_books_borrowed) {
		No_books_borrowed = no_books_borrowed;
	}
	
	public boolean checkUsername(String username){
		if (this.username.equals(username)){return true;}
		else return false;
	}
}

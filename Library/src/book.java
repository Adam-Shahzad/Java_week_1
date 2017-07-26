
public class book extends Litrature{
boolean hardcover;
String genre;

	public book(int id, String author, String title, int pg_number, boolean is_issued, String issued_to, String type ,boolean hardcover, String genre) {
		super(id, author, title, pg_number, is_issued, issued_to, type);
		this.hardcover = hardcover;
		this.genre=genre;
	}

	public boolean isHardcover() {
		return hardcover;
	}

	public void setHardcover(boolean hardcover) {
		this.hardcover = hardcover;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Hardcover: " + hardcover + ", genre: " + genre 
				+ "\n-----------------------";
	}
	
	public String toFile() {
		
		return super.toFile() + "," + hardcover + "," + genre ;
	}
	

}

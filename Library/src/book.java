
public class book extends Litrature{
boolean hardcover;
String genre;

	public book(int id, String author, String title, int pg_number, boolean is_issued, boolean hardcover, String genre) {
		super(id, author, title, pg_number, is_issued);
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

}

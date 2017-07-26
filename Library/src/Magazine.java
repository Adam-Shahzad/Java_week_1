
public class Magazine extends Litrature {
	int issue_no;
	String catogory;

public Magazine(int id, String author, String title, int pg_number, boolean is_issued, String issued_to,String type, int issue_no, String catogory) {
		super(id, author, title, pg_number, is_issued, issued_to, type);
		this.issue_no = issue_no;
		this.catogory=catogory;
		}

public int getIssue_no() {
	return issue_no;
}

public void setIssue_no(int issue_no) {
	this.issue_no = issue_no;
}

public String getCatogory() {
	return catogory;
}

public void setCatogory(String catogory) {
	this.catogory = catogory;
}

@Override
public String toString() {
	return super.toString() + "\n" + "issue_no: " + issue_no + ", catogory: " + catogory + "\n-----------------------";
}

public String toFile() {
	
	return super.toFile() + "," + issue_no + "," + catogory ;
}


}

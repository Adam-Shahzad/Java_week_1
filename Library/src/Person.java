
public class Person {
String username;
String password;
boolean librarian;

public boolean isLibrarian() {
	return librarian;
}

public void setLibrarian(boolean librarian) {
	this.librarian = librarian;
}

public Person(String username, String password, boolean librarian) {
	super();
	this.username = username;
	this.password = password;
	this.librarian = librarian;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}

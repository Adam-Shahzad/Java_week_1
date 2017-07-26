import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class Litrature {
	
int id;
String author;
String title;
int pg_number;
boolean is_issued;
String issued_to = "";
String type;

public Litrature(int id, String author, String title, int pg_number, boolean is_issued, String issued_to, String type) {
	super();
	this.id = id;
	this.author = author;
	this.title = title;
	this.pg_number = pg_number;
	this.is_issued = is_issued;
	this.issued_to = issued_to;
	this.type = type;
}

public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getPg_number() {
	return pg_number;
}
public void setPg_number(int pg_number) {
	this.pg_number = pg_number;
}
public boolean isIs_issued() {
	return is_issued;
}
public void setIs_issued(boolean is_issued) {
	this.is_issued = is_issued;
}

public boolean checkID(int id){
	if (this.id == id){return true;}
	else return false;
}

public boolean checkIssuedTo(String username){
	if (this.issued_to.equals(username)){return true;}
	else return false;
}

public String getIssued_to() {
	return issued_to;
}

public void setIssued_to(String issued_to) {
	this.issued_to = issued_to;
}

@Override
public String toString() {
	
	return "id: " + id + ", author: " + author + ", title: " + title +","
			+ " \n"+ "pg_number: " + pg_number +
			", \n"+ "is_issued: " + is_issued + " issued to: " + issued_to ;
}

public String toFile() {
	
	return "," + id + "," + author +  "," + title  +"," + pg_number  + "," +is_issued  + "," + issued_to + "," + type;
}
}


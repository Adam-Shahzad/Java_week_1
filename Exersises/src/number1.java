import java.util.Scanner;

public class number1 {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();

String finaloutput="";
	for (int i =0; i<input.length(); i++){
		char data[] = {input.charAt(i),input.charAt(i)};
		String temp = new String(data);
		finaloutput= finaloutput + temp;
		;}
	
	System.out.println(finaloutput);
}
}
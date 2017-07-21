package classes_example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Errors {
public static void main(String[] args){
Errors e = new Errors();
	e.method1(e);
}
private int input;

public int getInput() {
	return input;
}

public void setInput(int input) {
	this.input = input;
}



public void method1(Errors e){
System.out.println("can you name a number 100 is divisible by");

try{
	int answer = method2(e);
	System.out.print("yes 100 divided by " +e.getInput()+ " is " +answer);
}
catch (ArithmeticException ae){
	System.out.print("You can't dived by zero");
	method1(e);
	}
catch(InputMismatchException ime ){
	System.out.println("next time enter an actual number");
	method1(e);
}


	
}
public int method2(Errors e) throws ArithmeticException, InputMismatchException{
	Scanner sc = new Scanner(System.in);
	e.setInput(sc.nextInt());
	return 100/e.getInput();
	}
}

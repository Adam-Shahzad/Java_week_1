package battleships;

import java.util.Scanner;

public class mainBattle {

	public static void main(String[] args) {
		
	boolean co_ordinates[][] = new boolean[3][3];
	board b1 = new board(co_ordinates);
	for (int x = 0; x < 3; x++) 
		{
		for (int y = 0; y < 3; y++) 
		{
			co_ordinates[x][y] = false;
		}}
	
	int x =-1;
	int y =-1;
	String d = "";
	
	Scanner sc = new Scanner(System.in);
	
	while(b1.valid_place(y,x)== false|x<0|x>2|y<0|y>2){
	System.out.println("Please enter your X co-ordinate (0/1/2)");
	x = (sc.nextInt());
	System.out.println("Please enter your y co-ordinate (0/1/2)");
	y = (sc.nextInt());
	}
	
	while(b1.valid_direction(d, y, x)==false){
	System.out.println("Please enter your direction (n/s/e/w)");
	d = (sc.next());
	}
	System.out.println(b1.disp_board());
	
	
	int xh=-1;
	int yh=-1;
	
	while( b1.isempty()== false|xh<0|xh>2|yh<0|yh>2){
	System.out.println("Please enter your x co-ordinate hit (0/1/2)");
	xh = (sc.nextInt());
	System.out.println("Please enter your y co-ordinate hit (0/1/2)");
	yh = (sc.nextInt());
	
	if (b1.hit(xh, yh)== false)
	{System.out.println("miss");}
	else System.out.println("hit");
	}
	System.out.println("you sunk my battle ship");
	System.out.println(b1.disp_board());
	}
}

package package3;

import java.util.ArrayList;
import java.util.Scanner;

public class number3 {
	public static void main(String[] args) {
		System.out.println("next number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("next number");
		int b = sc.nextInt();
		System.out.println("next number");
		int c = sc.nextInt();

		System.out.println(evenlySpaced(a, b, c));

	}

	public static boolean evenlySpaced(int a, int b, int c) {
		int temp = 0;
		for (int i = 1; i < 3; i++) {
			if (a > b) {
				temp = a;
				a = b;
				b = temp;
			}
			if (b > c) {
				temp = b;
				b = c;
				c = temp;
			}
		}
		if (a - b == b - c) {
			return true;
		} else
			return false;

	}
}

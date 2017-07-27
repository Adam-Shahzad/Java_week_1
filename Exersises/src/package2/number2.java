package package2;

import java.util.Scanner;

public class number2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSandwich(sc.nextLine()+"1"));
	}

	public static String getSandwich(String input) {

		String[] result = input.split("bread");

		try {
			if (result[2] == null) {
				return "";
			}
		} catch (Exception e) {
			return "";
		}

		return result[1];

	}
}

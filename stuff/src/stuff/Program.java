package stuff;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("The number you're thinking of is " + new Program().play(0, 100));
    }

    public void instructions(int lowerLimit, int upperLimit) {
        //xxx
    }

    public int play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        Scanner reader = new Scanner(System.in);
        while (true) {
            switch (upperLimit - lowerLimit) {
                case 0:
                    return lowerLimit;
                case 1:
                    System.out.println("Is your number " + upperLimit + "? (y/n)");
                    boolean upper = "y".equals(reader.nextLine());
                    return upper ? upperLimit : lowerLimit;
                default:
                    int x = (lowerLimit + upperLimit) / 2;
                    System.out.println("Is your number greater than " + x + "? (y/n)");
                    boolean greater = "y".equals(reader.nextLine());
                    if (greater) {
                        lowerLimit = x + 1;
                    } else {
                        upperLimit = x;
                    }
                    break;

            }
        }
    }
}
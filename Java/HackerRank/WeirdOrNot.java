package HackerRank;

import java.util.Scanner;

/**
 * WeirdOrNot
 */
public class WeirdOrNot {

    public static void weirdOrNot() {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (n >= 2 && n <= 5)
                System.out.println("Not Weird");
            else if (n >= 6 && n <= 20)
                System.out.println("Weird");
            else if (n > 20)
                System.out.println("Not Weird");
        }

    }

    public static void main(String[] args) {

        weirdOrNot();

    }
}
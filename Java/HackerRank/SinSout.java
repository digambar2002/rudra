package HackerRank;

import java.util.Scanner;

public class SinSout {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
         * Here with next method string only takes first word and nexline method it
         * skips value so to solve this error i take input as string and parse them to
         * integer and float
         */

        int num1 = Integer.parseInt(scanner.nextLine());
        Double num2 = Double.parseDouble(scanner.nextLine());
        String str = scanner.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num1);

    }
}

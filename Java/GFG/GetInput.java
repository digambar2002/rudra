package GFG;

import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int num1 = scanner.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + num1);
    }
}

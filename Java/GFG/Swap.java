package GFG;

public class Swap {

    // Method 1 : Using variable

    private static void swapUsingVariable(int m, int n) {

        System.out.println("Swap using extra variable");
        // storing m value into temporary variable
        int temp = m;

        // Storing n value into m
        m = n;

        // Now inserting value of temp to n
        n = temp;

        System.out.println("m: " + m);
        System.out.println("n: " + n);

    }

    // Method 2: Using

    private static void swapWithoutUsingVariable(int m, int n) {

        m = m - n;
        n = n + m;
        m = n - m;

        System.out.println("m: " + m);
        System.out.println("n: " + n);

    }

    public static void main(String[] args) {

        swapUsingVariable(9, 5);
        swapWithoutUsingVariable(9, 5);

    }

}

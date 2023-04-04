// Java Program to Add Two Binary Strings

package GFG;

public class BinaryAddition {

    public static void binaryAddition(String num1, String num2) {

        // converting string binary to binary integer
        int a = Integer.parseInt(num1, 2);

        // converting string binaty to binary integer
        int b = Integer.parseInt(num2, 2);

        String sum = Integer.toBinaryString(a + b);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        binaryAddition("110", "011");
    }
}

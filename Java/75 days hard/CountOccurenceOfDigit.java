public class CountOccurenceOfDigit {
    public static void main(String[] args) {
        String str  = "hello moto g14 45";
        int count= 0;
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }

        }
        System.out.println("occurance of number is : "+count);
    }
}

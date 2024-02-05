// logic: reverse the given string and then check current string and reverse string are same or not


public class Palindrome {
    public static void main(String[] args) {

        String str = "paka", newStr="";
        char ch;
        
        for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                newStr = ch+newStr;

        }
        if (str.equals(newStr)) {
            System.out.println("palindrome string");
        }
        else{
            System.out.println("not palindrome");
        }


    }
}

import java.util.Arrays;

public class Anagram {

    static Boolean soertedString(String str1, String str2){

        char arrChar1[] = str1.toCharArray();
        char arrChar2[] = str2.toCharArray();
        Arrays.sort(arrChar1);
        Arrays.sort(arrChar2);

        String sortString1 = new String(arrChar1);
        String sortString2 = new String(arrChar2);
        

        boolean flag = false;
        if (sortString1.equals(sortString2)) {
            
            flag = true;
        }

        return flag;

    }
    public static void main(String[] args) {
        String str1 = "champya";
        String str2 = "silent"; 

        if (soertedString(str1, str2)) {
            System.out.println("String is anagram");
        }
        else{
            System.out.println("String is not anagram");
        }
    }
}

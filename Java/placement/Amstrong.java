/**
 * Amstrong
 */
public class Amstrong {

    public static void main(String[] args) {
        int num = 371;
        int temp;
        int sum =0 ;
        String strNum = Integer.toString(num);

        for (int i = 0; i < strNum.length(); i++) {
            
            temp = Character.getNumericValue(strNum.charAt(i));
            temp = temp*temp*temp;
            sum = sum+temp;

        }
        if (sum == num) {
            System.out.println("Amstrong number");
        }
        else{
            System.out.println("Not Amstrong number");
        }



    }
}
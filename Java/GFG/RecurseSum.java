/**
 * RecurseSum
 */

/**
 * InnerRecurseSum
 */

public class RecurseSum {

    public static void main(String[] args) {

        int sum = mySum(5);
        System.out.println(sum);
    
        public static int mySum(int k) {

        if (k > 0) {

            return k+sum(k-1);
        }
        else{
            return 0;
        }

    }
 
    }
}
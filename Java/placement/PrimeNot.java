public class PrimeNot {
    public static void main(String[] args) {
        float num = 3;
        boolean flag = false;
        for (int i = 2; i < num/2; i++) {
            if (num%i == 0) {
                flag = true;
                break;
            }

        }
        if ( flag == false) {
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }

    }
}

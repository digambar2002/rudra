public class p6 {
    public static void main(String[] args) {
        int n = 4;
        int i, j, count;
        count = 0;
        for (i = 1; i <= n; i++) {
            count = i;
            for (j = 1; j <= i; j++) {
                
                System.out.print(count + " ");
                count = count + 1;
            }
            System.out.println("");

        }
    }
}

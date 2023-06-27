public class p2 {
    public static void main(String[] args) {

        int n = 4;
        int i, j, count;
        count = 0;
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n; j++) {

                count = count + 1;
                System.out.print(count + " ");
            }
            System.out.println("");

        }

    }
}

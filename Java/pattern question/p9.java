public class p9 {
    public static void main(String[] args) {

        int n = 3;
        int i, j;

        for (i = 1; i <= n; i++) {
            
            for (j = 1; j <= n; j++) {
                
                char ch = (char) ('A'+ j-1);
                System.out.print(ch+" ");
                
            }
            System.out.println("");

        }

    }
}

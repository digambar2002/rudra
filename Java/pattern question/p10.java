public class p10 {
    public static void main(String[] args) {
        int n = 5;
        int i, j;
        for (i = 0; i < n; i++) {
             int count = i;
            for (j = 0; j < n; j++) {
                count = count+1;
                char ch = (char) ('A'+ count-1);
                System.out.print(ch+" ");
                
            }
            System.out.println("");

        }

    }
}

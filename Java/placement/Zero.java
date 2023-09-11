public class Zero {

    static void SortZero(int arr[]){

        int s = 0, e=arr.length-1;

        while (s<=e) {
            while (arr[s] == 0) {
                s++;
            }
            while (arr[e] == 1) {
                e--;
            }

            if (s<=e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
            }
        }




    }

    public static void main(String[] args) {
        
        int arr[] = {1,0,0,1,0,1};
        SortZero(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}

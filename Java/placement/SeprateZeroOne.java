class Seprate {

    int coutZero;
    int countOne;

    Seprate(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                coutZero++;
            } else {
                countOne++;
            }

        }

        for (int i = 0; i < arr.length; i++) {

            if (coutZero > 0) {
                arr[i] = 0;
                coutZero--;
            } else {
                arr[i] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

}

public class SeprateZeroOne {

    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 1, 0, 1 };
        Seprate seprate = new Seprate(arr);
    }
}
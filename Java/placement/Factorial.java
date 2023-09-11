class FactWithoutRecursion{

    FactWithoutRecursion(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {

            fact = fact*i;

        }
        System.out.println(fact);

    }

}


class FactWithRecursion {

    FactWithRecursion(int num){

        System.out.println(findFact(num));

    }

    int findFact(int num){

        if (num == 1) {
            return 1;
        }
        else
            return num*findFact(num-1);
    }
}

public class Factorial {
    public static void main(String[] args) {
        FactWithoutRecursion factWithoutRecursion = new FactWithoutRecursion(5);
        FactWithRecursion factWithRecursion = new FactWithRecursion(5);
    }
}

/**
 * SplitSentence
 */

//  hello i add split again in 
public class SplitSentence {

    public static void main(String[] args) {
        
        String str = "Hello My Name is Jojo";

        String result[] = str.split(" ");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
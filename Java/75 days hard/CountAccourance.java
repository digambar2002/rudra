// count accounrance of a character in string 
// logic: compare each charater in string with 

public class CountAccourance {
    public static void main(String[] args) {
        String str = "hello i am coco";
        char ch = 'o';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (ch==str.charAt(i)) {

                count++;

            }
            
        }
        System.out.println("occurance of charater "+ ch +" is : "+count);
        

    }
}

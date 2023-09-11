public class Reverse {

    static void reverseStr(String str){

        String mystr = "";

        for (int i = 0; i < str.length(); i++) {
            mystr = str.charAt(i) + mystr;
        }
        System.out.println(str);
        System.out.println(mystr);
        
    }

    public static void main(String[] args) {
        String str = "Digambar";
        String arr[] = str.split(" ");
        String result = ""; 
        for (int i = arr.length-1; i >= 0; i--) {
            
            result = result+" "+arr[i];
            
        }
        System.out.println(result);

        reverseStr(str);
    }
}

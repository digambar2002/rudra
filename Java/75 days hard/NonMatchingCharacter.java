// Day2

public class NonMatchingCharacter {

    public static void main(String[] args) {
        String str1 = "coco", str2 = "jojo";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) != str2.charAt(i)) {
                stringBuilder.append(str1.charAt(i));
            }

        }
        System.out.println(stringBuilder);

    }

}

package Day14;

public class Test {

    public static void main(String[] args) {
        //lenghtString();
        //System.out.println(indexOfChar("Armenia", 4));
        //checkCharInString("Armenia", 'b');
        //countVowelConsonant("Yerevan is a capital City of Armenia");
        //printReverseString("Armenia is a great country");
        //countVowelsDigitPercentage("Armenia15995 is a 464 great country55 ");
        //System.out.println(encrypt("Armenia"));
        checkPalindrome("ArfrA");


    }


    public static void lenghtString() {

        String str = new String();
        System.out.println(str.length());

    }


    public static char indexOfChar(String str, int index) {
        char ourChar = str.charAt(index);
        return ourChar;
    }


    public static void checkCharInString(String str, char ch) {
        System.out.println(str.contains(ch + ""));
    }


    public static void countVowelConsonant(String str) {
        int vCount = 0, cCount = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }


    public static void printReverseString(String str1) {
        StringBuilder sb = new StringBuilder(str1);
        System.out.println(sb.reverse());
    }


    public static void countVowelsDigitPercentage(String str) {
        double vCount = 0, digitCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digitCount++;
            }
        }


        int x = str.length();
        double y = vCount / x * 100;
        System.out.printf("Number of vowels: " + vCount + " " + y + "" + "%");
        System.out.println("Number of digits " + digitCount);
    }


    public static StringBuffer encrypt(String text) {
        int s = 3;
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }


    public static void checkPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                System.out.println(true);
            }
        }
        System.out.println();
    }
}
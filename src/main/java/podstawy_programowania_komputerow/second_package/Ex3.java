package podstawy_programowania_komputerow.second_package;

public class Ex3 {
    public static void main(String args[]) {

        String s = "kupiłem wczoraj kajak";

        if (longestPalindrome(s).equals(""))
            System.out.println("Brak palindromu w podanym zdaniu.");
        else
            System.out.println(longestPalindrome(s));
    }


    public static boolean checkPalindrome(String s) {
        boolean checker = true;

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    return checker;
                } else {
                    checker = false;
                }
            }
        }
        return checker;
    }

    public static String longestPalindrome(String str) {

        str = str + " ";

        String longestword = "";
        StringBuilder word = new StringBuilder();

        int length;
        int length1 = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            if (ch != ' ')
                word.append(ch);
            else {
                length = word.length();
                if (checkPalindrome(word.toString()) &&
                        length > length1) {
                    length1 = length;
                    longestword = word.toString();
                }
                word = new StringBuilder();
            }
        }
        return longestword;
    }
}
package podstawy_programowania_komputerow.second_package;


public class Ex2 {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("kajak"));

        System.out.println(checkPalindrome("ala"));
        System.out.println(checkPalindrome("Abc"));
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
}



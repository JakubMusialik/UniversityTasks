package moje_cwiczenia;

public class palindromeChecker {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("kajak"));
    }

    public static boolean checkPalindrome(String a){

        boolean checker = true;

        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() -1; j >= 0 ; j--) {
                if(a.charAt(i) == a.charAt(j)){
                    checker = true;
                }else{
                    checker = false;
                }
            }
        }
        return checker;
    }
}

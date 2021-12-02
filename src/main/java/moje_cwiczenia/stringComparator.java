package moje_cwiczenia;

public class stringComparator {
    public static void main(String[] args) {

        String a = "abc";
        String b = "abcd";

        System.out.println(compareStringsByChars(a,b));

    }

    public static char compareStringsByChars(String firstString, String secondString){

        char missingChar = 'a';
        for (int i = 0; i < firstString.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(firstString.charAt(i) != secondString.charAt(j)){
                    missingChar += firstString.charAt(i);
                }
            }
        }
        return missingChar;
    }
}
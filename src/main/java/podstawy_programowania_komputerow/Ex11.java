package podstawy_programowania_komputerow;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        String s = sc.next();
        System.out.println("Co robimy? Przekształcamy na system 16 czy 10?");
        String f = sc.next();

        switch (f) {
            case "10":
                String output = "" + Integer.parseInt(s, 16);
                System.out.println(output);
                break;
            case "16":
                String hex = Integer.toHexString(Integer.parseInt(s));
                System.out.println(hex);
        }
    }
}


//Należy napisać program, który w zależności od wybranej opcji dokonuje zamiany podanej liczby naturalnej n podanej w systemie dziesiętnym,
// na liczbę w systemie szesnastkowym lub liczby w systemie szesnastkowym s, na liczbę w systemie dziesiętnym.
// Liczba n podawana jest przez użytkownika i mieści się w przedziale <0,65535>,
// natomiast liczba s jest ciągiem cyfr 0-9 lub liter A-F nie dłuższym niż 4.
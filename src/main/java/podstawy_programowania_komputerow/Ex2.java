package podstawy_programowania_komputerow;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cześć! Jak masz na imię?");
        String name = sc.next();
        if (name.equals("Anna") || name.equals("Jan")) {
            System.out.println("Witaj " + name + " !");
        } else {
            System.out.println("Mogę się witać tylko z Anią i Janem");
        }
    }
}
//2.Zmodyfikuj poprzedni program tak, aby tylko użytkownicy Anna i Jan byli witani ich imionami.
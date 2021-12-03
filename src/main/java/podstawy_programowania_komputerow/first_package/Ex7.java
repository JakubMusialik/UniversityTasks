package podstawy_programowania_komputerow.first_package;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, i, j, primeChecker;


        System.out.print("Podaj liczbę!: ");
        a = sc.nextInt();

        System.out.println("\nLiczby pierwsze z przedzialu 1 - " + a + " to:");


        for (i = 0; i <= a; i++) {

            if (a == 1 || a == 0)
                continue;

            primeChecker = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    primeChecker = 0;
                    break;
                }
            }

            if (primeChecker == 1)
                System.out.println(i);
        }
    }
}
//7.Napisz program, który wypisuje wszystkie liczby pierwsze mieszczące się w zakresie n - podanym przez użytkownika.
package moje_cwiczenia;

import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, i, j, primeChecker;


        System.out.print("1 liczba: ");
        a = sc.nextInt();


        System.out.print("\n2 liczba: ");
        b = sc.nextInt();


        System.out.printf("\nPrime numbers z przedzialu %d i %d to: ", a, b);


        for (i = a; i <= b; i++) {

            if (i == 1 || i == 0)
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


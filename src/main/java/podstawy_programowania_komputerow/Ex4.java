package podstawy_programowania_komputerow;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //PĘTLA FOR

        System.out.println("Podaj liczbę! Obliczenie w pętli for!");
        int yourNumber = sc.nextInt();
        int output = 0;
        for (int i = 1; i <= yourNumber; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                output += i;
            }
        }
        System.out.println("Wynik to: " + output);
        System.out.println("*-----------------------------------*");

        //PĘTLA WHILE

        System.out.println("Podaj drugą liczbę! Obliczenie w pętli while!");
        int yourNumber2 = sc.nextInt();
        int output2 = 0;
        int counter = 1;
        while (counter <= yourNumber2) {
            if (counter % 3 == 0 || counter % 5 == 0) {
                output2 += counter;
            }
            counter++;
        }
        System.out.println("Wynik to: " + output2);
        System.out.println("*-----------------------------------*");

        //PĘTLA DO WHILE

        System.out.println("Podaj trzecią liczbę! Obliczenie w pętli do while!");
        int yourNumber3 = sc.nextInt();
        int output3 = 0;
        int counter2 = 1;
        do {
            if (counter2 % 3 == 0 || counter2 % 5 == 0) {
                output3 += counter2;
            }
            counter2++;
        } while (counter2 <= yourNumber3);
        System.out.println("Wynik to: " + output3);
    }
}
//4. Zmodyfikuj poprzedni program tak, aby w sumie były uwzględniane tylko wielokrotności trzech lub pięciu, np. 3, 5, 6, 9, 10, 12, 15 dla n = 17
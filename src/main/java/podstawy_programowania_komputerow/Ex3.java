package podstawy_programowania_komputerow;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //PĘTLA FOR

        System.out.println("Podaj liczbę! Obliczenie w pętli for!");
        int yourNumber = sc.nextInt();
        int output = 0;
        for (int i = 1; i <= yourNumber; i++) {
            output += i;
        }
        System.out.println("Wynik to: " + output);
        System.out.println("*-----------------------------------*");

        //PĘTLA WHILE

        System.out.println("Podaj drugą liczbę! Obliczenie w pętli while!");
        int yourNumber2 = sc.nextInt();
        int output2 = 0;
        int counter = 1;
        while (counter <= yourNumber2) {
            output2 += counter;
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
            output3 += counter2;
            counter2++;
        } while (counter2 <= yourNumber3);
        System.out.println("Wynik to: " + output3);
    }
}
//3.Napisz program, który zapyta użytkownika o liczbę n i wypisze sumę liczb od 1 do n w trzech wersjach używając pętli for/while/do while.
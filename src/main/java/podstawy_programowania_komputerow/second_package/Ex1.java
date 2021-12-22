package podstawy_programowania_komputerow.second_package;


import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę początkową z zakresu 0-50000");
        int startingBound = sc.nextInt();
        System.out.println("Podaj liczbę końcową z zakresu 0-50000");
        int endingBound = sc.nextInt();

        if (startingBound >= 0 && endingBound <= 50000) {
            System.out.println("Perfekcyjne numery z zakresu " + startingBound + " - " + endingBound + " to:");
            for (int i = startingBound; i <= endingBound; i++) {
                if (isNumPerfect(i)) {
                    System.out.println(i + " - jest numerem perfekcyjnym.");
                }
            }
        }else{
            System.out.println("Podałeś liczby z poza zakresu, spróbuj ponownie :)");
        }
    }

    public static boolean isNumPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }
}
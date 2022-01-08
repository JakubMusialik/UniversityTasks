package podstawy_informatyki;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {

        /*=============================LOGIKA PO STRONIE GRACZA===================================*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj 6 szczęśliwych liczb z zakresu 1-49: ");

        int[] playerNumbers = new int[6];
        try {
            for (int i = 0; i < playerNumbers.length; i++) {
                int yourNumber = sc.nextInt();
                for (int j = 0; j < i; j++) {
                    if (playerNumbers[j] == yourNumber) {
                        System.out.println("Podałeś już taką liczbę!");
                        yourNumber = sc.nextInt();
                        j = -1;
                    }
                    playerNumbers[i] = yourNumber;
                }
                if (yourNumber < 50 && yourNumber > 0) {
                    playerNumbers[i] = yourNumber;
                } else {
                    System.out.println("Tylko liczby z przedziału 1-49!");
                    i -= 1;
                }
            }
            System.out.println("Twoje liczby to: " + Arrays.toString(playerNumbers));

            /*=========================================================================================*/
            /*==============================LOGIKA KOMPUTERA===========================================*/

            int[] randomNumbers = new int[6];
            Random random = new Random();
            int randomInt;
            for (int i = 0; i < randomNumbers.length; i++) {
                randomInt = random.nextInt(49) + 1;
                for (int j = 0; j < i; j++) {
                    if (randomNumbers[j] == randomInt) {
                        randomInt = random.nextInt(49) + 1;
                        j = -1;
                    }
                }
                randomNumbers[i] = randomInt;
            }
            System.out.println("Zwycięskie liczby to: " + Arrays.toString(randomNumbers));

            /*=========================================================================================*/
            /*=============================PORÓWNYWANIE TABLIC=========================================*/

            int counter = 0;
            for (int i = 0; i < playerNumbers.length; i++) {
                for (int j = 0; j < randomNumbers.length; j++) {
                    if (playerNumbers[i] == randomNumbers[j]) {
                        counter++;
                    }
                }
            }
            if (counter == 1) {
                System.out.println("Trafiłeś " + counter + " liczbę :)");
            } else if (counter > 1) {
                System.out.println("Trafiłeś " + counter + " liczby :)");
            } else {
                System.out.println("Niestety nie udało się trafić żadnej liczby :(");
            }
        } catch (InputMismatchException s) {
            System.out.println("Program lotto działa tylko i wyłącznie na liczbach! Spróbuj ponownie później :)");
        }
    }
}
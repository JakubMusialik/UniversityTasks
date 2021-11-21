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
        try {                                                                     //try-catch dla pewnosci jakby gracz wpisal cos innego niz liczbe
            for (int i = 0; i < playerNumbers.length; i++) {                      //loop po pętli
                int yourNumber = sc.nextInt();                                    //skaner do wprowadzenia liczby
                for (int j = 0; j < i; j++) {                                     //zagniezdzony loop sprawdzajacy indeksy czy nie sa takie same
                    if (playerNumbers[j] == yourNumber) {                         //jesli podana liczba juz jest w tablicy
                        System.out.println("Podałeś już taką liczbę!");           //info
                        yourNumber = sc.nextInt();                                //podajemy kolejna liczbe
                        j = -1;                                                   //reset petli zeby sprawdzac nastepne liczby
                    }
                    playerNumbers[i] = yourNumber;                                //przypisujemy wartosc do indeksu
                }
                if (yourNumber < 50 && yourNumber > 0) {                          //jesli podany numer miesci sie w zakresie
                    playerNumbers[i] = yourNumber;                                //zapisujemy do tablicy
                } else {
                    System.out.println("Tylko liczby z przedziału 1-49!");        //jesli liczba z innego przedzialu niz wymagany to cofamy i i przypisujemy nastepna liczbe
                    i -= 1;
                }
            }
            System.out.println("Twoje liczby to: " + Arrays.toString(playerNumbers));

            /*=========================================================================================*/
            /*==============================LOGIKA KOMPUTERA===========================================*/

            int[] randomNumbers = new int[6];
            Random random = new Random();
            int randomInt;
            for (int i = 0; i < randomNumbers.length; i++) {                                  //loop po dlugosci tablicy
                randomInt = random.nextInt(49) + 1;
                for (int j = 0; j < i; j++) {                                                 //zagniezdzony loop do sprawdzania duplikatow
                    if (randomNumbers[j] == randomInt) {                                      //sprawdzamy czy zapisana wartosc jest taka sama jak wartosc zmiennej
                        randomInt = random.nextInt(49) + 1;                            //jesli tak to losujemy nowa liczbe
                        j = -1;                                                              //reset petli
                    }
                }
                randomNumbers[i] = randomInt;                                                 //przypisujemy zmienna do tablicy pod i indeks
            }
            System.out.println("Zwycięskie liczby to: " + Arrays.toString(randomNumbers));

            /*=========================================================================================*/
            /*=============================PORÓWNYWANIE TABLIC=========================================*/

            int counter = 0;
            for (int i = 0; i < playerNumbers.length; i++) {                        //loop po tablicy gracza
                for (int j = 0; j < randomNumbers.length; j++) {                    //loop po tablicy komputera
                    if (playerNumbers[i] == randomNumbers[j]) {                     //porownanie wartosci, jesli takie same zwiekszamy licznik
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
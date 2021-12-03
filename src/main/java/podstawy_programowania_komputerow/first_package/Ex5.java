package podstawy_programowania_komputerow.first_package;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę!");
        int x = sc.nextInt();
        System.out.println("Co robimy? Dodajemy czy Mnożymy?");
        String choice = sc.next();
        switch (choice) {
            case "Dodajemy":
                int output = 0;
                for (int i = 0; i <= x; i++) {
                    output += i;
                }
                System.out.println("Wynik dodawania to: " + output);
                break;
            case "Mnożymy":
                int output1 = 1;
                for (int i = 1; i <= x; i++) {
                    output1 *= i;
                }
                System.out.println("Wynik mnożenia to: " + output1);
                break;
        }
    }
}

//5.Napisz program, który prosi użytkownika o liczbę n i daje mu możliwość wyboru między obliczeniem sumy a obliczeniem iloczynu 1,…, n i ją wyświetla.
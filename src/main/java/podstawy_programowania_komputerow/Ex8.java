package podstawy_programowania_komputerow;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1;
        int range = 10;
        int random = (int) (Math.random() * range) + min;

        int counter = 0;

        System.out.println("Zgadnij liczbe !");

        while(true) {
            int answer = sc.nextInt();
            counter++;
            if(answer == random){
                System.out.println("Brawo! udało Ci się za " + counter + " razem :)");
                break;
            } else if(answer>random){
                System.out.println("Podana liczba jest większa od zwycięskiej liczby!");
            }else if(answer<random){
                System.out.println("Podana liczba jest mniejsza od zwycięskiej liczby!");
            }
        }
    }
}
//8.Napisz grę w zgadywanie, w której użytkownik musi odgadnąć tajną liczbę. Po każdej odpowiedzi program informuje użytkownika,
// czy jego liczba była za duża, czy za mała.
// Na koniec należy wydrukować liczbę potrzebnych prób.
// Wprowadzanie tej samej liczby pod rząd wiele razy liczy się jako jedna próba.
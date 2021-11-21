package exercises;

import java.util.Arrays;

public class Ex18 {
    public static void main(String[] args) {

        int[] tab = {2, 4, 1, 3, 6, 88, 21, 53};
        int[] tab1 = {3, 5, 11, 23, 56, 8, 1, 13};

        System.out.println(Arrays.toString(checkIfIndexIsOddOrEven(tab)));
        System.out.println(Arrays.toString(checkIfIndexIsOddOrEven(tab1)));
    }

    public static int[] checkIfIndexIsOddOrEven(int[] array) {

        int maxValue = 0;
        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {                    //loop po tablicy
            if (maxValue < array[i] && i % 2 == 0) {               //jesli maxValue mniejsze od wartosci indexu i index  parzysty
                maxValue = array[i];                              //przypisz wartosc indexu do zmiennej
            } else if (minValue > array[i] && i % 2 != 0) {      //jesli minValue wieksze od wartosci indexu i index nieparzysty
                minValue = array[i];                            //przypisz wartosc indexu do zmiennej
            }
        }
        return new int[] {maxValue, minValue};               //zwracamy tablice z maxValue o parzystym indexie i minValue o nieparzystym indexie
    }
}

//    Podaj algorytm, w pseudokodzie lub w jezyku PYTHON, który wyznacza element maksymalny
//        wsród liczb o wskaznikach parzystych oraz minimalny wsród liczb o wskaznikach nieparzystych
//        w tablicy A[1 . . . n]. Zakładamy, ze n > 1, czyli zadanie zawsze jest poprawnie sformułowane.
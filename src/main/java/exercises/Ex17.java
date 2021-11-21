package exercises;

import java.util.Arrays;

public class Ex17 {
    public static void main(String[] args) {

        int[] tab = {12, 2, 4, 5, 20, 11, 7, 9, 14, 6, 22};
        int[] tab1 ={2,4,68,3,45,6};

        if (tab.length == 0) {                                                        //jesli tablica jest pusta zwracamy informacje
            System.out.println("Tablica jest pusta lub nie posiada w sobie liczb");
        } else {                                                                    //jesli nie jest pusta uzywamy ponizszej metody
            System.out.println(Arrays.toString(maxElementOfEvenAndMinElementOfOdd(tab)));
        }
        System.out.println(Arrays.toString(maxElementOfEvenAndMinElementOfOdd(tab1)));
    }

    public static int[] maxElementOfEvenAndMinElementOfOdd(int[] array) {

        int maxEvenValue = 0;
        int minOddValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {                                               //loop po tablicy
            if (array[i] % 2 == 0 || array[i] == 0 && maxEvenValue < array[i]) {              //warunek jesli index jest parzysty lub rowny 0 i wiekszy od zmiennej
                maxEvenValue = array[i];                                                     //przypisz wartosc indexu do zmiennej <-- element najwikeszy wsrod licz parzystych

            } else if (array[i] % 2 != 0 && minOddValue > array[i]) {                      //warunek jesli index jest nieparzysty i mniejszy od zmiennej
                minOddValue = array[i];                                                   //przypisz wartosc indexu do zmiennej  <--- element minimalny wsrod liczb nieparzystych
            }
        }
        return new int[]{minOddValue, maxEvenValue};                                   //zwracamy tablice z min nieparzystym elementem  oraz max elementem parzystym
    }
}

//17. Podaj algorytm, w pseudokodzie lub w jezyku PYTHON, który wyznacza element maksymalny
//        wsród liczb parzystych oraz minimalny wsród liczb nieparzystych w tablicy A[1 . . . n]. Jezeli
//        stosowna wartosc nie jest mozliwa do obliczenia, to wypisz odpowiednia informacje.
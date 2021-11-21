package exercises;

/*ZLOZONOSC TEGO ALGORYTMU 3N*/

import java.util.Arrays;

public class Ex20 {
    public static void main(String[] args) {

        int[] tab = {6, 1, 332, 12, 678, 6423, 99, 754, 2134};
        int[] tab1 = {25, 21, 67, 967, 215, 4672, 351, 7689};

        System.out.println(Arrays.toString(minAndMaxElement(tab)));
        System.out.println(Arrays.toString(minAndMaxElement(tab1)));
    }

    public static int[] minAndMaxElement(int[] array) {

        int minElement = array[0];
        int maxElement = 0;

        for (int i = 0; i < array.length; i++) {             //loop po tablicy
            if (maxElement < array[i]) {                    //jesli maxElement jest mniejszy od wartosci pod indexem
                maxElement = array[i];                     //przypisz wartosc indexu do zmiennej
            } else if (minElement > array[i]) {           //jesli minElement jest wiekszy od wartosci pod indexem
                minElement = array[i];                   //przypisz wartosc indexu do zmiennej
            }
        }
        return new int[]{minElement, maxElement};     //zwracamy tablice zawierajaca min i max element tablicy
    }
}

//20. Podaj algorytm, w pseudokodzie i w jezyku PYTHON, który jednoczesnie wyznacza element
//        minimalny oraz element maksymalny w tablicy A[1 . . . n].
//        Podaj złozonosc swojego algorytmu, mierzona liczba operacji arytmetycznych. Postaraj sie, aby
//        złozonosc algorytmu była jak najmniejsza.
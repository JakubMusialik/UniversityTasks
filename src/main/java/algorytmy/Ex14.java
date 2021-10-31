package algorytmy;

public class Ex14 {
    public static void main(String[] args) {

        int[] tab = {4, 12, 2, 0, 4, 0, 1, 6, 3};
        int[] tab1 = {2, 4, 5, 2, 11, 66, 74, 11, 2, 3};

        System.out.println(maxIndexOfMinValue(tab));
        System.out.println(maxIndexOfMinValue(tab1));
    }

    public static int maxIndexOfMinValue(int[] array) {

        int minValue = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {          //loop po tablicy
            if (minValue >= array[i]) {                  //jesli minValue mniejsze lub rowne indexowi
                minValue = array[i];                    //przypisz wartosc indexu do minValue
                index = i;                             // index = i <-- wskazuje najwyzszy index o najnizszej wartosci
            }
        }
        return index;
    }
}

//14. Podaj algorytm, w pseudokodzie lub w jezyku PYTHON, który wyznacza najwiekszy indeks
//        elementu minimalnego w tablicy A[1 . . . n].
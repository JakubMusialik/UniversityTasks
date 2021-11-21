package exercises;

public class Ex16 {
    public static void main(String[] args) {

        int[] tab = {1, 3, 2, 2, 1, 3};
        int[] tab1 = {3, 2, 3, 6, 2, 1, 3, 7, 9};

        System.out.println(maxIndexOfMaxValue(tab));
        System.out.println(maxIndexOfMaxValue(tab1));
    }

    public static int maxIndexOfMaxValue(int[] array) {

        int maxValue = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {        //loop po tablicy
            if (maxValue <= array[i]) {                //maxValue mniejsze lub rowne indexowi w tablicy
                maxValue = array[i];                  // przypisz ta wartosc do maxValue
                index = i;                           // index = i <-- miejsce max wartosci w tablicy
            }
        }
        return index;
    }
}

//16. Podaj algorytm, w pseudokodzie lub w jezyku PYTHON, który wyznacza najwiekszy indeks
//        elementu maksymalnego w tablicy A[1 . . . n].
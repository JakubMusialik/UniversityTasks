package exercises;

public class Ex15 {
    public static void main(String[] args) {

        int[] tab = {8, 11, 7, 6, 11, 5, 1, 2, 9, 11};
        int[] tab1 = {3, 3, 4, 66, 22, 1, 3, 6, 8, 2};

        System.out.println(minIndexOfMaxValue(tab));
        System.out.println(minIndexOfMaxValue(tab1));
    }

    public static int minIndexOfMaxValue(int[] array) {

        int maxValue = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {     //loop po tablicy
            if (maxValue < array[i]) {              //jesli maxValue jest mniejsze od wartosci indexu
                maxValue = array[i];               //przypisz wartosc do zmiennej
                index = i;                        //index = i <-- miejsce indexu w tablicy
            }
        }
        return index;
    }
}

//15. Podaj algorytm, w pseudokodzie lub w jezyku PYTHON, który wyznacza najmniejszy indeks
//        elementu maksymalnego w tablicy A[1 . . . n].
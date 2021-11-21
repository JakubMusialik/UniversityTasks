package algorytmy;

public class Ex13 {
    public static void main(String[] args) {

        int[] tab = {2, 4, 0, 1, 6, 3, 0};
        int[] tab1 = {2, 3, 22, 12, 7, 1, 22, 3, 1};

        System.out.println(minIndexOfMinValue(tab));
        System.out.println(minIndexOfMinValue(tab1));
    }

    public static int minIndexOfMinValue(int[] array) {

        int minValue = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {         //loop po tablicy
            if (minValue > array[i]) {                  //jesli minValue wieksze od indexu
                minValue = array[i];                   // przypisz wartosc indexu do minValue
                index = i;                            //index = i <-- wskazuje najmniejszy index elementu minimalnego tablicy
            }
        }
        return index;
    }
}

//13. Podaj algorytm, w pseudokodzie lub w jezyku PYTHON, który wyznacza najmniejszy indeks
//elementu minimalnego w tablicy A[1 . . . n].
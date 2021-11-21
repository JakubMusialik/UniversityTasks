package exercises;

/*ZLOZONOSC TEGO ALGORYTMU 2N*/

public class Ex12 {
    public static void main(String[] args) {

        int[] tab = {3, 5, 7, 2, 8, 1, 4};
        int[] tab1 = {2, 6, 21, 33, 46, 0, 211};

        System.out.println(getMin(tab));
        System.out.println(getMin(tab1));

    }

    public static int getMin(int[] array) {

        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {      //loop po tablicy
            if (minValue > array[i]) {               //jesli minValue jest wieksze or indeksu
                minValue = array[i];                // przypisz index do minValue
            }
        }
        return minValue;
    }
}

//12. Podaj algorytm, w pseudokodzie lub jezyku PYTHON, który wyznacza element minimalny
//w tablicy A[1 . . . n]. Uzyj petli for.
//Podaj złozonosc swojego algorytmu, mierzona liczba porównan kluczy.
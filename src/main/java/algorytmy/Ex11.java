package algorytmy;

/*ZLOZONOSC ALGORYTMU 2N*/

public class Ex11 {
    public static void main(String[] args) {

        int[] tab = {1, 7, -2, 4, 8};
        int[] tab1 = {2, 5, 8, 22, 14, 1, 7, 4, 8};

        System.out.println(getMin(tab));
        System.out.println(getMin(tab1));
    }

    public static int getMin(int[] array) {

        int minValue = array[0];
        int index = 0;

        while (index < array.length) {           //loop po tablicy
            if (minValue > array[index]) {      //jesli minValue jest mniejsze od indexu
                minValue = array[index];       //przypisz wartosc indexu to minValue
            }
            index++;                         //za kazdym obrotem petli zwiekszamy index
        }
        return minValue;
    }
}

//11. Podaj algorytm, w pseudokodzie lub w jezyku PYTHON, który wyznacza element minimalny
//w tablicy A[1 . . . n]. Uzyj petli while.
//Podaj złozonosc swojego algorytmu, mierzona liczba porównan kluczy.
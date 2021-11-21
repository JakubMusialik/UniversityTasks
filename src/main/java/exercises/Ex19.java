package exercises;

/*ZLOZONOSC TEGO ALGORYTMU 3N*/

import java.util.Arrays;

public class Ex19 {
    public static void main(String[] args) {

        int[] tab = {1244, 221, 467, 455, 230, 11, 7, 9, 142, 6, 22};
        int[] tab1 = {44, 2, 11, 235, 754, 2114, 886, 335, 57};

        System.out.println(Arrays.toString(twoMaxElements(tab)));
        System.out.println(Arrays.toString(twoMaxElements(tab1)));

    }

    public static int[] twoMaxElements(int[] array) {

        int firstMaxElem = 0;
        int secondMaxElem = 0;

        for (int i = 0; i < array.length; i++) {                      //loop po tablicy

            if (firstMaxElem < array[i]) {                          //jesli firstMaxElem jest mniejsze od zmiennej pod danym indexem
                secondMaxElem = firstMaxElem;                      //przypisz secondMaxElem wartosc firstMaxElem
                firstMaxElem = array[i];                          //przypisz wartosc indexu do zmiennej
            } else if (secondMaxElem < array[i]) {
                secondMaxElem = array[i];
            }
        }
        return new int[]{firstMaxElem, secondMaxElem};      //zwracamy tablice z pierwszym i drugim najwiekszym elementem
    }
}

//19. Podaj algorytm, w pseudokodzie lub w jezyku PYTHON, który wyznacza element maksymalny
//        oraz drugi maksymalny w tablicy A[1 . . . n]. Zakładamy, ze n > 1 oraz klucze sa parami rózne.
//        Podaj złozonosc swojego algorytmu, mierzona liczba porównan kluczy.
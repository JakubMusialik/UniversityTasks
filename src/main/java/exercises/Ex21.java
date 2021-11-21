package exercises;

public class Ex21 {
    public static void main(String[] args) {

        int[] caseA = {};
        int[] caseB = {};
        int[] caseC = {3, 2, 1, 6, 4, 10};
        int[] caseD = {-32, 52, -51, 24, 78, 36};
        int[][] caseE = {};
        int[][] caseF = {};

        System.out.println(caseA(caseA, 25));
        System.out.println(caseB(caseB, 5));
        System.out.println(caseC(caseC));
        System.out.println(caseD(caseD));
        System.out.println(caseE(caseE, 3));
        System.out.println(caseF(caseF, 3));
    }
    /*ZLOZONOSC ALGORYTMU 2N*/

    public static double caseA(int[] array, int n) {

        double sum = 0;

        for (int i = 1; i <= n; i++) {                  //loop do kiedy i<=n <-- zmienna do zadeklarowania dla sprawdzenia
            sum = sum + i;                             //suma wartosci w danym przedziale
        }
        return sum;
    }

    /*ZLOZONOSC ALGORYTMU 2N*/

    public static double caseB(int[] array, int n) {

        double product = 1;

        for (int i = 1; i <= n; i++) {              //loop do kiedy i<=n  <-- zmienna do zadeklarowania dla sprawdzenia
            product = product * i;                 //sumujemy iloczyny w danym przedziale
        }
        return product;
    }

    /*ZLOZONOSC ALGORYTMU 2N*/

    public static double caseC(int[] array) {

        double avg = 0;

        for (int i = 0; i < array.length; i++) {                  //loop po petli
            avg = (avg + array[i]);                              //dodajemy do siebie kazdy index w zmiennej i dzielimy przez ilość zmiennych w tablicy
        }
        avg = avg / array.length;
        return avg;
    }

    /*ZLOZONOSC ALGORYTMU 3N*/

    public static double caseD(int[] array) {

        double avg = 0;
        int evenChecker = 0;

        for (int i = 0; i < array.length; i++) {        //loop po petli
            if (array[i] > 0) {                        //jesli wartosc indexu jest wieksza od 0
                avg = (avg + array[i]);               //sumujemy wartosci w zmiennej
                evenChecker++;                       //zwiekszamy zmienna evenChecker <-- nalicza nam tylko indexy gdzie sumujemy wartosci
            }
        }
        avg = avg / evenChecker;                  //dodane juz do siebie wartosci dzielimy przez zmienna odp za naliczenie ilosci dodanych indexow
        return avg;
    }

    /*ZLOZONOSC ALGORYTMU 3N*/

    public static double caseE(int[][] array, int n) {

        double productSum = 0;
        double product = 1;
        double sum = 1;

        for (int k = 1; k <= n; k++) {                               //loop dla k<= n <-- podane dla sprawdzenia
            for (int i = 1; i <= k; i++) {                          //nested loop dla i<=k
                sum = sum + k;                                     //dodajemy sumy
                product = product * i;                            //operacja silni
                productSum = product + sum;                      //przypisujemy zmiennej wartosci sum + product
            }
        }
        return productSum;
    }

    /*ZLOZONOSC ALGORYTMU 3N*/

    public static double caseF(int[][] array, int n) {

        double productSum = 0;
        double sum = 1;
        double product = sum;

        for (int k = 1; k <= n; k++) {                               //loop dla k<=n
            for (int i = k; i <= n; i++) {                          //nested loop dla i<=n i i=k
                sum = sum + k;                                     //dodajemy sumy
                product = product * i;                            //operacja silni
                productSum = product + sum;                      //przypisujemy zmiennej wartosci (zmienna+k) + (zmienna*i)
            }
        }
        return productSum;
    }
}
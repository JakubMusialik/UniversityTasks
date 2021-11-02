package algorytmy;

public class Ex24 {
    public static void main(String[] args) {

        int x = 12;
        int y = 25;
        int z = 1;

        System.out.println(greyBoxCounter(x));
        System.out.println(greyBoxCounter(y));
        System.out.println(greyBoxCounter(z));
    }

    public static int greyBoxCounter(int i) {

        int counter = 0;

        for (int j = 0; j < i; j++) {

            if (i % 2 == 0) {                     //jesli i jest parzyste dzielimy przez 2 licznik +1
                i = i / 2;
                counter++;
            } else if (i % 2 != 0 && i != 1) { //jesli i jest nieparzyste ale nie jest 1
                i = ((i * 3) + 1) / 2;        //mnozymy przez 3 i dodajemy 1
                counter++;                   //licznik +1
            } else if (i == 1) {            //jesli i = 1 licznik +1
                counter++;
            }
        }

        return counter;
    }
}

/*PSEUDOKOD
1.Sprawdź czy liczba jest parzysta.
2.Jeśli tak  = wróc do punktu 1. Jeśli nie = sprawdź czy liczba jest równa 1.
3.Jeśli tak = udaj się do mety. Jeśli nie = pomnóż ją przez 3, dodaj 1 i całośc podziel przez 2 a następie wróc do punktu 1.

for(zmienna j, j mniejsze od i, zwiekszaj j co obrot){
if(i parzyste){
podziel i przez 2
zwieksz licznik
}else if(i nieparzyste i rozne od 1){
i razy 3 dodaj 1 i podziel przez 2
zwieksz licznik
}else if(i rowne 1){
zwieksz licznik
}

zwroc licznik == liczbie przejsc przez szare pole
*/
package exercises;

public class Ex22 {
    public static void main(String[] args) {

        int year = 2054;
        int year1 = 2012;

        System.out.println(leapYearCheck(year));
        System.out.println(leapYearCheck(year1));
    }

    public static String leapYearCheck(int year) {

        String message = "";

        if (year % 4 == 0 && year % 100 != 0) {               //jesli rok jest podzielny przez 4 ale niepodzielny przez 100
            message = "Podany rok jest przestępny";          //zwroc informacje
        } else {                                            //jesli powyzszy warunek jest niespelniony
            message = "Podany rok jest nieprzestępny";     //zwroc informacje
        }
        return message;
    }
}

//22. Napisz program, który sprawdza, czy dany rok jest przestepny (sprawdz definicje roku
//        przestepnego w encyklopedii).
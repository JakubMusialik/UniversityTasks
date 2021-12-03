package podstawy_programowania_komputerow.first_package;

public class Ex9 {
    public static void main(String[] args) {
        int year = 2021;
        int counter = 0;
        do {
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year);
                counter++;
            }
            year++;
        }while(counter <= 20);
    }
}
//Napisz program, który wypisze następne 20 lat przestępnych.
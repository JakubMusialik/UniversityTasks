package podstawy_programowania_komputerow.first_package;


import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę:");
        int n = sc.nextInt();
        System.out.println(createSequence(n));
    }

    public static double createSequence(int n) {
        int[] sequence = new int[n + 1];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sequence[i] = (-1) ^ (n + 1) / (2 * n - 1);
            sum = sequence[i] * 4;
        }
        return sum;
    }
}
//10Napisz program obliczający sumę ciągu pomnożoną przez 4,
// w którym każdy element jest wyrażeniem postaci ((-1) ^ {k + 1}) / (2 * k-1)
// dla podanej przez użytkownika wartości k. np. suma 4 * (1 - 1/3 + 1/5- 1/7 + 1/9 - 1/11 … ).
// Znak ^ oznacza potęgę.
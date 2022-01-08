package podstawy_informatyki;

public class Tasks {

    /*PROGRAMY LICZĄCE SILNIĘ ITERACYJNIE I REKURENCYJNIE + CIĄG FIBONACCIEGO*/
    public static void main(String[] args) {

        System.out.println(factorial(3));
        System.out.println(recursion(3));
        System.out.println(fib(3));
    }

    public static int factorial(int n) {

        for (int i = 1; i <= n; i++) {
            n *= i;
        }
        return n;
    }

    public static int recursion(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * recursion(n - 1);
        }
    }

    public static int fib(int n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
}
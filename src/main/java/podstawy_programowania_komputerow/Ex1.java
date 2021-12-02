package podstawy_programowania_komputerow;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Cześć! Jak masz na imię?");
        String name = sc.next();
        System.out.println("Witaj "+ name + " !");
    }
}
//1. Napisz program, który zapyta użytkownika o imię i pozdrowi go tym imieniem.
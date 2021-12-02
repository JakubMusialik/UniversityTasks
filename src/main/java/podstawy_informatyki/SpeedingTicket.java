package podstawy_informatyki;


import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jaką prędkością jechałeś oraz jaką drogą?"+ "\nDroga szybkiego ruchu" + "\nAutostrada" + "\nTeren zabudowany" + "\nTeren niezabudowany");

        double speed = sc.nextDouble();

        String answer = sc.nextLine();

        System.out.println(answer + " " + speed);


    }
}

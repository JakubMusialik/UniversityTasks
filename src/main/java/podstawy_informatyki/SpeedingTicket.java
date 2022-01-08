package podstawy_informatyki;

import java.util.Scanner;

public class SpeedingTicket {

    static final String[] OPTIONS = {"Obszar zabudowany", "Obszar niezabudowany", "Droga szybkiego ruchu", "Autostrada"};

    public static void printMenu(String[] arr) {
        System.out.println("Witaj w taryfikatorze mandatów!" + "\nNa jakiej drodze chciałbyś sprawdzić wysokość mandatu:");
        for (String option : arr) {
            System.out.println(option);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMenu(OPTIONS);
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();

            switch (input) {
                case "Obszar zabudowany" -> city();
                case "Obszar niezabudowany" -> offCity();
                case "Droga szybkiego ruchu" -> speedway();
                case "Autostrada" -> highwayToHell();
            }
        }
    }

    public static void city() {
        Scanner sc = new Scanner(System.in);
        String ticket = "Mandat wyniesie: ";
        int speedLimit = 50;
        System.out.print("Podaj prędkość z jaką jechałeś:");
        int speed = sc.nextInt();
        if (speed > speedLimit) {
            if (speed <= 60) {
                ticket += "50zł i 0pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 70) {
                ticket += "100zł i 2pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 80) {
                ticket += "200zł i 4pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 90) {
                ticket += "300zł i 6pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 100) {
                ticket += "400zł i 8pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else {
                ticket += "500zł,10pkt + zawieszenie prawa jazdy na 3 miesiące";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            }
        }
        sc.close();
    }

    public static void offCity() {
        Scanner sc = new Scanner(System.in);
        String ticket = "Mandat wyniesie: ";
        int speedLimit = 70;
        System.out.print("Podaj prędkość z jaką jechałeś:");
        int speed = sc.nextInt();
        if (speed > speedLimit) {
            if (speed <= 80) {
                ticket += "50zł i 0pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 90) {
                ticket += "100zł i 2pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 100) {
                ticket += "200zł i 4pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 110) {
                ticket += "300zł i 6pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 120) {
                ticket += "400zł i 8pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else {
                ticket += "500zł,10pkt + zawieszenie prawa jazdy na 3 miesiące";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            }
        }
        sc.close();
    }

    public static void speedway() {
        Scanner sc = new Scanner(System.in);
        String ticket = "Mandat wyniesie: ";
        int speedLimit = 110;
        System.out.print("Podaj prędkość z jaką jechałeś:");
        int speed = sc.nextInt();
        if (speed > speedLimit) {
            if (speed <= 120) {
                ticket += "50zł i 0pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 130) {
                ticket += "100zł i 2pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 140) {
                ticket += "200zł i 4pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 150) {
                ticket += "300zł i 6pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 160) {
                ticket += "400zł i 8pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else {
                ticket += "500zł,10pkt + zawieszenie prawa jazdy na 3 miesiące";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            }
        }
        sc.close();
    }

    public static void highwayToHell() {
        Scanner sc = new Scanner(System.in);
        String ticket = "Mandat wyniesie: ";
        int speedLimit = 120;
        System.out.print("Podaj prędkość z jaką jechałeś:");
        int speed = sc.nextInt();
        if (speed > speedLimit) {
            if (speed <= 130) {
                ticket += "50zł i 0pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 140) {
                ticket += "100zł i 2pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 150) {
                ticket += "200zł i 4pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 160) {
                ticket += "300zł i 6pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else if (speed <= 170) {
                ticket += "400zł i 8pkt";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            } else {
                ticket += "500zł,10pkt + zawieszenie prawa jazdy na 3 miesiące";
                System.out.println(ticket);
                System.out.println("Prędkość została przekroczona o " + (speed - speedLimit) + "km/h");
            }
        }
        sc.close();
    }
}
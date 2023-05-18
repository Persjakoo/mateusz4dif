import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wynik pierwszego testu:");
        int wynikTestu1 = scanner.nextInt();

        System.out.println("Podaj wynik drugiego testu:");
        int wynikTestu2 = scanner.nextInt();

        System.out.println("Podaj wynik trzeciego testu:");
        int wynikTestu3 = scanner.nextInt();

        double srednia = (wynikTestu1 + wynikTestu2 + wynikTestu3) / 3.0;

        System.out.println("Średnia wyników testów: " + srednia);

        int ocena;
        if (srednia >= 90 && srednia <= 100) {
            ocena = 5;
        } else if (srednia >= 80 && srednia <= 89) {
            ocena = 4;
        } else if (srednia >= 70 && srednia <= 79) {
            ocena = 3;
        } else if (srednia >= 60 && srednia <= 69) {
            ocena = 2;
        } else {
            ocena = 1;
        }

        System.out.println("Ocena: " + ocena);
    }
}


import java.util.HashMap;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz liczbę od 1 do 10: ");
        int liczba = scanner.nextInt();

        if (liczba < 1 || liczba > 10) {
            System.out.println("Błąd: Wpisana liczba nie należy do przedziału od 1 do 10.");
            return;
        }

        HashMap<Integer, String> liczbyRzymskie = new HashMap<>();
        liczbyRzymskie.put(1, "I");
        liczbyRzymskie.put(2, "II");
        liczbyRzymskie.put(3, "III");
        liczbyRzymskie.put(4, "IV");
        liczbyRzymskie.put(5, "V");
        liczbyRzymskie.put(6, "VI");
        liczbyRzymskie.put(7, "VII");
        liczbyRzymskie.put(8, "VIII");
        liczbyRzymskie.put(9, "IX");
        liczbyRzymskie.put(10, "X");

        System.out.println("Odpowiednik rzymski wpisanej liczby to: " + liczbyRzymskie.get(liczba));
    }
}

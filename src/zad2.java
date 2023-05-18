import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dzień: ");
        int dzien = scanner.nextInt();
        System.out.print("Podaj miesiąc: ");
        int miesiac = scanner.nextInt();
        System.out.print("Podaj dwie ostatnie cyfry roku: ");
        int rok = scanner.nextInt();

        int iloczyn = dzien * miesiac;

        if (iloczyn == rok) {
            System.out.println("Data jest magiczna!");
        } else {
            System.out.println("Data nie jest magiczna.");
        }
    }
}

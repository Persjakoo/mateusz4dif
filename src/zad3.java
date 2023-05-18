import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wagę (w kilogramach): ");
        double waga = scanner.nextDouble();
        System.out.print("Podaj wzrost (w metrach): ");
        double wzrost = scanner.nextDouble();

        double bmi = waga / (wzrost * wzrost);

        System.out.println("Twój indeks BMI wynosi: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Masz niedowagę.");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Masz optymalną wagę.");
        } else {
            System.out.println("Masz nadwagę.");
        }
    }
}


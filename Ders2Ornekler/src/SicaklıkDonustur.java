import java.util.Scanner;

// Celsius --> Fahrenheit

public class SicaklıkDonustur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Celsius degerini giriniz: ");
        double celsius = input.nextDouble();

        double fahreinheit = (celsius * 1.8) + 32;

        System.out.println("Fahrenheit: " + fahreinheit);

        input.close();

    }
}

import java.util.Scanner;

// 1. Üçgen Alanı Hesaplama

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Tabanı giriniz");
        double taban = input.nextDouble();

        System.out.println("Yüksekliği giriniz");
        double yukseklik = input.nextDouble();

        double alan = (taban * yukseklik) / 2;

        System.out.print("Üçgenin alanı: " + alan);
        input.close();

    }
}
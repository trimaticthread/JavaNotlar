import java.util.Scanner;

// 4. Ortalama Hesaplama

public class OrtalamaHesap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        double sayi1 = input.nextDouble();

        System.out.print("2. sayıyı giriniz :");
        double sayi2 = input.nextDouble();

        System.out.print("3. sayiyi giriniz :");
        double sayi3 = input.nextDouble();

        double ortalama = (sayi1 + sayi2 + sayi3)/3;

        System.out.println("Ortalama: " + ortalama);
        input.close();

    }
}

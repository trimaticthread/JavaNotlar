import java.sql.SQLOutput;
import java.util.Scanner;

// KDV li fiyat  hesapla
// Yüzde 20 kdv koymanız gerekiyor


public class KDVfiyathesap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double KDV_Oran = 0.20;

        System.out.print("Ürün fiyatını giriniz: ");
        double fiyat = input.nextDouble();

        double KDVTutar = fiyat * KDV_Oran;
        double toplam = fiyat + KDVTutar;

        System.out.print("KDV Tutarı: " + KDVTutar);
        System.out.println("Toplam fiyat: " + toplam);
        input.close();


    }
}

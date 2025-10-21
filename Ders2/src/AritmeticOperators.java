public class AritmeticOperators {
    public static void main(String[] args) {
        // 1️⃣ Temel değişkenler
        int a = 10;
        int b = 3;

        // 2️⃣ Toplama
        int toplam = a + b;
        System.out.println("Toplama (a + b): " + toplam); // 13

        // 3️⃣ Çıkarma
        int fark = a - b;
        System.out.println("Çıkarma (a - b): " + fark); // 7

        // 4️⃣ Çarpma
        int carpim = a * b;
        System.out.println("Çarpma (a * b): " + carpim); // 30

        // 5️⃣ Bölme (tamsayı)
        int bolum = a / b;
        System.out.println("Bölme (a / b): " + bolum); // 3 (ondalık kısım atılır)

        // 6️⃣ Mod (kalan)
        int kalan = a % b;
        System.out.println("Kalan (a % b): " + kalan); // 1

        System.out.println("-----------------------------");

        // 7️⃣ Ondalıklı (double) bölme
        double sonuc = (double) a / b; // tür dönüşümü
        System.out.println("Ondalıklı Bölme (double): " + sonuc); // 3.3333...

        System.out.println("-----------------------------");

        // 8️⃣ Artırma ve Azaltma
        int x = 5;
        System.out.println("Başlangıç: " + x);

        x++; // x = 6
        System.out.println("x++ sonrası: " + x);

        ++x; // x = 7
        System.out.println("++x sonrası: " + x);

        x--; // x = 6
        System.out.println("x-- sonrası: " + x);

        --x; // x = 5
        System.out.println("--x sonrası: " + x);

        System.out.println("-----------------------------");

        // 9️⃣ İşlem Önceliği
        int sonuc1 = 5 + 3 * 2;        // 5 + (3*2) = 11
        int sonuc2 = (5 + 3) * 2;      // (5+3)*2 = 16
        System.out.println("Önceliksiz İşlem: " + sonuc1);
        System.out.println("Parantezli İşlem: " + sonuc2);

        System.out.println("-----------------------------");

        // 🔟 Birleşik ifade
        int c = 4, d = 2, e = 1;
        int ifade = a + b * c - d / e; // 10 + (3*4) - (2/1) = 20
        System.out.println("Birleşik İfade Sonucu: " + ifade);

        System.out.println("-----------------------------");

        // 11️⃣ Mod operatörü uygulaması (çift/tek kontrolü)
        int sayi = 9;
        if (sayi % 2 == 0) {
            System.out.println(sayi + " çift sayıdır.");
        } else {
            System.out.println(sayi + " tek sayıdır.");
        }

        System.out.println("-----------------------------");

        // 12️⃣ Tür dönüşümü (int → double)
        int p = 7;
        double q = 2.0;
        double toplam2 = p + q; // p otomatik olarak double’a dönüşür
        System.out.println("Tür dönüşümü sonucu: " + toplam2);

        System.out.println("-----------------------------");

        // 13️⃣ Sıfıra bölme hatası örneği
        int r = 5;
        int s = 0;
        System.out.println("Sıfıra bölme kontrolü...");
        if (s != 0) {
            System.out.println("Sonuç: " + (r / s));
        } else {
            System.out.println("HATA: Sıfıra bölünemez!");
        }
    }
}

public class Sabitler {
    public static void main(String[] args) {
        // 1️⃣ Sabit (final) tanımlama örnekleri

        final int MAX_SCORE = 100;       // maksimum puan
        final double PI = 3.14;          // pi sayısı
        final String SCHOOL_NAME = "Işık University"; // okul adı
        final boolean IS_SUNNY = true;   // hava durumu (mantıksal sabit)

        // 2️⃣ Sabitlerin ekrana yazdırılması
        System.out.println("Maksimum Puan: " + MAX_SCORE);
        System.out.println("PI Sayısı: " + PI);
        System.out.println("Okul Adı: " + SCHOOL_NAME);
        System.out.println("Güneşli mi?: " + IS_SUNNY);

        System.out.println("--------------------------");

        // 3️⃣ Sabitlerle işlem yapma örneği
        double yaricap = 5;
        double alan = PI * yaricap * yaricap;  // PI sabitiyle daire alanı
        System.out.println("Yarıçapı 5 olan dairenin alanı: " + alan);

        System.out.println("--------------------------");

        // 4️⃣ Sabitlerin değiştirilemez olduğunu gösterelim
        // MAX_SCORE = 200; // ❌ HATA: final değişkenin değeri değiştirilemez

        // 5️⃣ Sabitlerin amacı: değişmemesi gereken değerleri korumak
        System.out.println("final kullanarak değerlerin değişmesini önleriz.");
    }
}

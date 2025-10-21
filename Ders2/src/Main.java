public class Main {
    public static void main(String[] args) {
        // --- GEÇERLİ Tanımlayıcılar ---

        // Kural 1: Harf ile başlayabilir
        int sayi = 10;
        System.out.println("sayi: " + sayi);

        // Kural 1: Alt çizgi (_) ile başlayabilir
        // (Ancak genel Java standartlarında çok tercih edilmez)
        int _fiyat = 100;
        System.out.println("_fiyat: " + _fiyat);

        // Kural 1: Dolar işareti ($) ile başlayabilir
        // (Genellikle otomatik üretilen kodlar içindir, kullanılması önerilmez)
        int $bakiye = 200;
        System.out.println("$bakiye: " + $bakiye);

        // Kural (Genel): İçinde rakam bulunabilir (ama başta değil)
        int sayi1 = 300;
        System.out.println("sayi1: " + sayi1);

        // Kural 5: Uzun olmasında bir sakınca yoktur
        int buCokUzunAmaGecerliBirDegiskenIsmidir = 400;
        System.out.println("Uzun değişken: " + buCokUzunAmaGecerliBirDegiskenIsmidir);


        // --- GEÇERSİZ Tanımlayıcılar ---
        // Bu satırlar yorum satırı olmasaydı kod DERLENMEZ (Compile Error)

        // Hata 1: Rakamla başlayamaz
        // int 1sayi = 10;

        // Hata 2: Java anahtar kelimesi (reserved word) olamaz
        // int class = 5;
        // int public = 20;

        // Hata 3: 'true', 'false', 'null' olamaz
        // int true = 1;

        // Hata 4: Geçerli karakterler (harf, rakam, _, $) dışında karakter içeremez
        // int not-ortalamasi = 80; // '-' (tire) geçersizdir
        // int sayi# = 90; // '#' (diyez) geçersizdir
    }
}
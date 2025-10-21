public class literal {
    public static void main(String[] args) {
        int decimal = 42;       // Ondalık
        int octal = 052;        // Sekizlik (0 ile başlar)
        int hex = 0x2A;         // Onaltılık (0x ile başlar)
        int binary = 0b101010;  // İkilik (0b ile başlar)

        System.out.println("Ondalık: " + decimal);
        System.out.println("Sekizlik: " + octal);
        System.out.println("Onaltılık: " + hex);
        System.out.println("İkilik: " + binary);


        double pi = 3.14159;     // double literal
        float oran = 0.75f;      // float literal (f son ek zorunlu)
        double bilimsel = 1.2e3; // 1.2 × 10³ = 1200.0

        System.out.println("PI: " + pi);
        System.out.println("Oran: " + oran);
        System.out.println("Bilimsel Gösterim: " + bilimsel);

        char harf = 'A';
        char rakam = '7';
        char sembol = '#';
        char yeniSatir = '\n'; // özel karakter

        System.out.println("Harf: " + harf);
        System.out.println("Rakam: " + rakam);
        System.out.println("Sembol: " + sembol);
        System.out.println("Yeni Satır (\\n): " + yeniSatir + "Bu alt satırda yazılır!");

        String ad = "Toprak";
        String mesaj = "Java öğreniyorum!";
        String cokSatirli = """
        Merhaba,
        Bu birden fazla satırlı metindir.
        """;

        System.out.println("Ad: " + ad);
        System.out.println("Mesaj: " + mesaj);
        System.out.println("Çok Satırlı Metin:\n" + cokSatirli);

        boolean aktif = true;
        boolean kapali = false;

        System.out.println("Aktif mi?: " + aktif);
        System.out.println("Kapalı mı?: " + kapali);

    }
}

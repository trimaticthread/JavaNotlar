public class AssignOperators {
    public static void main(String[] args) {

        // 1️⃣ Basit Atama (=)
        int sayi = 10; // "sayi" değişkenine 10 atanır
        System.out.println("Başlangıç değeri: " + sayi);

        // 2️⃣ Topla ve Ata (+=)
        sayi += 5; // sayi = sayi + 5;
        System.out.println("sayi += 5 → " + sayi);

        // 3️⃣ Çıkar ve Ata (-=)
        sayi -= 3; // sayi = sayi - 3;
        System.out.println("sayi -= 3 → " + sayi);

        // 4️⃣ Çarp ve Ata (*=)
        sayi *= 2; // sayi = sayi * 2;
        System.out.println("sayi *= 2 → " + sayi);

        // 5️⃣ Böl ve Ata (/=)
        sayi /= 4; // sayi = sayi / 4;
        System.out.println("sayi /= 4 → " + sayi);

        // 6️⃣ Mod (Kalan) ve Ata (%=)
        sayi %= 3; // sayi = sayi % 3;
        System.out.println("sayi %= 3 → " + sayi);

        System.out.println("----------------------------");

        // 7️⃣ Artırma ve Azaltma Operatörleri (++ , --)
        int x = 5;
        System.out.println("x'in başlangıç değeri: " + x);

        x++; // x = x + 1
        System.out.println("x++ sonrası: " + x);

        ++x; // önce artır, sonra kullan
        System.out.println("++x sonrası: " + x);

        x--; // x = x - 1
        System.out.println("x-- sonrası: " + x);

        --x; // önce azalt, sonra kullan
        System.out.println("--x sonrası: " + x);

        System.out.println("----------------------------");

        // 8️⃣ Zincirleme Atama
        int a, b, c;
        a = b = c = 20; // hepsi 20 olur
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        System.out.println("----------------------------");

        // 9️⃣ Aritmetik ve Atama Birlikte Kullanımı
        int puan = 50;
        puan += 10 * 2; // puan = puan + (10 * 2)
        System.out.println("puan += 10 * 2 → " + puan);

        puan -= (5 + 5); // puan = puan - (5 + 5)
        System.out.println("puan -= (5 + 5) → " + puan);

        System.out.println("----------------------------");

        // 🔟 Tür Dönüşümü (Casting) Örneği
        double ortalama = 85.75;
        int not = (int) ortalama; // ondalıklı kısmı atılır
        System.out.println("Ortalama (double): " + ortalama);
        System.out.println("Not (int): " + not);

        System.out.println("----------------------------");

        // 11️⃣ Artırma/azaltma farkı
        int y = 10;
        System.out.println("y başlangıç: " + y);

        System.out.println("y++ çıktısı: " + (y++)); // önce yazdırır sonra artırır
        System.out.println("++y çıktısı: " + (++y)); // önce artırır sonra yazdırır
        System.out.println("Son y değeri: " + y);
    }
}

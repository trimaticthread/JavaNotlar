import java.util.Scanner;

public class scankomut {
    public static void main(String[] args) {

        // 1️⃣ Scanner nesnesi oluştur
        Scanner input = new Scanner(System.in);

        // 2️⃣ Tamsayı (int) veri alma
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        // 3️⃣ Ondalıklı sayı (double) veri alma
        System.out.print("Not ortalamanızı giriniz: ");
        double ortalama = input.nextDouble();

        // 4️⃣ Boolean (true / false) veri alma
        System.out.print("Sisteme kayıtlı mısınız? (true/false): ");
        boolean kayitliMi = input.nextBoolean();

        // 5️⃣ Boş satır hatasını önlemek için dummy nextLine()
        input.nextLine(); // önceki nextInt / nextDouble satır sonunu okumadığı için

        // 6️⃣ Tek kelimelik metin (String) alma
        System.out.print("Adınızı giriniz (tek kelime): ");
        String ad = input.next();

        // 7️⃣ Tüm satırı (boşluk dahil) okuma
        input.nextLine(); // arada kalan enter’ı temizlemek için
        System.out.print("Soyadınızı giriniz (boşluk dahil olabilir): ");
        String soyad = input.nextLine();

        // 8️⃣ Sonuçları yazdır
        System.out.println("\n----- GİRİLEN BİLGİLER -----");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Yaş: " + yas);
        System.out.println("Ortalama: " + ortalama);
        System.out.println("Kayıt Durumu: " + kayitliMi);

        // 9️⃣ Scanner'ı kapat
        input.close();
    }
}

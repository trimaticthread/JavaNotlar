import java.sql.SQLOutput;
import java.util.Scanner;

// Burada giriş yapılan sayıların yerlerini değiştiriniz

public class Ikisayiyerdegis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz");
        int a = input.nextInt();

        System.out.println("İkinci sayıyı giriniz");
        int b = input.nextInt();

        System.out.println("Değiştirmeden önce a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Değiştirmeden önce a = " + a + ", b = " + b);
        input.close();


    }
}

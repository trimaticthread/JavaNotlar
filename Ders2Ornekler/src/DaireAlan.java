// 2- Dairenin Alanı ve Çevresi

import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double PI = 3.14;

        System.out.print("Yarıçapı giriniz: ");
        double r = input.nextDouble();

        double alan = PI * Math.pow(r,2);
        double cevre = 2 * PI * r;

        System.out.print("Alan: " + alan);
        System.out.print("Çevre:" + cevre);
        input.close();

    }
}

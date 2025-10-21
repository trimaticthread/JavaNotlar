import java.util.Scanner;

public class hipotenushesap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("1.kenar: ");
        double a =  input.nextDouble();
        System.out.print("2.kenar: ");
        double b = input.nextDouble();

        double hipotenus = Math.sqrt(a*a + b*b);

        System.out.println("Hipotenus: " + hipotenus);
        input.close();


    }
}




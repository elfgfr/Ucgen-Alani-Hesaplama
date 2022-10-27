import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int A, B, C, Cevre, u;
        double Alan;

        Scanner girdi = new Scanner(System.in);

        System.out.print("1. Kenar Giriniz : ");
        A = girdi.nextInt();

        System.out.print("2. Kenar Giriniz : ");
        B = girdi.nextInt();

        System.out.print("3. Kenar Giriniz : ");
        C = girdi.nextInt();

        u = (A + B + C) / 2;
        Cevre = 2 * u;
        System.out.println("Çevre Uzunluğu : " + Cevre);

        Alan = Math.sqrt(u*(u-A)*(u-B)*(u-C));
        System.out.println("Alan Uzunluğu : " + Alan);

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;

        Scanner girdi = new Scanner(System.in);
        System.out.println("1. kenar giriniz : ");
        a = girdi.nextInt();
        System.out.println("2. kenar giriniz : ");
        b = girdi.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs :" + c);
    }
}
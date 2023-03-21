
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("araciniz km basina ne kadar benzin yakar?(ornek:1,50lt): ");
        double kmyakit=scanner.nextDouble();
        System.out.println("kac km yol kat ettiniz?(ornek:20km): ");
        double gidilenyol = scanner.nextDouble();
        double sonuc = gidilenyol*kmyakit;
        double ucret = 20*sonuc;
        System.out.println("tuketilen benzin: " + sonuc + " lt");
        System.out.println("verilecek ucret: " + ucret + " tl");
    }
}

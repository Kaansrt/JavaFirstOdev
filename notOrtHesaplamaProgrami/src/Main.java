import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notu giriniz : ");
        int matNot = input.nextInt();
        System.out.print("Fizik notu giriniz : ");
        int fizNot = input.nextInt();
        System.out.print("Kimya notu giriniz : ");
        int kimyaNot = input.nextInt();
        System.out.print("Türkçe notu giriniz : ");
        int turkceNot = input.nextInt();
        System.out.print("Tarih notu giriniz : ");
        int tarihNot = input.nextInt();
        System.out.print("Müzik notu giriniz : ");
        int muzikNot = input.nextInt();

        int ort = (matNot+fizNot+kimyaNot+turkceNot+tarihNot+muzikNot)/6;
        System.out.println("Not ortalamanız : "+ort);

        boolean sonuc = ort >=60;
        String durum = (sonuc) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfı
        Scanner inp = new Scanner(System.in);

        // Kullanıcı Değerleri
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam/6;

        System.out.println ("Ortalamanız : " + sonuc);

        boolean kosul1 = sonuc >= 60;
        boolean kosul2 = sonuc < 60;
        boolean sonuc2 = !kosul2;

        String str = sonuc2 ? "Geçtiniz" : "Kaldınız";

        System.out.println(str);
    }
}
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int tarih,music,turkce,kimya,mat,fizik;
        Scanner input = new Scanner(System.in) ;

        System.out.print("Tarih Notunuz:...");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz:...");
        music = input.nextInt();

        System.out.print("Türkçe Notunuz:...");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz:...");
        kimya = input.nextInt();

        System.out.print("Matematik Notunuz:...");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz:...");
        fizik = input.nextInt();

            int ort = ((tarih+music+turkce+kimya+fizik+mat)/6);
            System.out.print("Not Ortalamanız:");
            System.out.println(ort);

                boolean sonuc = ort >= 50;

        String a = sonuc ? "------------------Dönem Tamamlandı-----------------" : "---------------Dönem Tekrarı----------------";
        System.out.println(a);


    }
}

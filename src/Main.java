import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Matematik Notunu Giriniz->");
        double matematik = scanner.nextDouble();
        System.out.println("Fizik Notunu Giriniz->");
        double fizik = scanner.nextDouble();

        System.out.println("Kimya Notunu Giriniz->");
        double kimya = scanner.nextDouble();

        System.out.println("Türkçe Notunu Giriniz->");
        double turkce = scanner.nextDouble();

        System.out.println("Tarih Notunu Giriniz->");
        double tarih = scanner.nextDouble();

        System.out.println("Müzik Notunu Giriniz->");
        double muzik = scanner.nextDouble();
        
        double notOrtalamasi = (matematik + fizik + kimya + turkce + tarih + muzik)/6.0;
        System.out.println("Not Ortalaması->" + notOrtalamasi + (notOrtalamasi<60 ?" Kaldı" : " Geçti"));

    }
}
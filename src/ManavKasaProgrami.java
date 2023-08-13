import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armutunKilosu = 2.14;
        double elmaninKilosu = 3.67;
        double domatesinKilosu = 1.11;
        double muzunKilosu = 0.95;
        double patlicaninKilosu = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo->");
        double kacKiloArmut = scanner.nextDouble();

        System.out.println("Elma Kaç Kilo->");
        double kacKiloElma = scanner.nextDouble();

        System.out.println("Domates Kaç Kilo->");
        double kacKiloDomates = scanner.nextDouble();

        System.out.println("Muz Kaç Kilo->");
        double kacKilomuz = scanner.nextDouble();

        System.out.println("Patlican Kaç Kilo->");
        double kacPatlican = scanner.nextDouble();
        double toplamTutar = kacKiloArmut * armutunKilosu + kacKiloElma*elmaninKilosu + kacKiloDomates*domatesinKilosu+kacPatlican*patlicaninKilosu+kacKilomuz*muzunKilosu;
        System.out.println("Toplam Tutar->" + toplamTutar);
    }
}

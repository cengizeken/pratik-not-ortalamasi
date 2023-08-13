import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilo(kg)->");
        double kilo = scanner.nextDouble();
        System.out.println("Boy(m)->");
        double boy = scanner.nextDouble();
        double vucutKitleEndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle Endeksi->" + vucutKitleEndeksi);
    }
}

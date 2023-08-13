import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double kilometreBasiUcret = 2.2;
        double minimumOdenecekTutar = 20;
        double taksimetreAcilisUcreti = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gidilen Mesafeyi Giriniz->");
        double gidilenMesafe = scanner.nextDouble();
        double hesaplananUcret = taksimetreAcilisUcreti + gidilenMesafe * kilometreBasiUcret;
        double odenecekUcret = hesaplananUcret <minimumOdenecekTutar?minimumOdenecekTutar:hesaplananUcret;
        System.out.println("Ödenecek Ücret->" + odenecekUcret);
    }
}

import java.util.Scanner;

public class UcgenHipotenusAlan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hipotenüs?Alan->");
        String hipotenusOrAlan = scanner.next();
        if(hipotenusOrAlan.equals("H")) {
            System.out.println("Dik Üçgenin Tabanı->");
            double ucgenTabani = scanner.nextDouble();

            System.out.println("Dik Üçgenin Yüksekliği->");
            double ucgenYuksekligi = scanner.nextDouble();
            double hipotenus = Math.sqrt(Math.pow(ucgenYuksekligi, 2) + Math.pow(ucgenTabani, 2));
            System.out.println("Dik Üçgenin Hipotenüsü->" + hipotenus);
        }
        else
        {
            System.out.println("Üçgenin 1.Kenarı->");
            double kenar1 = scanner.nextDouble();
            System.out.println("Üçgenin 2.Kenarı->");
            double kenar2 = scanner.nextDouble();
            System.out.println("Üçgenin 3.Kenarı->");
            double kenar3 = scanner.nextDouble();
            double u = (kenar1 + kenar2 + kenar3)/2.0;
            double alan = Math.sqrt( u * (u - kenar1) * (u - kenar2) * (u - kenar3));
            System.out.println("Üçgenin Alanı->" + alan);
        }

    }
}

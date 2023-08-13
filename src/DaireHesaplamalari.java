import java.util.Scanner;

public class DaireHesaplamalari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("yarıçap->");
        double yaricap = scanner.nextDouble();
        double alan = Math.PI * yaricap * yaricap;
        double cevre = 2 * Math.PI * yaricap;
        System.out.println("Alan->" + alan);
        System.out.println("çevre->" + cevre);

        //daire dilimi alanı : (𝜋 * (r*r) * 𝛼) / 360
        System.out.println("açı->");
        double aci= scanner.nextDouble();
        double daireDilimiAlani=(Math.PI*(yaricap* yaricap)*aci)/360;
        System.out.println("daire dilimi alanı->"+daireDilimiAlani);
    }
}

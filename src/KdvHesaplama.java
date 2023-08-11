import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ürünün Fiyatını Giriniz->");
        double urunFiyati = scanner.nextDouble();

        double kdvliFiyat = urunFiyati * (urunFiyati>1000?1.08:1.18);
        double kdvTutari = kdvliFiyat - urunFiyati;
        System.out.println("Ürünün KDV'li Fiyatı->" + kdvliFiyat);
        System.out.println("KDV tutarı->" + kdvTutari);
    }
}

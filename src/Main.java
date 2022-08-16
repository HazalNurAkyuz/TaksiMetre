import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km;
        double perKlm=2.5, total, startPice =10;

        Scanner input= new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        total = (km * perKlm);
        total += startPice;

        total= (total < 20.0) ? 20 : total;
        System.out.println("Toplam tutar: " + total);

    }
}
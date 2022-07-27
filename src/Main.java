import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kilo,boy,index;

        System.out.print("Lutfen boyunuzu metre cinsinde giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        index = kilo / (boy * boy);

        System.out.println("Vucut Kitle Indeksiniz: " + index);
    }
}

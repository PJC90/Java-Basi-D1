import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa e premi invio");
        String stringa1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa e premi invio");
        String stringa2 = scanner.nextLine();
        System.out.println("Inserisci la terza stringa e premi invio");
        String stringa3 = scanner.nextLine();
        System.out.println("hai scritto:"+ somma(stringa1, stringa2, stringa3));
        System.out.println("hai scritto:"+ somma(stringa3, stringa2, stringa1));
    }
    public static String somma(String s1, String s2, String s3) {return s1 + s2 + s3;}
}

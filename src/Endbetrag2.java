import javax.swing.plaf.metal.MetalRadioButtonUI;
import java.util.Scanner;

/**
 * Created by tobiasroithmeier on 30.03.15.
 */
public class Endbetrag2 {

    public static void main (String[] args) {

        //Variablen und Scanner

        //Mehrwertsteuer

        int Mehrwertsteuer;

        //Scanner für Auswahl des Rechenvorgangs
        Scanner scan = new Scanner(System.in);

        //Einführung
        System.out.println("");
        System.out.println("Für die gewünschte Umrechnung geben sie den richtigen Wert an: ");
        System.out.println("");
        System.out.println("Endbetrag + Mehrwertsteuer: (1)");
        System.out.println("Nettobetrag zu Bruttobetrag: (2)");
        System.out.println("Bruttobetrag zu Nettobetrag: (3)");
        System.out.println("Skontobetrag: (4)");
        System.out.println("Geben Sie nun den richtigen Wert ein");


        int auswahl = scan.nextInt();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            switch (auswahl) {
                case 1:
                    System.out.println("Geben einen Wert ein, auf den die Mehrwertsteuer gerechnet werden soll:");
                    int zahl = scan.nextInt();
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Geben sie die Mehrwertsteuer ein:");
                    Mehrwertsteuer = scan.nextInt();
                        switch (Mehrwertsteuer) {
                            case 19:
                                System.out.println("Der endgültige Wert beträgt:");
                                System.out.println(zahl * 1.19);
                                System.out.println("");
                                break;

                            case 7:
                                System.out.println("Der endgültige Wert beträgt:");
                                System.out.println(zahl * 1.07);
                                System.out.println("");

                            default:
                                System.out.println("Falscher Wert für Mehrwertsteuer");
                        }
                    break;
                case 2:
                    zahl = scan.nextInt();
                    break;
                case 3:
                    System.out.println("Geben sie einen Bruttobetrag ein, der in Netto umgewandelt werden soll:");
                    zahl = scan.nextInt();
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Der Nettobeträg beträgt");
                    System.out.println(zahl / 1.19);
                    break;
                case 4:
                    zahl = scan.nextInt();
                    break;
                default:
                    System.out.println("keiner trifft zu");
            }
        }
    }





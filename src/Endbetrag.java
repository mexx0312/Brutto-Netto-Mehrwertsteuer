import java.util.Scanner;
/**
 * Created by tobiasroithmeier on 30.03.15.
 */
public class Endbetrag {

    public static void main (String[] args) {

        //Variablen und Scanner

        //Mehrwertsteuer & Skontobetrag
        int Mehrwertsteuer;
        //double Skontobetrag;

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
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Geben Sie nun den richtigen Wert ein:");
        System.out.println("");
        int auswahl = scan.nextInt();
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            switch (auswahl) {



                //Endbetrag berechnen
                case 1:
                    System.out.println("Geben einen Wert ein, auf den die Mehrwertsteuer gerechnet werden soll:");
                    System.out.println("");
                    int zahl = scan.nextInt();
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Geben sie die Mehrwertsteuer ein (19. bzw 7%):");
                    System.out.println("");
                    Mehrwertsteuer = scan.nextInt();
                    System.out.println("");

                        switch (Mehrwertsteuer) {
                            case 19:
                                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                System.out.println("Der endgültige Wert beträgt:");
                                System.out.println("");
                                System.out.println(zahl * 1.19);
                                System.out.println("");
                                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                break;

                            case 7:
                                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                System.out.println("Der endgültige Wert beträgt:");
                                System.out.println("");
                                System.out.println(zahl * 1.07);
                                System.out.println("");
                                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                break;

                            default:
                                System.out.println("Falscher Wert für Mehrwertsteuer!!!");
                                System.out.println("");
                                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                        }
                    break;



                //Nettobetrag zu Bruttobetrag
                case 2:
                    System.out.println("Geben sie einen Nettobetrag ein, der in Brutto umgewandelt werden soll:");
                    zahl = scan.nextInt();
                    System.out.println("");
                    System.out.println("Der Brutto beträgt:");
                    System.out.println("");
                    System.out.println(zahl * 1.19);
                    System.out.println("");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    break;



                //Bruttobetrag zu Nettobetrag
                case 3:
                    System.out.println("Geben sie einen Bruttobetrag ein, der in Netto umgewandelt werden soll:");
                    zahl = scan.nextInt();
                    System.out.println("");
                    System.out.println("Der Nettowertbeträg beträgt:");
                    System.out.println("");
                    System.out.println(zahl / 1.19);
                    System.out.println("");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    break;



                //Skontoberechnung
                case 4:
                    System.out.println("Geben sie den Betrag ein von dem der Skontobetrag abgezogen wird:");
                    System.out.println("");
                    zahl = scan.nextInt();
                    System.out.println("");
                    System.out.println("Geben sie den Skontobetrag an:");
                    double Skontobetrag = scan.nextDouble();
                    System.out.println("");
                    System.out.println("Der Endbetrag beträgt:");
                    System.out.println("");
                    System.out.println (zahl - (zahl * Skontobetrag / 100));
                    break;
                default:
                    System.out.println("Falscher Wert angegeben !!!");
            }
        }
    }

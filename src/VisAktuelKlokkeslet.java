/*
Gennemgå og forstå koden.
Refaktorer klassens navn, variable, metoder og tekster til dansk.
Træk klassens funktionalitet ud i nye metode(r).
Kald dine nye metoder fra main() - så vi kan se, at det rent faktisk virker.
 */

public class VisAktuelKlokkeslet {

    public static void main(String[] args) {

        long samledeMillisekunder = samledeMillisekunder();
        long samledeSekunder = samledeSekunder(samledeMillisekunder);
        long aktuelleSekund = aktuelSekund(samledeSekunder);
        long samledeMinutter = samledeMinutter(samledeSekunder);
        long aktuelleMinut = aktuelleMinut(samledeMinutter);
        long samledeTimer = samledeTimer(samledeMinutter);
        long aktuelleKlokkeslet = aktuelleKlokkeslet(samledeTimer);

        long danskTid = danskTid(samledeTimer);

        // Vis resultatet
        System.out.println("Det aktuelle klokkeslet er " + aktuelleKlokkeslet + ":"
                + aktuelleMinut + ":" + aktuelleSekund + " GMT");

        // Vis resultatet
        System.out.println("Det aktuelle danske klokkeslet er " + danskTid + ":"
                + aktuelleMinut + ":" + aktuelleSekund);


        /*
        // Udregn de samlede millisekunder siden midnat, Jan 1, 1970
        long samledeMillisekunder = System.currentTimeMillis();

        // Udregn de samlede sekunder siden midnat, Jan 1, 1970
        long samledeSekunder = samledeMillisekunder / 1000;

        // Beregn det aktuelle sekund i minut i timen
        long aktuelleSekund = samledeSekunder % 60;

        // Udregn de samlede minutter
        long samledeMinutter = samledeSekunder / 60;

        // Beregn det aktuelle minut i timen
        long aktuelleMinut = samledeMinutter % 60;

        // Udregn de samlede timer
        long samledeTimer = samledeMinutter / 60;

        // Beregn det aktuelle klokkeslet
        long aktuelleKlokkeslet = samledeTimer % 24;

        // Vis resultatet
        System.out.println("Det aktuelle klokkeslet er " + aktuelleKlokkeslet + ":"
                + aktuelleMinut + ":" + aktuelleSekund + " GMT"); */
    }

    private static long danskTid(long samledeTimer) {
        // Beregn aktuelt dansk klokkeslet
        long aktuelleKlokkeslet = samledeTimer % 24;
        aktuelleKlokkeslet = aktuelleKlokkeslet+2;
        return  aktuelleKlokkeslet;
    }

    private static long aktuelleKlokkeslet(long samledeTimer) {
        // Beregn det aktuelle klokkeslet
        long aktuelleKlokkeslet = samledeTimer % 24;
        return aktuelleKlokkeslet;
    }

    private static long samledeTimer(long samledeMinutter) {
        // Udregn de samlede timer
        long samledeTimer = samledeMinutter / 60;
        return samledeTimer;
    }

    private static long aktuelleMinut(long samledeMinutter) {
        // Beregn det aktuelle minut i timen
        long aktuelleMinut = samledeMinutter % 60;
        return aktuelleMinut;
    }

    private static long samledeMinutter(long samledeSekunder) {
        // Udregn de samlede minutter
        long samledeMinutter = samledeSekunder / 60;
        return samledeMinutter;
    }

    private static long aktuelSekund(long samledeSekunder) {
        // Beregn det aktuelle sekund i minut i timen
        long aktuelleSekund = samledeSekunder % 60;
        return aktuelleSekund;
    }

    private static long samledeSekunder(long samledeMillisekunder) {
        // Udregn de samlede sekunder siden midnat, Jan 1, 1970
        long samledeSekunder = samledeMillisekunder / 1000;
        return samledeSekunder;
    }

    private static long samledeMillisekunder() {
        // Udregn de samlede millisekunder siden midnat, Jan 1, 1970
        long samledeMillisekunder = System.currentTimeMillis();
        return samledeMillisekunder;
    }
}

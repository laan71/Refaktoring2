import java.util.Scanner;

/*
Gennemgå og forstå koden.
Refaktorer klassens navn, variable, metoder og tekster til dansk.
Træk klassens funktionalitet ud i nye metode(r).
Kald dine nye metoder fra main() - så vi kan se, at det rent faktisk virker.
 */

public class BeregnAendring {

    public static void main(String[] args) {

        double beloeb = beloeb();
        int resterendeBeloeb = resterendeBeloeb(beloeb);
        int antalletAfEnKrone = antalletAfEnKroner(resterendeBeloeb);
        int antalletAf25oere = antalletAf25oere(resterendeBeloeb);
        int antalletAf10oere = antalletAf10oere(resterendeBeloeb);
        int antalletAf5oere = antalletAf5oere(resterendeBeloeb);
        int antalletAf1oere = antalletAf1oere(resterendeBeloeb);

        // Display results
        System.out.println("Dit beløb " + beloeb + " består af");
        System.out.println("    " + antalletAfEnKrone + " kroner ");
        System.out.println("    " + antalletAf25oere + " 25 øre ");
        System.out.println("    " + antalletAf10oere + " 10 øre ");
        System.out.println("    " + antalletAf5oere + " 5 øre ");
        System.out.println("    " + antalletAf1oere + " 1 øre ");

        /*
        // Lav en Scanner
        Scanner input = new Scanner(System.in);

        // Modtag beløbet
        System.out.print(
                "Indtast et beløb i decimaltal, for eksempel 11.56: ");
        double beloeb = input.nextDouble();

        int resterendeBeloeb = (int)(beloeb * 100);

        // Find antallet af en krone
        int antalletAfEnKrone = resterendeBeloeb / 100;
        resterendeBeloeb = resterendeBeloeb % 100;

        // Find antallet af 25 øre i det resterende beløb
        int antalletAf25oere = resterendeBeloeb / 25;
        resterendeBeloeb = resterendeBeloeb % 25;

        // Find antallet af 10 øre i det resterende beløb
        int antalletAf10oere = resterendeBeloeb / 10;
        resterendeBeloeb = resterendeBeloeb % 10;

        // Find antallet a 5 øre i det resterende beløb
        int antalletAf5oere = resterendeBeloeb / 5;
        resterendeBeloeb = resterendeBeloeb % 5;

        // Find antallet af 1 øre pennies i det resterende beløb
        int antalletAf1oere = resterendeBeloeb;

        // Display results
        System.out.println("Dit beløb " + beloeb + " består af");
        System.out.println("    " + antalletAfEnKrone + " kroner ");
        System.out.println("    " + antalletAf25oere + " 25 øre ");
        System.out.println("    " + antalletAf10oere + " 10 øre ");
        System.out.println("    " + antalletAf5oere + " 5 øre ");
        System.out.println("    " + antalletAf1oere + " 1 øre "); */
    }

    private static int antalletAf1oere(int resterendeBeloeb) {
        // Find antallet af 1 øre pennies i det resterende beløb
        int antalletAf1oere = resterendeBeloeb;
        return resterendeBeloeb;
    }

    private static int antalletAf5oere(int resterendeBeloeb) {
        // Find antallet a 5 øre i det resterende beløb
        int antalletAf5oere = resterendeBeloeb / 5;
        resterendeBeloeb = resterendeBeloeb % 5;
        return resterendeBeloeb;
    }

    private static int antalletAf10oere(int resterendeBeloeb) {
        // Find antallet af 10 øre i det resterende beløb
        int antalletAf10oere = resterendeBeloeb / 10;
        resterendeBeloeb = resterendeBeloeb % 10;
        return resterendeBeloeb;
    }

    private static int antalletAf25oere(int resterendeBeloeb) {
        // Find antallet af 25 øre i det resterende beløb
        int antalletAf25oere = resterendeBeloeb / 25;
        resterendeBeloeb = resterendeBeloeb % 25;
        return resterendeBeloeb;
    }

    private static int antalletAfEnKroner(int resterendeBeloeb) {
        // Find antallet af en krone
        int antalletAfEnKrone = resterendeBeloeb / 100;
        return antalletAfEnKrone;
    }

    private static int resterendeBeloeb(double beloeb) {
        int resterendeBeloeb = (int)(beloeb * 100);
        return resterendeBeloeb;
    }

    private static double beloeb() {
        // Modtag beløbet
        Scanner input = new Scanner(System.in);
        System.out.print(
                "Indtast et beløb i decimaltal, for eksempel 11.56: ");
        double beloeb = input.nextDouble();
        return beloeb;
    }
}

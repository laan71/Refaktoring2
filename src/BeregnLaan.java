import java.util.Scanner;

/*
Gennemgå og forstå koden.
Refaktorer klassens navn, variable, metoder og tekster til dansk.
Træk klassens funktionalitet ud i nye metode(r).
Kald dine nye metoder fra main() - så vi kan se, at det rent faktisk virker.
 */

public class BeregnLaan {

    public static void main(String[] args) {

        double aarligRente = aarligRente();
        double maanedligRente = maanedligRente(aarligRente);
        int antalAar = antalAar();
        double laaneBeloeb = laaneBeloeb();
        double maanedligBetaling = maanedligBetaling(laaneBeloeb, maanedligRente, antalAar);
        double samletBetaling = samletBetaling(maanedligBetaling, antalAar);


        // Vis resultat
        System.out.println("Den månedlige betaling er DKK " +
                (int)(maanedligBetaling * 100) / 100.0);
        System.out.println("Den samlede betaling er DKK " +
                (int)(samletBetaling * 100) / 100.0);


      /*  // Lav en Scanner
        Scanner input = new Scanner(System.in);

        // Indtast årlig rente
        System.out.print("Indtast årlig rente, for eksempel 8.25: ");
        double aarligRente = input.nextDouble();

        // Udregn månedlig rente
        double maanedligRente = aarligRente / 1200;

        // Indtast antal år
        System.out.print("Indtast antal år som et helt tal, for eksempel 5: ");
        int antalAar = input.nextInt();

        // Indtast lånebeløb
        System.out.print("Indtast et lånebeløb, for eksempel 120000.95: ");
        double laaneBeloeb = input.nextDouble();

        // Udregn betaling
        double maanedligBetaling = laaneBeloeb * maanedligRente / (1
                - 1 / Math.pow(1 + maanedligRente, antalAar * 12));
        double samletBetaling = maanedligBetaling * antalAar * 12;

        // Vis resultat
        System.out.println("Den månedlige betaling er DKK" +
                (int)(maanedligBetaling * 100) / 100.0);
        System.out.println("Den samlede betaling er DKK" +
                (int)(samletBetaling * 100) / 100.0); */
    }



      private static double samletBetaling(double maanedligBetaling, int antalAar) {
          double samletBetaling = maanedligBetaling * antalAar * 12;
          return samletBetaling;
      }

    private static double maanedligBetaling(double laaneBeloeb, double maanedligRente, int antalAar) {
        // Udregn betaling
        double maanedligBetaling = laaneBeloeb * maanedligRente / (1
                - 1 / Math.pow(1 + maanedligRente, antalAar * 12));
        return maanedligBetaling;
    }

    private static double laaneBeloeb() {
        // Indtast lånebeløb
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast et lånebeløb, for eksempel 120000.95: ");
        double laaneBeloeb = input.nextDouble();
        return laaneBeloeb;
    }

    private static int antalAar() {
        // Indtast antal år
        System.out.print("Indtast antal år som et helt tal, for eksempel 5: ");
        Scanner input = new Scanner(System.in);
        int antalAar = input.nextInt();
        return antalAar;
    }

    private static double maanedligRente(double aarligRente) {
        // Udregn månedlig rente
        double maanedligRente = aarligRente / 1200;
        return maanedligRente;
    }

    private static double aarligRente() {
        // Indtast årlig rente
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast årlig rente, for eksempel 8.25: ");
        double aarligRente = input.nextDouble();
        return aarligRente;
    }
}

import java.util.Scanner;

/*
Gennemgå og forstå koden.
Refaktorer klassens navn, variable, metoder og tekster til dansk.
Træk klassens funktionalitet ud i nye metode(r).
Kald dine nye metoder fra main() - så vi kan se, at det rent faktisk virker.
 */


public class VisTid {
    public static void main(String[] args) {

        int indtastedeSekunder = indtastedeSekunder();
        tidsomregner(indtastedeSekunder);

      /*  Scanner input = new Scanner(System.in);
        // Bed brugeren om input
        System.out.print("Indtast et tal for sekunder: ");
        int sekunder = input.nextInt();

        int minutter = sekunder / 60; // Omregner minutter til sekunder
        int tilbagevaerendeSekunder = sekunder % 60; // Sekunder tilbage
        System.out.println(sekunder + " sekunder er " + minutter +
                " minutter og " + tilbagevaerendeSekunder + " sekunder"); */
        }

    private static void tidsomregner(int indtastedeSekunder) {
        int minutter = indtastedeSekunder / 60;
        int tilbagevaerendeSekunder = indtastedeSekunder % 60;
        System.out.println(indtastedeSekunder + " sekunder er " + minutter + " minutter og " + tilbagevaerendeSekunder + " sekunder");
    }

    public static int indtastedeSekunder() {
        Scanner input = new Scanner(System.in);
        System.out.println("Indsæt antal sekunder: ");
        int sekunder = input.nextInt();
        return sekunder;

    }
}

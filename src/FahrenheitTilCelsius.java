/*
Gennemgå og forstå koden.
Refaktorer klassens navn, variable, metoder og tekster til dansk.
Træk klassens funktionalitet ud i nye metode(r).
Kald dine nye metoder fra main() - så vi kan se, at det rent faktisk virker.
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class FahrenheitTilCelsius {
    public static void main(String[] args) {

        double fahrenheit = fahrenheit();
        fahrenheitTilCelsius(fahrenheit);


        /*
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast antal grader i fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Omregn Fahrenheit til Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er " +
                celsius + " i Celsius"); */
        }

    private static void fahrenheitTilCelsius(double fahrenheit) {
        double celsius = (5.0 / 9 ) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er " + celsius + " i celsius.");

    }

    private static double fahrenheit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast antal grader i Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        return fahrenheit;
    }

}


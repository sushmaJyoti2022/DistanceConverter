package JavaA;

import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDistance Converter");
            System.out.println("1. Meters to Kilometers");
            System.out.println("2. Kilometers to Miles");
            System.out.println("3. Miles to Feet");
            System.out.println("4. Feet to Meters");
            System.out.println("5. Yards to Meters");
            System.out.println("6. Meters to Yards");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the distance: ");
            double distance = scanner.nextDouble();
            double convertedDistance = 0;

            switch (choice) {
                case 1:
                    convertedDistance = metersToKilometers(distance);
                    System.out.printf("%.2f meters is %.2f kilometers%n", distance, convertedDistance);
                    break;
                case 2:
                    convertedDistance = kilometersToMiles(distance);
                    System.out.printf("%.2f kilometers is %.2f miles%n", distance, convertedDistance);
                    break;
                case 3:
                    convertedDistance = milesToFeet(distance);
                    System.out.printf("%.2f miles is %.2f feet%n", distance, convertedDistance);
                    break;
                case 4:
                    convertedDistance = feetToMeters(distance);
                    System.out.printf("%.2f feet is %.2f meters%n", distance, convertedDistance);
                    break;
                case 5:
                    convertedDistance = yardsToMeters(distance);
                    System.out.printf("%.2f yards is %.2f meters%n", distance, convertedDistance);
                    break;
                case 6:
                    convertedDistance = metersToYards(distance);
                    System.out.printf("%.2f meters is %.2f yards%n", distance, convertedDistance);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }

    public static double metersToKilometers(double meters) {
        return meters / 1000;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static double milesToFeet(double miles) {
        return miles * 5280;
    }

    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double yardsToMeters(double yards) {
        return yards * 0.9144;
    }

    public static double metersToYards(double meters) {
        return meters / 0.9144;
    }
}

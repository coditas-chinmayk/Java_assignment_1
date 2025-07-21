import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user's annual salary
        System.out.print("Enter your annual salary: ₹");
        double salary = scanner.nextDouble();

        // Step 2: Get user's choice of tax regime
        System.out.println("\nChoose Tax Regime:");
        System.out.println("1. New Tax Regime");
        System.out.println("2. Old Tax Regime");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        double tax = 0;

        // Step 3: Calculate tax based on the choice
        switch (choice) {
            case 1:
                tax = calculateTaxNewRegime(salary);
                System.out.println("\nTax Calculation as per New Regime");
                break;
            case 2:
                tax = calculateTaxOldRegime(salary);
                System.out.println("\nTax Calculation as per Old Regime");
                break;
            default:
                System.out.println("Invalid choice. Please run the program again.");
                scanner.close();
                return; // Exit if choice is invalid
        }

        // Step 4: Display the result
        System.out.printf("Your total tax is: ₹%,.2f%n", tax);
        System.out.printf("Your net income after tax is: ₹%,.2f%n", salary - tax);

        scanner.close();
    }

    /**
     * NEW tax regime.
     */
    public static double calculateTaxNewRegime(double salary) {
        if (salary <= 250000) {
            return 0;
        } else if (salary <= 500000) {
            return (salary - 250000) * 0.05;
        } else if (salary <= 750000) {
            return (250000 * 0.05) + ((salary - 500000) * 0.10);
        } else if (salary <= 1000000) {
            return (250000 * 0.05) + (250000 * 0.10) + ((salary - 750000) * 0.15);
        } else if (salary <= 1250000) {
            return (250000 * 0.05) + (250000 * 0.10) + (250000 * 0.15) + ((salary - 1000000) * 0.20);
        } else if (salary <= 1500000) {
            return (250000 * 0.05) + (250000 * 0.10) + (250000 * 0.15) + (250000 * 0.20) + ((salary - 1250000) * 0.25);
        } else {
            return (250000 * 0.05) + (250000 * 0.10) + (250000 * 0.15) + (250000 * 0.20) + (250000 * 0.25) + ((salary - 1500000) * 0.30);
        }
    }

    /**
     * OLD tax regime.
     */
    public static double calculateTaxOldRegime(double salary) {
        if (salary <= 250000) {
            return 0;
        } else if (salary <= 500000) {
            return (salary - 250000) * 0.05;
        } else if (salary <= 1000000) {
            return (250000 * 0.05) + ((salary - 500000) * 0.20);
        } else {
            return (250000 * 0.05) + (500000 * 0.20) + ((salary - 1000000) * 0.30);
        }
    }
}
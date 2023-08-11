import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cars: ");
        int numberOfCars = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] cars = new String[numberOfCars];

        for (int i = 0; i < numberOfCars; i++) {
            System.out.print("Enter car name " + (i + 1) + ": ");
            cars[i] = scanner.nextLine();
        }

        System.out.println("\nList of cars:");
        for (String car : cars) {
            System.out.println(car);
        }


    }
}

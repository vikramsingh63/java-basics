import java.util.Scanner;

public class SimpleInterestCalculator {
    calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

       
        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        /
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        
        double interest = calculateSimpleInterest(principal, rate, time);

        // Display 
        System.out.println("The simple interest is: " + interest);
    }
}

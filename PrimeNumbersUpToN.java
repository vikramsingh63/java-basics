import java.util.Scanner;

public class PrimeNumbersUpToN {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void printPrimes(int N) {
        System.out.println("Prime numbers from 1 to " + N + " are:");
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

    
        printPrimes(N);
    }
}

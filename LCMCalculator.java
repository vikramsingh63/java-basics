import java.util.Scanner;

public class LCMCalculator {

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

   
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();


        int lcm = calculateLCM(num1, num2);

  
        System.out.println("The Least Common Multiple (LCM) of " + num1 + " and " + num2 + " is: " + lcm);
    }
}


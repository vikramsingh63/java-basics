import java.util.Scanner;

public class ArmstrongNumbersBetweenTwoIntegr{
    //  calculate the number of digits in a number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    
    public static boolean isArmstrong(int num) {
        int numberOfDigits = countDigits(num);
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberOfDigits);
            temp /= 10;
        }

        return sum == num;
    }

  
    public static void printArmstrongNumbers(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the starting integer: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending integer: ");
        int end = scanner.nextInt();

        
        printArmstrongNumbers(start, end);
    }
}

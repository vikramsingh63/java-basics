import java.util.Scanner;

public class AddBinaryStrings {
    
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int carry = 0;

     
        int i = a.length() - 1;
        int j = b.length() - 1;

   
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

      
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

         
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);

           
            carry = sum / 2;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the first binary string: ");
        String binary1 = scanner.nextLine();

      
        System.out.print("Enter the second binary string: ");
        String binary2 = scanner.nextLine();

        String result = addBinary(binary1, binary2);

       
        System.out.println("The sum of the two binary strings is: " + result);
    }
}

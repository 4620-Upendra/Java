//Check if a number is Armstrong or not.
//  Armstrong Number Example:
// 🔹 3-digit example: 153
// Number of digits = 3
// Each digit raised to the power of 3:1 =1^3+5^3+3^3=1+125+27=153
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int original = n;
        int length = 0;
        int temp = n;
        while (temp != 0) {
            length++;
            temp /= 10;
        }
        int sum = 0;
        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < length; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }
        if (sum == original) {
            System.out.println("The given number " + original + " is an Armstrong number.");
        } else {
            System.out.println("The given number " + original + " is not an Armstrong number.");
        }
    }
}

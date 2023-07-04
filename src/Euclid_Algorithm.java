import java.util.Scanner;

//GCD = Greatest common factor
public class Euclid_Algorithm {
    public static int gcd(int a, int b) {
        // Ensure positive values for a and b
        a = Math.abs(a);
        b = Math.abs(b);

        // Base case: if one of the numbers is zero, the other number is the GCD
        if (b == 0) {
            return a;
        }

        // Recursive case: apply the Euclidean algorithm
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        int gcdResult = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdResult);
    }
}

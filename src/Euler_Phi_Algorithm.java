import java.util.Scanner;

public class Euler_Phi_Algorithm {
    public static int eulerPhi(int n) {
        int result = n;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                result -= result / i;
            }
        }

        if (n > 1) {
            result -= result / n;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int phi = eulerPhi(n);
        System.out.println("Euler's phi value for " + n + " is: " + phi);
    }
}

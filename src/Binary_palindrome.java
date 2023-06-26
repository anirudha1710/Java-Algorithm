import java.util.Scanner;

public class Binary_palindrome {
    public static boolean Binary_palindrome(int number) {
        String binary = Integer.toBinaryString(number);
        int length = binary.length();
        for (int i = 0; i < length / 2; i++) {
            if (binary.charAt(i) != binary.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (Binary_palindrome(number)) {
            System.out.println(number + " is a binary palindrome.");
        } else {
            System.out.println(number + " is not a binary palindrome.");
        }
    }
}                        
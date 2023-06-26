import java.util.Scanner;

public class Strobogrammatic_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String number = sc.next();
        boolean Strobogrammatic = StrobogrammaticNumber(number);
        System.out.println(number + " is a strobogrammatic number: " + Strobogrammatic);
    }

    public static boolean StrobogrammaticNumber(String number) {
        int left = 0;
        int right = number.length() - 1;

        while (left <= right) {
            char leftDigit = number.charAt(left);
            char rightDigit = number.charAt(right);

            if (!StrobogrammaticPair(leftDigit, rightDigit)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static boolean StrobogrammaticPair(char c1, char c2) {
        return (c1 == '0' && c2 == '0') ||
                (c1 == '1' && c2 == '1') ||
                (c1 == '8' && c2 == '8') ||
                (c1 == '6' && c2 == '9') ||
                (c1 == '9' && c2 == '6');
    }
}

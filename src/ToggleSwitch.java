import java.util.Scanner;

public class ToggleSwitch {

    public static int[] TakeUserInput() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }


    public static int countOn(int[] arr) {
        int n = arr.length;
        int[] steps = new int[n];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j + 1) % i == 0) {
                    steps[j] = 1 - steps[j];
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (steps[i] == 1) {
                count++;
            }
        }

        return count;
    }

    public static int countOn2(int [] arr) {
        int count = 0;
        for (int num : arr) {
            int sqrt = (int) Math.sqrt(num);
            if (sqrt * sqrt == num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = TakeUserInput();
        int result = countOn2(arr);

        System.out.println("The number of switches that are on: " + result);
    }
}
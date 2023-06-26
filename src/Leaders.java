import java.util.Scanner;

public class Leaders {

    public static int[] TakeUserInput() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.print("\nEnter array element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        return arr;
    }


    public static void Leader_Naive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(arr[i] + " ");
        }
    }


    public static void Leader_Efficient(int[] arr) {
        int n = arr.length;
        int current_Leader = arr[n - 1];

        System.out.print(current_Leader + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (current_Leader < arr[i]) {
                current_Leader = arr[i];
                System.out.print(current_Leader + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = TakeUserInput();

//        Leader_Naive( arr );

        Leader_Efficient(arr);
    }
}
// Swap Two 4 bits in binary
public class BitSwap {
    public static int swapBits(int num, int pos1, int pos2) {
        // Get the bits at the specified positions
        int bit1 = (num >> pos1) & 1;
        int bit2 = (num >> pos2) & 1;

        // Check if the bits are different before swapping
        if (bit1 != bit2) {
            // Create masks to clear the bits at the specified positions
            int mask1 = 1 << pos1;
            int mask2 = 1 << pos2;

            // XOR the masks to toggle the bits
            num = num ^ (mask1 | mask2);
        }

        return num;
    }

    public static void main(String[] args) {
        int number = 38; // Binary: 100110

        int swappedNumber = swapBits(number, 1, 4);

        System.out.println("Original number: " + number);
        System.out.println("Swapped number: " + swappedNumber);
    }
}
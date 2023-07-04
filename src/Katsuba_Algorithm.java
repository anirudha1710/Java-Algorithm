import java.math.BigInteger;

public class Katsuba_Algorithm {
    public static BigInteger multiply(BigInteger x, BigInteger y) {
        // Base case: if either x or y is a single digit, perform regular multiplication
        if (x.compareTo(BigInteger.TEN) < 0 || y.compareTo(BigInteger.TEN) < 0) {
            return x.multiply(y);
        }

        // Determine the number of digits in the numbers
        int n = Math.max(x.bitLength(), y.bitLength());
        int half = (n + 32) / 64 * 32;

        // Split the numbers into smaller parts
        BigInteger mask = BigInteger.ONE.shiftLeft(half).subtract(BigInteger.ONE);
        BigInteger a = x.shiftRight(half);
        BigInteger b = x.and(mask);
        BigInteger c = y.shiftRight(half);
        BigInteger d = y.and(mask);

        // Recursively compute the products of the smaller parts
        BigInteger ac = multiply(a, c);
        BigInteger bd = multiply(b, d);
        BigInteger abcd = multiply(a.add(b), c.add(d));
        BigInteger adbc = abcd.subtract(ac).subtract(bd);

        // Combine the products using Kātsuba's formula
        BigInteger result = ac.shiftLeft(half).add(adbc.shiftLeft(half / 2)).add(bd);
        return result;
    }

    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("123456789123456789");
        BigInteger num2 = new BigInteger("987654321987654321");
        BigInteger multiplicationResult = multiply(num1, num2);
        System.out.println("Multiplication result: " + multiplicationResult);
    }
}


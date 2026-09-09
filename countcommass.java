import java.util.*;

public class Main {

    public static long countCommas(long n) {
        long ans = 0;

        // 1,000 to 999,999 -> 1 comma
        // 1,000,000 to 999,999,999 -> 2 commas
        // etc.

        long start = 1000;
        long commas = 1;

        while (start <= n) {

            long end = start * 1000 - 1;

            // Avoid overflow for very large n
            if (end < start || end > n) {
                end = n;
            }

            long count = end - start + 1;

            ans += count * commas;

            if (end == n) {
                break;
            }

            start = start * 1000;
            commas++;
        }

        return ans;
    }

    public static void main(String[] args) {

        long n = 1002;

        long result = countCommas(n);

        System.out.println(result);
    }
}

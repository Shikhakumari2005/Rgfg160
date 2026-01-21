public class hrbeautifuldaysatmovie {
    public static int beautifulDays(int i, int j, int k) {
        int count = 0;
    
        for (int x = i; x <= j; x++) {
            int rev = reverse(x);
            if (Math.abs(x - rev) % k == 0) {
                count++;
            }
        }
        return count;
    }
    
    private static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        beautifulDays(20, 26, 6);
    }    
}

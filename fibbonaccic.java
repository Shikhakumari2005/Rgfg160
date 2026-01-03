public class fibbonaccic {
    
        public static int fib(int n) {
            if (n == 0) return 0; // base case 
            if (n == 1) return 1; // base case 
            return fib(n - 1) + fib(n - 2); // recursion
        }
    
        public static void main(String[] args) {
            int result = fib(6);
            System.out.println("fib is: " + result);
        }
}
    


import java.util.Arrays;

public class add1 {
        public static int[] plusOne(int[] digits) {
            int carry=1;             //because we want to add 1 to the number.
    
    
            for (int i = digits.length - 1; i >= 0; i--) {       //This is because addition starts from the rightmost digit
                if (digits[i]+carry <= 9) {
                    digits[i]++; 
                    carry=0;
                    return digits; // no carry, done
                }
                digits[i] = 0; // set to 0 and carry over
                carry=1;
            }
            
            // If we reach here, all digits were 9
            int[] result = new int[digits.length + 1];
            result[0] = 1; // e.g. 999 -> 1000
            return result;
        }
        public static void main(String[] args){
            int[] digits={1,2,3};
            int[] result = plusOne(digits);
           // System.out.println(Arrays.toString(result)); // If you just do System.out.println(result);, you’ll see something like [I@15db9742 (a memory reference), not the actual elements.
           for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 1 2 4
        
        }
}
    


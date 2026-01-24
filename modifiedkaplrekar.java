public class modifiedkaplrekar {
    public static void kaprekarNumbers(int p, int q) {
         boolean found = false;

        for (int i = p; i <= q; i++) {

           long sq = (long) i * i;
           String s = String.valueOf(sq);

           int mid = s.length() / 2;

           int left = (mid == 0) ? 0 : Integer.parseInt(s.substring(0, mid));
           int right = Integer.parseInt(s.substring(mid));

           if (left + right == i) {
             System.out.print(i + " ");
             found = true;
            }
        }
    }
    public static void main(String[] args){
          kaprekarNumbers(1, 100);
    }

}

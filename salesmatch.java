import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class salesmatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
            if (ar == null || ar.isEmpty()) {
                return 0;
            }
            int count=0;
            Collections.sort(ar);
            for(int i=0;i<ar.size()-1;i++){
                if(ar.get(i).equals(ar.get(i+1))){
                    count++;
                    i++;
                }
            }
            return count;
                
        }
        public static void main(String[] args){
            List<Integer> ar=new ArrayList<>();
            ar.add(10);
            ar.add(10);
            ar.add(20);
            ar.add(30);
            ar.add(10);
            ar.add(20);
            sockMerchant(0,ar);



        }
}

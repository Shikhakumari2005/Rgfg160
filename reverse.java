import java.util.ArrayList;
import java.util.List;

public class reverse {
    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
       //Collections.reverse(a);
       ArrayList<Integer> ans=new ArrayList<>();

        //swap
        for(int i=0;i<a.size();i++){
         int temp=a.get(i);
         a.set(i,a.get(i));
         
         ans.add(i);
        }
        return ans;
       
    }
    public static void main(String[] args){
        List<Integer> a=new ArrayList<>();
        a.add(12);
        a.add(22);
        a.add(32);
        a.add(42);
        int[] res=reverseArray(a);
        for(int el:res){
            System.out.println(res +" ");
        }

    }
}

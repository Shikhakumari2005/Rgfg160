import util.java.List;
import util.java.Arraylist;
public class findmidian{
    public static void main(String[] args) {
        List<Integer>arr=new Arraylist<>();
        Collections.sort(arr);  
        int n = arr.size();
        System.out.print(arr.get(n / 2));   // return median value

    }
}
import java.util.*;
public class breakingrecord {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
             int max=scores.get(0);
             int min=scores.get(0);
             int minc=0;
             int maxc=0;
            //for(int i=0;i<scores.size();i++){
            for(int i=1;i<scores.size();i++){
                if(max<scores.get(i)){
                    maxc++;
                    max=scores.get(i);
                }
                if(min>scores.get(i)){
                    minc++;
                    min=scores.get(i);
                }
             } 
             return Arrays.asList(maxc, minc);
    }
    public static void main(String[] args){
       // List<Integer> scores=new ArrayList<>();
        // scores.add(10);
        // scores.add(5);
        // scores.add(20);
        // scores.add(10);
        // scores.add(30);
        // scores.add(4);
        // scores.add(30);
        // scores.add(10);
        List<Integer> scores =Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
        //List<Integer> scores = new ArrayList<>(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1));

        // The ArrayList constructor does not accept elements.

        // In Java, new ArrayList<>(10) only sets the initial capacity (how much space to reserve), not the contents.
        
        // That’s why the compiler complains: there is no constructor ArrayList(int, int, int, …).










        List<Integer> result = breakingRecords(scores); 
        System.out.println("Max record breaks: " + result.get(0)); 
        System.out.println("Min record breaks: " + result.get(1));
        breakingRecords(scores);
        
    }
}

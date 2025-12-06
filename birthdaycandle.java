import java.util.ArrayList;
import java.util.List;

public class birthdaycandle {
     public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
        // int high=Integer.MIN_VALUE;
        // int count=0;
    //     for(int i=0; i<candles.size();i++){
    //         if(candles.get(i)>=high){
    //             high=candles.get(i);
    //             count++;
    //         }
    //     }
    //     System.out.println(count);
    //     return count;
    // }
    
        // Write your code here
            int high=0;
            int count=0;
            for(int i=0; i<candles.size();i++){
                if(candles.get(i)>high){
                    high=candles.get(i);
                }
            }
            for(int highmax:candles){
                if(highmax==high){
                    count++;
                }
                
            }
            System.out.println(count);
            return count;
        }
    public static void main(String[] args){
        List<Integer> candles=new ArrayList<>();
        candles.add(3);
        candles.add(2);
        candles.add(4);
        candles.add(4);
        candles.add(1);
        birthdayCakeCandles(candles);

    }
}

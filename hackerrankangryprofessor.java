import java.util.ArrayList;
import java.util.List;

public class hackerrankangryprofessor {
    public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
        int cp=0;
        int cn=0;
        for(int i=0; i<a.get(i);i++){
            if(a.get(i)>=0){
                cn++;
            }else{
                cp++;
            }
        }
        if(cp<k && cn>=k){
            return "NO";
        }else{
            return "YES";
        }
    }
    public static void main(String[] args){
        List<Integer>a=new ArrayList<>();
        a.add(1);
        a.add(-1);
        a.add(12);
        a.add(-13);
        a.add(15);
        a.add(19);
        angryProfessor(3, a);
    }
}

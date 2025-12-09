import java.util.ArrayList;
import java.util.List;
class merger{
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
            ArrayList<Integer> ans=new ArrayList<>(grades);
            for(int i=0;i<ans.size();i++){
                int newval;
                if(ans.get(i)>=38){
                    int k=ans.get(i)/5+1;
                    int d=(5*k)-ans.get(i);
                    if(d>=3){
                        newval=ans.get(i);
                        
                    }else{
                        newval=5*k;
                    }  
                }else{
                    newval=ans.get(i);
                }
            int res= ans.set(i, newval);
            }return ans;
            
        
    }
    public static void main(String[] args){
        List<Integer> grades=new ArrayList<>();
        grades.add(56);
        grades.add(66);
        grades.add(23);
        grades.add(33);
        gradingStudents(grades);
        // for(int elm:ans){
        //     System.out.println(elm +"");
        // }



    }
}

public class breakingrecord {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
             int max=scores.get(0);
             int min=scores.get(0);
             int minc=0;
             int maxc=0;
             for(int i=0;i<scores.size();i++){
                if(max<scores.get(i)){
                    maxc++;
                    max=scores.get(i);
                }
                if(min>scores.get(i)){
                    minc++;
                    min=scores.get(i);
                }
             } 
                return Arrays.asList(maxc, minc)
}

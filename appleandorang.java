public class appleandorang {
    public static int count(int s, int t, int apple[], int orange[], int a, int b){
        int appc=0;
        int oranc=0;
        for(int i=0; i<apple.length;i++){
            int dis=apple[i]+ a;
            if(dis>=s && dis<=t){
                appc++;
            }
        }
        for(int i=0; i<orange.length;i++){
            int dis=orange[i]+ b;
            if(dis>=s && dis<=t){
                oranc++;
            }
        }
        System.out.println(appc+""+oranc);
        return appc+ oranc;
    }
    public static void main(String[] args){
            int apple[] ={2,-3,5};
            int orange[] ={4,-2,-4};
            count(4, 10, apple, orange, 2, 5);
        
    }
}

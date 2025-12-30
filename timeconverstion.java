public class timeconverstion {
    public static String TimeCon(String s){
        String str=" ";
        if(s.substring(0,2).equals("12") && s.contains("AM")){
            str="00";
            s=str + s.substring(2,s.length());
        }
        if(!s.substring(0,2).equals("12") && s.contains("PM")){
            str=Integer.toString(Integer.parseInt(s.substring(0,2)) + 12);
            s=str + s.substring(2,s.length());
        }
        System.out.println(s.substring(0,s.length()-2));
        return s.substring(0,s.length()-2);
    }
    public static void main(String[] args){
        String s="01:19:48:PM";
        TimeCon(s);
        
    }

}

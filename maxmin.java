class maxmin{
    public static int miniMaxSum(int[] arr) {
    // Write your code here
       // ArrayList<Integer> ans=new ArrayList<>(arr);
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
             max=Math.max(max,sum);
             min=Math.min(min,sum);
            //System.out.println(min);
            
        }
        System.out.println(sum);
        for (int j = 1; j <=arr.length ; j++) {
            int ans= sum- j;
            if(ans<max){
                max=ans;
                //min=Math.min(min,ans);
                System.out.println(max);
            }else if(ans>min){
                min=ans;
                // max=Math.max(max,ans);
                System.out.println(min);
            }
            min=Math.min(min,ans);
            max=Math.max(max,ans);
            System.out.println(ans);
            // min=Math.min(min,ans);
            // max=Math.max(max,ans);
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        miniMaxSum(arr);
    }

}

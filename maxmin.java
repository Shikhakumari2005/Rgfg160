class maxmin{
    public static void miniMaxSum(int[] arr) {
    // Write your code here
       // ArrayList<Integer> ans=new ArrayList<>(arr);
        int sum=0;
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            sum =Math.max(sum + arr[i], sum);
            // max=Math.max(sum,max);
            // min=Math.min(sum,min);
        }
        System.out.println(sum);
        int ansmax=Integer.MIN_VALUE;
        int ansmin=Integer.MAX_VALUE;
        for (int j = 1; j <= arr.length; j++) {
            ansmax=Math.max(sum-j ,ansmax);
            ansmin=Math.min(ansmin,sum-j);
            //min=Math.min(ans,min);
            
        }
        System.out.println(ansmax);
        System.out.println(ansmin);
        
    }
    public static void main(String[] args){
        int[] arr={4,5,89,23,19};
        miniMaxSum(arr);
    }

}


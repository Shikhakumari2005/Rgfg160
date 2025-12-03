public class RotedsortedMin {
    public static int MinNrotedsorted(int[] arr){
        int l=0;
        int h=arr.length-1;
        int mid=(l+h)/2;
        int ans=Integer.MAX_VALUE;
        while(l<=h){
            
            if(arr[l]<=arr[mid]){
                ans=Math.min(ans, arr[l]);
                l=mid+1;           
            }else{
                h=mid-1;
                ans=Math.min(ans, arr[h]);
            }
        }
        return ans;
    }



//linear search 
    // public static int MinNrotedsorted(int[] arr){
    //     int ans=Integer.MAX_VALUE;
    //     for (int i = 0; i < arr.length; i++) {
    //         ans=Math.min(ans, arr[i]);
            
    //     }
    //     return ans;
    // }

    public static void main(String[] args) {
        int[] arr={6,7,8,9,1,2,2,3,4,5};
        System.out.println(MinNrotedsorted(arr));
    }
}

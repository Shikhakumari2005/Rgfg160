public class searchsortedrote {
    public static int searotedsort(int[] arr ,int tar){
        int l=0;
        int h=arr.length-1;
        while(l<h){
            int mid=(l+h)/2;
            if(arr[l]<arr[mid]){
                System.out.println("it is sorted arr");
            }
        }

    }
    public static void main(String[] args){
        int[] arr={6,7,8,9,1,2,3,4};

    }
}

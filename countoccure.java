class countoccure{

//APPROACH LINEAR SEARCH
    // public static int Nooccurrence(int[] arr, int target){
    //     int count=0;
    //     for(int i=0; i<arr.length;i++){
    //         if(arr[i]==target){
    //             count++;

    //         }
    //     }
    //     return count;
    // }




//BINARY SEARCH

    public static int Nooccurrence(int[] arr, int target){
        int l=arr[0];
        int h=arr.length-1;
        int mid=(l+h)/2;
        int count=0;
        while(l<h){
            if(arr[mid]>=arr[l]){
                while(l<mid){
                    if(arr[l]==target){
                        l++;
                        count++;
                    }
                    else if(mid<h){
                        mid++;
                        count++;
                    }
                }
            }else if(arr[mid]>target){
                h=mid-1;
                count++;
            }else{
                l=mid+1;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={2,2,2,3,3,3,3,3,4,4,5,6,6};
        int target=4;
        System.out.println(Nooccurrence(arr, 4));
    }
}
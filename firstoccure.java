class firstoccure{
    public static int Nooccurrence(int[] arr, int target){
        int count=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                count++;

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={2,2,2,3,3,3,3,3,4,4,5,6,6};
        int target=3;
        System.out.println(Nooccurrence(arr, 3));
    }
}
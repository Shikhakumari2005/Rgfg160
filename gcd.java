public class gcd {
    public static int GCD(int a,int b){
        
    //recursion
        // if(a==0) return b;
        // return GCD(b%a,a);




        int hcf=0;
        for(int i=1;i<Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        return hcf;
    }
    public static void main(String[] args) {
        int result=GCD(24,12);
        System.out.println(result);



        // GCD(51,41);
        // System.out.println(hcf);

//error hcf is a local variable inside the GCD method.

//It does not exist in main, so this line will cause a “cannot find symbol” compilation error.

//✅ Fix: Capture the return value of GCD in ma

    }
}

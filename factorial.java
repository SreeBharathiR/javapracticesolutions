public class factorial {
    public static void fact(int n,int f){
        if(n==1 || n==0){
            System.out.println(f);
            return;
        }
        f=f*n;
        fact(n-1,f);
       
    }
    public static void main(String args[]){
        int n=10;
        fact(n,1);
    }
}

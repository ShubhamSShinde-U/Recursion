public class fibonacci {
    public static void fibo(int n1,int n2,int n){
        if(n==0){
            return ;
        }
        int c=n1+n2;
        System.out.println(c);
        fibo(n2,c,n-1);
    }
public static void main(String []argc){
    int n=8;
    System.out.println(0);
    System.out.println(1);
    fibo(0,1,n-2);
}
}
